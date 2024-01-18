package com.bilgeadam.lesson004;

import java.util.Scanner;

public class Question26 {
    public static void main(String[] args) {

        // Girilen sayıda hangi basmakta hangi sayı var onu bulcaz
        // 375
        // birler basamağı ->5
        // onlar basamagı ->7
        // yüzler bvasamagı-> 3

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi giriniz:");
        int sayi = scanner.nextInt();

        int basamakDegeri =0;
        int i =1;
        while (sayi >0){
            basamakDegeri = sayi %10;
            sayi = sayi/10;
            System.out.println(i + "ler basamagı " + basamakDegeri);
            i = i*10;
        }
    }
}
