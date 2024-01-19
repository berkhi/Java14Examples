package com.bilgeadam.lesson004;

import java.util.Scanner;

public class Question21 {
    public static void main(String[] args) {

        // girilen sayıya kadar çift sayıları yazdıran program

        //Ödev: Kodu refactor edelim daha efectif çözme yolunu bulalım
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayı girin");
        int sayi = scanner.nextInt();

        for (int i = 0; i < sayi; i += 2) {
            if (sayi % 2 == 0) {
                if (i == sayi - 2) {
                    System.out.print(i);
                    ;
                } else {
                    System.out.print(i + " ,");
                }
            } else {
                if (i == sayi - 1) {
                    System.out.print(i);
                } else {
                    System.out.print(i + " ,");
                }
            }
        }


        System.out.println("----------------------");

        System.out.println("Bir Sayı Giriniz");
        int girilenSayi = scanner.nextInt();

        for (int i = 0; i <= girilenSayi; i += 2) {
            System.out.print(i);
            //100
            //i = 100
            // 101 < 100
            if ((i + 1 < girilenSayi)) {
                System.out.print(", ");
            }
        }


        System.out.println("----------------");
        System.out.println("Sayı Giriniz");
        int sayi1 = scanner.nextInt();


        if (sayi1 % 2 != 0) {
            sayi1--;
        }
        for (int i = 0; i <= sayi1; i += 2) {
            if (i == sayi1) {
                System.out.print(i);
            } else {
                System.out.print(i + ", ");
            }
        }
    }
}

