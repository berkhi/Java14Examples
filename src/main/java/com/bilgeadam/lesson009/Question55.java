package com.bilgeadam.lesson009;

public class Question55 {
    public static void main(String[] args) {

        // Doğum yılınızı girerek yasınızı ve
        // hangi yüzyılda doğdugunu hesaplayan metotları yazalım

        // 3 farklı metot yazıcaz
        // yasHesapla
        // yuzYıl hesapla
        // bilgileriyazdır

        // bilgileriYazdir(1992);
        // hangi yüzyilda hemde yasını söylicek

        bilgileriYazdir(1998);


    }


    public static int yasHesapla(int dogumYili) {
        return 2024 - dogumYili;
    }

    public static int yuzYilHesapla(int dogumYili) {
        return (dogumYili / 100) + 1;
    }

    public static void bilgileriYazdir(int dogumYili) {
        int yas = yasHesapla(dogumYili);
        int yuzyil = yuzYilHesapla(dogumYili);

        System.out.println("yasınız: " + yas + " yüzyıl" + yuzyil);
    }
}
