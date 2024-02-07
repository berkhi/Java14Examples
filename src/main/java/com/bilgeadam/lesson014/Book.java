package com.bilgeadam.lesson014;

import java.util.UUID;

public class Book {
    private String id;
    private String name;
    private String authorName;
    private String publisher;
    private double price;
    private Category category;

    public Book(String name, String authorName, String publisher, double price, Category category) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.authorName = authorName;
        this.publisher = publisher;
        this.price = price;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", authorName='" + authorName + '\'' +
                ", publisher='" + publisher + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}
