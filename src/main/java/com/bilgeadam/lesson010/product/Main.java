package com.bilgeadam.lesson010.product;

import javax.security.sasl.SaslClient;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Product[] products = new Product[30];

    public static void main(String[] args) {


        //product ekle diye bir metot yazalım
        //kullanıcıdan alcaz

        //farklı bir paket içine random Id üreten bir metot yazalım
        //nesneyi ürettiğim zaman ID filedi otomatik setlensin.
        //id --> 5 haneli bir random sayı olsun

        //Product kodu kullanıcdan almicaz
        //Product nesnesi oluştuduğum zaman otomatik setlencek
        //Örnek
        //ProductName--> AkıllıBardak
        //Product Code --> Akı(58149 Random Sayı)


        //Sepete Ekle Methodu
        //kullanıcıya hangi ürünü almak istiyorsanız o ürünün productIdsini belirtin
        //bana gelen prdouct koduyla productı bulmam laızm

        //her sepete ekllediğim ürünü fiyatı kadar totalPricem güncellencek,
        //Stock 0 a geldiyse ürünü yayından kaldırcak
        //Her sepete ekleme işlmeinde ürünün stokunu azaltalım.
        //eğer kullanıcı 10 taneden fazla ürün sepete ekleiyosa sepette yer kalmadı diye bilgi verelim


        addProduct();
        addProduct();
        addProduct();

        showProducts();


    }


    public static Product addProduct() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Product Name: ");
        String productName = scanner.nextLine();

        System.out.println("Product Stock: ");
        int stock = scanner.nextInt();

        System.out.println("Product Price: ");
        double price = scanner.nextDouble();


        Product product = new Product(productName, stock, price);


        products[Product.getToplamUrunSayisi()] = product;

        Product.toplamUrunSayisi++;
        return product;
    }

    public static void showProducts() {
        for (int i = 0; i < Product.toplamUrunSayisi; i++) {

            System.out.printf("""
                    Product Code: %s
                    Urun ismi: %s
                    Urun stock: %d""", products[i].getProductCode(), products[i].getName(), products[i].getStock());
            System.out.println();
        }
    }




}
