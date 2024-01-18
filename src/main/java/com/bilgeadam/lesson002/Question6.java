package com.bilgeadam.lesson002;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {


        //ctrl + alt + l kodu formatlar

        //kullanıcdan alınan vize ve final notlarını hesaplayarak geçip geçmediğini bulalım
        //vize %40
        //final %60
        //ort 50 den küçükse öğrenci kalsın kalsın


        //(-) kontrolü yapalım
        //100 den büyük değer giremesi lazım

        Scanner scanner = new Scanner(System.in);

        double vizeOrani = 0.4;
        double finalOrani = 0.6;
        int gecmeNotu = 50;


        System.out.println("Vize notunu girin: ");
        double vize = scanner.nextDouble();

        //boolean  vizeNotuDogruMu = (vize >= 0 && vize <=100) ? true : false;


        System.out.println("Final notunu girin: ");
        double finalNotu = scanner.nextDouble();

        //boolean  finalNotuDogruMu = (finalNotu >= 0 && finalNotu <=100) ? true : false;

        double ortalama = (vize * vizeOrani) + (finalNotu * finalOrani);


        // vize 50
        //final 50
        // true        //   true           //true      //true
        if (vize >= 0 && finalNotu >= 0 && vize <= 100 && finalNotu <= 100) {
            if (ortalama > gecmeNotu) {
                System.out.println("Geçtiniz " + ortalama);
            } else {
                System.out.println("Kaldınız " + ortalama);
            }
        } else {
            System.out.println("Girdiğiniz değerler 0 ile 100 arasında olmak zorundadır");
        }


        //String sonuc = ortalama > gecmeNotu ? "Geçtiniz " + ortalama : "Kaldınız: " + ortalama;
        //System.out.println(sonuc);

    }
}
