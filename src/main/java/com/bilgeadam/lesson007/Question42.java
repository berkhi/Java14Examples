package com.bilgeadam.lesson007;

import java.util.Scanner;

public class Question42 {
    public static void main(String[] args) {
        //KISS
        //Keep it simple stupid

        //2
        // 2 ye 2 lik bir matris oluşturcaz
        // kullanıcdan isim değerleri alcaz
        // 1. grup
        // ahmet
        // mehmet
        // 2.grup
        // ali
        // ayşe

        Scanner scanner = new Scanner(System.in);
        String[][] isimler = new String[2][2];

        for (int i = 0; i < isimler.length; i++) {
            for (int j = 0; j < isimler[i].length; j++) {
                System.out.println("İsim Giriniz: ");
                isimler[i][j] = scanner.nextLine();
            }
        }
        for (int i = 0; i < isimler.length; i++) {
            System.out.println((i + 1) + ". Group");
            for (int j = 0; j < isimler[i].length; j++) {
                System.out.println(isimler[i][j] + " ");
            }

        }


    }
}
