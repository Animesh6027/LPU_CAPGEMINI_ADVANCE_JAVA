package com.example.libraryManagementSystem.Model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class Book {
    private long id;

    @NotBlank
    private String title;

    @NotBlank
    private String author;

    @Min(value = 1, message = "Price must be greater than zero")
    private double price;
    public Book() {}
    public Book(long id, String title, String author, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
