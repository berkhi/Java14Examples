package com.bilgeadam.lesson002;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {


        //Girilen sayınının tek mi çift mi konrol

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayı girin: ");

        int sayi = scanner.nextInt();

        if (sayi % 2 == 0) {
            System.out.println("Çifttir");
        }else {
            System.out.println("Sayi tektir.");
        }

    }
}
