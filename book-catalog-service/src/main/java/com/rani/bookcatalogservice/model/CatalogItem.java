package com.rani.bookcatalogservice.model;

public class CatalogItem {

    private String bookName;
    private String author;
    private int ratings;

    public CatalogItem() {
    }

    public CatalogItem(String bookName, String author, int ratings) {
        this.bookName = bookName;
        this.author = author;
        this.ratings = ratings;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }
}
