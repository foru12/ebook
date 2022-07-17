package com.example.testone.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataBest {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("author")
    @Expose
    private String author;
    @SerializedName("price")
    @Expose
    private Double price;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("rate")
    @Expose
    private DataRate rate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public DataRate getRate() {
        return rate;
    }

    public void setRate(DataRate rate) {
        this.rate = rate;
    }

}