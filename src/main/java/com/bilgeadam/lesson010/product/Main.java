package com.bilgeadam.lesson010.product;

import javax.security.sasl.SaslClient;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Product[] products = new Product[30];

    static Cart cart = new Cart();
    
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

        //Menu
        //1 - ProductEkle
        //2- Ürün ismine Göre arama yapsın Asusun tüm bilgileri --> fiyat stock
        //3- Fiyat listesi --> ürün ismi : ()  ürünün Fiyatı()
        //4- Sepete Ekle
        //5- Sepeti görüntülesin

        databaseyeUrunYolla();
        addProduct();
        addProduct();
        addProduct();

        sepeteEklemeIslem();

        showCart();


    }

    public static void databaseyeUrunYolla(){
        Product product = new Product("Appel",52,15);
        Product product2 = new Product("Appel",52,15);
        Product product3 = new Product("Appel",52,15);

        products[Product.toplamUrunSayisi] = product;
        Product.toplamUrunSayisi++;

        products[Product.toplamUrunSayisi] = product;
        Product.toplamUrunSayisi++;

        products[Product.toplamUrunSayisi] = product;
        Product.toplamUrunSayisi++;

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

    public static void sepeteEklemeIslem(){
        Scanner scanner = new Scanner(System.in);
        showProducts();
        System.out.println("Almak İstediğniz Ürünün Product Kodunu girin: ");
        String code = scanner.nextLine();

        for (int i = 0; i < Product.toplamUrunSayisi; i++) {
            if(products[i].getProductCode().equals(code)){
                Product product = products[i];
                cart.sepeteEkle(product);
            }else {
                System.out.println("Girdiğiniz ürün yoktur");
            }
        }
    }
    
    public static void showCart(){
        for (int i = 0; i < cart.getProductsNumber(); i++) {
            System.out.println("Ürün: " + cart.getProducts()[i].getName());
        }
    }






}
