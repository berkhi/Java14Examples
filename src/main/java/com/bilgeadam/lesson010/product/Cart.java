package com.bilgeadam.lesson010.product;

public class Cart {
    private double totalPrice;
    private Product[] products = new Product[10];

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
}
