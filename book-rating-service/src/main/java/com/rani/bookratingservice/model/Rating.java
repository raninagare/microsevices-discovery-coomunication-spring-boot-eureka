package com.rani.bookratingservice.model;

public class Rating {

    private String bookId;
    private String userId;
    private int rating;

    public Rating() {
    }

    public Rating(String bookId, String userId, int rating) {
        this.bookId = bookId;
        this.userId = userId;
        this.rating = rating;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
