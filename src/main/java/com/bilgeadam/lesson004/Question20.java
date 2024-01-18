package com.bilgeadam.lesson004;

import java.util.Scanner;

public class Question20 {
    public static void main(String[] args) {
        // Girilen sayının asal sayı olup olmadığının bulan program


        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayı girin");
        int sayi = scanner.nextInt();


        boolean asalMi = true;

        for (int i = 2; i < sayi; i++) {
            if(sayi %i == 0){
                asalMi = false;
                break;
            }
        }
        if(asalMi){
            System.out.println("Asladır");
        }else {
            System.out.println("Asal Değildir");
        }
    }
}
