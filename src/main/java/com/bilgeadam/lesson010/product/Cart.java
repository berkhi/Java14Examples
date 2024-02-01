package com.bilgeadam.lesson010.product;

public class Cart {
    private double totalPrice;
    private Product[] products = new Product[10];

    private int productsNumber = 0;


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

    public int getProductsNumber() {
        return productsNumber;
    }

    public void setProductsNumber(int productsNumber) {
        this.productsNumber = productsNumber;
    }

    public void sepeteEkle(Product product) {
        if (product.isActive()) {
            if (this.productsNumber >= 10) {
                System.out.println("Sepeteinizde yer yoktur");
            } else {
                products[productsNumber] = product;
                productsNumber++;

                this.totalPrice += product.getPrice();
                product.setStock(product.getStock() - 1);

                if (product.getStock() <= 0) {
                    product.setActive(false);
                }

            }
        } else {
            System.out.println("Ürün Stokta kalmadı");
        }


    }
}
