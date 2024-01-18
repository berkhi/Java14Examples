package com.bilgeadam.lesson002;

import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {


        //Girilen iki sayıdan hangisini büyük olduğunu bulalım.

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Sayıyı Girin ");
        int sayi1 = scanner.nextInt();

        System.out.println("2. sayıyı girin ");
        int sayi2 = scanner.nextInt();

        if (sayi1 > sayi2) {
            System.out.println("Büyük sayı Sayı1: " + sayi1);
        } else if (sayi2 > sayi1) {
            System.out.println("Büyük sayı Sayi2: " + sayi2);
        } else {
            System.out.println("Sayılar eşittir.");
        }

        //Çözüm 2

        String result = sayi1 > sayi2 ? "Büyük sayi Sayi1 " + sayi1 : "Büyük Sayi Sayi2" + sayi2;
        System.out.println(result);


    }
}
