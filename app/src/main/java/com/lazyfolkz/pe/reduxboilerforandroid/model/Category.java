package com.lazyfolkz.pe.reduxboilerforandroid.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by qburst on 16/3/17.
 */

public class Category {
    @SerializedName("id")
    int id;

    @SerializedName("name")
    String name;

    @SerializedName("description")
    String description;

    @SerializedName("icon_url")
    String iconUrl;

    @SerializedName("child_book")
    ArrayList<BookIndex> childBooks;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<BookIndex> getChildBooks() {
        return childBooks;
    }

    public String getDescription() {
        return description;
    }

    public String getIconUrl() {
        return iconUrl;
    }
}
