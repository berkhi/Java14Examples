package com.bilgeadam.lesson010.product;

import com.bilgeadam.lesson010.product.messages.ErrorMessage;
import com.bilgeadam.lesson010.product.messages.SuccessMessage;

import javax.security.sasl.SaslClient;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Product[] products = new Product[30];

    static Cart cart = new Cart();

    static Scanner scanner = new Scanner(System.in);

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

        menu();


    }

    public static void databaseyeUrunYolla() {
        Product product = new Product("Apple", 0, 3000);
        Product product2 = new Product("Asus", 3, 2000);
        Product product3 = new Product("Huwaei", 2, 1000);

        products[Product.toplamUrunSayisi] = product;
        Product.toplamUrunSayisi++;

        products[Product.toplamUrunSayisi] = product2;
        Product.toplamUrunSayisi++;

        products[Product.toplamUrunSayisi] = product3;
        Product.toplamUrunSayisi++;

    }


    public static Product addProduct() {


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
            if (products[i].isActive()) {
                System.out.printf("""
                        Product Code: %s
                        Urun ismi: %s
                        Urun stock: %d""", products[i].getProductCode(), products[i].getName(), products[i].getStock());
                System.out.println();
            }
        }
    }

    public static void sepeteEklemeIslem() {
        showProducts();
        System.out.println("Almak İstediğniz Ürünün Product Kodunu girin: ");
        String code = scanner.nextLine();

        for (int i = 0; i < Product.toplamUrunSayisi; i++) {
            if (products[i].getProductCode().equals(code) && products[i].isActive()) {
                Product product = products[i];
                cart.sepeteEkle(product);
                System.out.println(SuccessMessage.SUCCESS_ADD_CART);
                return;
            }
        }
        System.out.println(ErrorMessage.PRODUCT_NOT_FOUND);
    }

    public static void showCart() {
        System.out.println("Sepet Tutarı " + cart.getTotalPrice());
        for (int i = 0; i < cart.getProductsNumber(); i++) {
            System.out.println("Ürün: " + cart.getProducts()[i].getName());
        }
    }


    //Menu
    //1 - ProductEkle
    //2- Ürün ismine Göre arama yapsın Asusun tüm bilgileri --> fiyat stock
    //3- Fiyat listesi --> ürün ismi : ()  ürünün Fiyatı()
    //4- Sepete Ekle
    //5- Sepeti görüntülesin

    //6-

    public static void menu() {

        boolean check = true;
        while (check) {
            System.out.println("1- Product Ekle");
            System.out.println("2- Ürünün İsmine Göre arama yap");
            System.out.println("3- Fiyat listesi");
            System.out.println("4- Sepete Ürün Ekle");
            System.out.println("5- Sepeti Görüntüle");
            System.err.println("6- Belirtilen ürüne İndirim uygulayalım %10");

            int value = scanner.nextInt();

            scanner.nextLine();
            switch (value) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    findProductByName();
                    break;
                case 3:
                    priceList();
                    break;
                case 4:
                    sepeteEklemeIslem();
                    break;
                case 5:
                    showCart();
                    break;
                case 6:
                    showProducts();
                    discountForProduct(findProductByName());
                    break;
                case 0:
                    check = false;
                    break;
            }
        }
    }

    private static void discountForProduct(Product product) {
        if(product != null){
            product.setPrice(product.getPrice() * Product.NORMAL_DISCOUNT);
        }else {
            System.out.println(ErrorMessage.PRODUCT_NOT_FOUND);
        }
    }

    private static Product findProductByName() {

        System.out.println("ürün ismini Girin: ");
        String productName = scanner.nextLine();

        for (int i = 0; i < Product.toplamUrunSayisi; i++) {
            if (products[i].getName().equalsIgnoreCase(productName)) {
                System.out.println(products[i]);
                return products[i];
            }
        }
        return null;
    }

    private static void priceList() {
        for (int i = 0; i < Product.toplamUrunSayisi; i++) {
            System.out.println("Ürün ismi: " + products[i].getName() + " Fiyatı " + products[i].getPrice());
        }
    }


}
