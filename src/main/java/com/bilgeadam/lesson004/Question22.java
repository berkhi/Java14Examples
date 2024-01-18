package com.bilgeadam.lesson004;

import java.util.Scanner;

public class Question22 {
    public static void main(String[] args) {


        // Girilen sayının basamaklarının toplamını bulalım
        //127 --> 1+2+7 = output->10

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi giriniz:");
        int sayi = scanner.nextInt();
        int toplam = 0;

        if (sayi == 0) {
            System.out.println("Sıfırdan farklı bir sayı");
        }
        while (sayi != 0) {
            int sonBasamak = sayi % 10;
            toplam += sonBasamak;
            sayi /= 10;
        }
        System.out.println("Toplam " + toplam);

        System.out.println("Do While -------------------");

        System.out.println("Sayi giriniz:");
        int sayi2 = scanner.nextInt();
        int toplam2 = 0;

        do {
            toplam2 = toplam2 + sayi2 % 10;
            sayi2 /= 10;
        } while (sayi2 != 0);
        System.out.println(toplam2);






        // d , l
        // e f g h .... l
    }
}
