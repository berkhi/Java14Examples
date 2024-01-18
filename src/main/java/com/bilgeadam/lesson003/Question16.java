package com.bilgeadam.lesson003;

import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {
        // Girilen karakterin asci kodunu bulan program

        Scanner scanner = new Scanner(System.in);

        System.out.println("Harf girin");

        char karakter =  scanner.nextLine().charAt(0);
        int asciCode = karakter;

        System.out.println(asciCode);


    }
}
