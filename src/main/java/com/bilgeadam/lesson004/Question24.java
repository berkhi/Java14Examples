package com.bilgeadam.lesson004;

import java.util.Scanner;

public class Question24 {
    public static void main(String[] args) {
        // Kullanıcdan sürekli sayı alcaz kullanıcı 0 a basınca aldığımız sayıların çarpımını yazdırcaz

        Scanner scanner = new Scanner(System.in);

        int carpim = 1;

        System.out.println("Sayıları girimeye başla 0 ile çık");

        while (true){
            int sayi = scanner.nextInt();
            if (sayi == 0){
                break;
            }
            carpim *= sayi;
        }
        System.out.println("Sayılar çarpım " + carpim);
    }

}
