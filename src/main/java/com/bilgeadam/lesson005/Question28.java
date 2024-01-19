package com.bilgeadam.lesson005;

import java.util.Scanner;

public class Question28 {

    // Girilen sayının mükemmel sayı olup olmadıgını bulan program

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi giriniz:");
        int sayi =  scanner.nextInt();

        int toplam = 0;
        for (int i = 1; i < sayi - 1; i++) {
            if(sayi % i == 0){
                toplam = toplam + i;
            }
        }

        if(sayi == toplam){
            System.out.println("Mükkemel sayı " + sayi);
        }else {
            System.out.println("Mükemmel değil " + sayi);
        }
    }

}
