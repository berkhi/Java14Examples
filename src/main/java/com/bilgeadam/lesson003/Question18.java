package com.bilgeadam.lesson003;

import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {

        // Girilen karakterin ünlü mü ünsüz mü oldugunu bulan program

        Scanner scanner = new Scanner(System.in);
        System.out.println("Harf girin");

        String girilenHarf = scanner.nextLine();

        switch (girilenHarf) {
            case "a", "e", "o", "ö","i":
                System.out.println("Ünlüdür");
                break;
            default:
                System.out.println("Ünsüzdür");
        }


        char ch = scanner.nextLine().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U') {
            System.out.println(ch + " bir ünlü harftir.");
        } else {
            System.out.println(ch + " bir ünsüz harftir.");
        }
    }
}
