package com.bilgeadam.lesson001;

import com.bilgeadam.lesson008.Question48;

import java.util.Scanner;

public class Question2{

    public static void main(String[] args) {

        // Verilen ürünün satış fiyatının içinde %18 kdv ve %15 kar oldugunu biliyoruz
        // verilen ürünün ham fiyatının bulan program

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ürünün Satış Fiyatını Girin");
        double satisFiyati = scanner.nextDouble();
        double kdvOrani = 0.18;
        double karOrani = 0.15;
        double kdvVeKarMiktariToplami = (satisFiyati * kdvOrani) + (satisFiyati * karOrani);

        double hamFiyat = satisFiyati - kdvVeKarMiktariToplami;

        System.out.println("Ürünü Ham fiyatı " + hamFiyat);

    }

}
