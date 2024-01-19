package com.bilgeadam.lesson005;

import java.util.Scanner;

public class Question31 {
    public static void main(String[] args) {

        // Girilen kelimenin içinde kaç tane girilen harf oldugunu bulan program
        //java
        //a
        // 2 tane


        Scanner scanner = new Scanner(System.in);

        System.out.println("KElime gir");
        String kelime = scanner.nextLine();

        System.out.println("Aranmak istenen harf");
        char harf = scanner.nextLine().charAt(0);

        int harfSayisi = 0;
        //java
        for (int i = 0; i < kelime.length(); i++) {
            if(kelime.charAt(i) == harf){
                harfSayisi ++;
            }
        }
        System.out.println("Toplam " + harfSayisi + " kadar " + harf + " Vardır");


    }
}
