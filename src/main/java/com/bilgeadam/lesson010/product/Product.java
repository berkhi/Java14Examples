package com.bilgeadam.lesson010.product;

import com.bilgeadam.lesson010.product.util.RandomGenerateCode;

public class Product {
    private String id;
    private String name;
    private String productCode;
    private int stock;
    private boolean isActive;
    private double price;
    public static int toplamUrunSayisi;

    public Product(String name, int stock, double price) {
        this.id = RandomGenerateCode.randomGenerateId();
        this.name = name;
        this.productCode = RandomGenerateCode.randomProductCodeGenerator(name);
        this.stock = stock;
        this.isActive = true;
        this.price = price;
    }

    public static int getToplamUrunSayisi() {
        return toplamUrunSayisi;
    }

    public static void setToplamUrunSayisi(int toplamUrunSayisi) {
        Product.toplamUrunSayisi = toplamUrunSayisi;
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

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }


    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
