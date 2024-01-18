package com.bilgeadam.lesson003;

import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) {

        // Girilen char değerinin alfabenin içinde var mı yok mu

        Scanner scanner = new Scanner(System.in);
        System.out.println("Harf girin");

        char karakter = scanner.nextLine().charAt(0);
        //97
        int asciCode = karakter;

        if(asciCode >= 65 && asciCode <=90 || asciCode >= 97 && asciCode <=122){
            System.out.println("Alfabede vardır");
        }else {
            System.out.println("Alfabede Yoktur");
        }
    }
}
