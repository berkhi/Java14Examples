package com.bilgeadam.lesson008;

import java.util.Scanner;

public class Question48 {
    public static void main(String[] args) {

        // Parametre olarak girilen isim ve soyisim değerini alıp ekrana yazdıralım
        //String nameAndLastName = inputNameAndLastName();

        String isim = inputName();
        String soyad = inputLastName();
        printNameAndLastName(isim, soyad);

    }

    //bir kişi sizin yazdığınız metoda baktığında metodun ne yaptıgını anlamalı
    //metot isimleri önemli

    //S --> single Responsibility
    public static void printNameAndLastName(String name, String lastName) {
        System.out.println("İsim: " + name + " Soy isim: " + lastName);
    }

    public static String inputName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("İsminizi girin ");
        String isim = scanner.nextLine();
        return isim;
    }

    public static String inputLastName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Soyadınızı girin ");
        String soyad = scanner.nextLine().toUpperCase();
        return soyad;
    }

/*
    public static String inputNameAndLastName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("İsminizi girin ");
        String isim = scanner.nextLine();

        System.out.println("Soyadınızı girin ");
        String soyad = scanner.nextLine();

        //soyadı büyüten kod satırı
        //isimiin hepsini küçüğe çeviren kod satırı
        return "İsminiz:  " + isim + " Soyİsminiz: " + soyad;
    }


 */



}
