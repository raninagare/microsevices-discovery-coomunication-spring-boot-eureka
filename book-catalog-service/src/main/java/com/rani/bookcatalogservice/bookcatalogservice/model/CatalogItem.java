package com.rani.bookcatalogservice.bookcatalogservice.model;

public class CatalogItem {

    private String bookName;
    private String bookDescr;
    private int ratings;

    public CatalogItem() {
    }

    public CatalogItem(String bookName, String bookDescr, int ratings) {
        this.bookName = bookName;
        this.bookDescr = bookDescr;
        this.ratings = ratings;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookDescr() {
        return bookDescr;
    }

    public void setBookDescr(String bookDescr) {
        this.bookDescr = bookDescr;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }
}
