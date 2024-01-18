package com.bilgeadam.lesson004;

import java.util.Scanner;

public class Question23 {
    public static void main(String[] args) {

        // 1- Girilen sayının 5 in kuvveti olup olmadıgını bulan program

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi giriniz:");
        int sayi = scanner.nextInt();

        int kuvvet = 1;

        boolean besinKuvvetimi = false;

        for (int i = 0; i < sayi; i++) {
            kuvvet *= 5;
            if (sayi == kuvvet) {
                besinKuvvetimi = true;
                break;
            }
        }
        if (besinKuvvetimi) {
            System.out.println("5 in kuvvetidir ");
        } else
            System.out.println("5 in kuvveti değidlir ");


        System.out.println("--------- While ---------- ");
        System.out.println("While için sayı gir");
        int sayi2 = scanner.nextInt();
        boolean kontrol = true;
        while (kontrol) {
            if (sayi2 % 5 == 0) {
                sayi2 = sayi2 / 5;
                if (sayi2 == 1) {
                    kontrol = false;
                    System.out.println("5 kuvvetidir. ****** ");
                }
            } else {
                System.out.println("5 kuvveti değidlir. -******");
                kontrol = false;
            }
        }


        System.out.println("--------- Kütpühane ile ---------- ");
        System.out.println("While için sayı gir");
        System.out.println("5in kuvveti mi ogrenmek istedigin sayiyi giriniz");
        int sayi3 = scanner.nextInt();
        boolean kuvvetiMi = false;
        for (int i = 0; i < sayi3; i++) {
            if (Math.pow(5, i) == sayi3) {
                kuvvetiMi = true;
                break;
            }
        }
        if (kuvvetiMi) {
            System.out.println("5in kuvvetidir");
        } else {
            System.out.println("5in kuvveti degildir");
        }

    }
}
