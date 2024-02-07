package com.bilgeadam.lesson014;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private List<Book> bookList;
    private List<Customer> customerList;


    public Library(String name) {
        this.name = name;
        bookList = new ArrayList<>();
        customerList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }
}
