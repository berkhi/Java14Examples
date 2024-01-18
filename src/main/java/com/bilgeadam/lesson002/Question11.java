package com.bilgeadam.lesson002;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {

        // 1- Toplama
        // 2- Çıakrma
        // 3- Çarpma
        // 4- Bölme

        //kullanıcıdan 2 tane sayı alcaz
        //1 e basarsa toplama



        Scanner scanner = new Scanner(System.in);
        System.out.println("iki sayı girin");

        double sayi1 = scanner.nextInt();
        double sayi2 = scanner.nextInt();

        int toplamaIslemi = 1;

        System.out.println("Hangi işlemi yapmak istersiniz");
        System.out.println("1- Toplama");
        System.out.println("2- Çıkarma");
        System.out.println("3- Çarpma");
        System.out.println("4- Bölme");

        int secim = scanner.nextInt();
        double sonuc = 0;

        if(secim == toplamaIslemi){
            sonuc = sayi1 + sayi2;
        }else if(secim == 2){
            sonuc = sayi1 - sayi2;
        }else if(secim == 3){
            sonuc = sayi1 * sayi2;
        }else if(secim == 4){
            sonuc =  sayi1 / sayi2;
        }else {
            System.out.println("Hatalı tuşlama");
        }

        System.out.println("Sonuc: " + sonuc);



    }
}
