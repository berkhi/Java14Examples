package com.bilgeadam.lesson004;

import java.util.Scanner;

public class Question27 {
    public static void main(String[] args) {

        // Klavyeden girilen 0 ile 100 arasında 100 dahil 5 adet sayıdan en büyük
        //ve en küçük olanı bulup ekrana yazan  program

        Scanner scanner = new Scanner(System.in);
        System.out.println("5 adet Sayi giriniz:");

        int max = Integer.MIN_VALUE;
        System.out.println(max);

        int min = Integer.MAX_VALUE;
        System.out.println(min);

        for (int i = 0; i < 5; i++) {
            int sayi = scanner.nextInt();
            if (sayi > max) {
                max = sayi;
            }
            if (sayi < min) {
                min = sayi;
            }
        }
        System.out.println("Min: " + min + " Max " + max);

        int i =0;
        while (i<5) {
            int sayi = scanner.nextInt();
            if (sayi > max) {
                max = sayi;
            }
            if (sayi < min) {
                min = sayi;
            }
            i++;
        }
        System.out.println("Min: " + min + " Max " + max);
    }
}
