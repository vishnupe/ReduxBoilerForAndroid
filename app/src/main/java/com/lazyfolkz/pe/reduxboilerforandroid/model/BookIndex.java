package com.lazyfolkz.pe.reduxboilerforandroid.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Sreehari on 30/1/17.
 */

public class BookIndex {
    @SerializedName("book_id")
    private int bookId;

    @SerializedName("book_title")
    private String bookTitle;

    @SerializedName("book_description")
    private String description;

    @SerializedName("is_series")
    private boolean isSeries;

    @SerializedName("book_icon_url")
    private String bookIconUrl;

    @SerializedName("orientation")
    private String screenOrientations;

    public String getScreenOrientations() {
        return screenOrientations;
    }



    public String getBookIconUrl() {
        return bookIconUrl;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getDescription() {
        return description;
    }

    public boolean isSeries() {
        return isSeries;
    }
}
