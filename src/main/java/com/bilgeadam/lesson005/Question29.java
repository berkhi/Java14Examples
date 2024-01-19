package com.bilgeadam.lesson005;

import java.util.Scanner;

public class Question29 {

    // kullanıcıdan alcaz
    // taban sayısı alcaz -->2
    // üs sayısı --> 5
    // örnek --> 2 üzeri 5 i hesaplayan program

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" 2 Sayi giriniz:");
        int taban =  scanner.nextInt();
        int us =  scanner.nextInt();

        double sonuc = 1;

        long startTime = System.nanoTime();
        for (int i = 0; i < us; i++) {
            sonuc *= taban;
        }
        System.out.println(taban + "^ " + us + " = " + sonuc);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);





        System.out.println("----------------Duration 2---------------");

        long startTime2 = System.nanoTime();
        double kuvvet =  Math.pow(taban, us);
        System.out.println("Kuvvetleri " +  kuvvet);
        long endTime2 = System.nanoTime();

        long duration2 = (endTime2 - startTime2);
        System.out.println("Duration 1 " + duration);
        System.out.println("Duration 2 " + duration2);


    }
}
