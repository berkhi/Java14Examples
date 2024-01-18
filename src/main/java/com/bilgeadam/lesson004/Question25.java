package com.bilgeadam.lesson004;

import java.util.Scanner;

public class Question25 {
    public static void main(String[] args) {

        // girilen harften girilen harfe kadar olan harfleri yazdıralım

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi giriniz:");

        char harf1 = scanner.next().charAt(0);
        char harf2 = scanner.next().charAt(0);


        int asciCode1 = (int) harf1;
        int asciCode2 = (int) harf2;

        for (int i = asciCode1; i <= asciCode2; i++) {
            char harf = (char) i;
            System.out.print(harf + " ,");
        }

        System.out.println("ikinci çözüm");
        for (char i = harf1; i <= harf2; i++) {
            System.out.print(i + " ");
        }


    }
}
