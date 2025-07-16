package org.example.service;

import org.example.model.Book;
import org.example.model.BookRequest;
import org.example.model.User;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class LibraryWithOutPriority {
    private Map<String, Book>  books = new HashMap<>();
    private Queue<BookRequest> queue = new LinkedList<>();

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
