package com.bilgeadam.lesson014;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User {
    private String id;
    private String phoneNumber;
    private String identityNumber;
    private double balance;
    private List<Book> rentedBooks;

    public Customer(String username, String password, String phoneNumber, String identityNumber, double balance) {
        super(username, password);
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.identityNumber = identityNumber;
        this.balance = balance;
        rentedBooks = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public List<Book> getRentedBooks() {
        return rentedBooks;
    }

    public void setRentedBooks(List<Book> rentedBooks) {
        this.rentedBooks = rentedBooks;
    }
}
