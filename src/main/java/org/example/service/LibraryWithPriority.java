package org.example.service;

import org.example.model.*;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class LibraryWithPriority {
    private Map<String, Book> books = new HashMap<>();
    private PriorityQueue<BookRequest> queue = new PriorityQueue<>(new Comparator<BookRequest>() {
        @Override
        public int compare(BookRequest o1, BookRequest o2) {
            User u1 = o1.getUser();
            User u2 = o2.getUser();
            // Comparison between Teacher and Students
            if (u1 instanceof Teacher && !(u2 instanceof Teacher)) return -1 ; // emma
            if (!(u1 instanceof Teacher) &&  u2 instanceof Teacher) return 1; // emma

            // Comparison between Student  and Students
            if (u1 instanceof  Student && u2 instanceof Student){
                return Integer.compare(((Student)u2).getLevel(),((Student)u1).getLevel());
            }
            return Long.compare(o1.getTimeStamp(), o2.getTimeStamp() );
        }

    });

    public void addbook(String title, int copies){
            books.put(title, new Book(title, copies));
        }

        public void requestBook(User user, String title){
            queue.offer(new BookRequest(user,title));
        }

        public String serveNextRequest(){
            if (queue.isEmpty()) return "No request ";

            BookRequest request = queue.poll();
            Book book = books.get(request.getBookTitle());

            if (book == null || !book.hasAvailableCopy()) return  "Book has been taken";
            book.borrow();
            return  request.getUser().getName() + " Borrowed " + request.getBookTitle();
        }

}
