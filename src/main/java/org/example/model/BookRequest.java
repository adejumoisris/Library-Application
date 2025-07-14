package org.example.model;

public class BookRequest {
   private User user;
    private String bookTitle;
    private long timeStamp;

    public BookRequest(User user, String bookTitle) {
        this.user = user;
        this.bookTitle = bookTitle;
        this.timeStamp = timeStamp;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public String toString() {
        return "BookRequest{" +
                "user=" + user +
                ", bookTitle='" + bookTitle + '\'' +
                ", timeStamp=" + timeStamp +
                '}';
    }
}
