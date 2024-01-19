package com.bilgeadam.lesson005;

import java.util.Scanner;

public class Question32 {
    public static void main(String[] args) {


        // kullanıcıdan email password, repassword
        // emailde sadece @hotmail.com ve @outlook.com uzantılı mail kabul edicez
        // pasword uyuşmuyosa ve ya password uzunlugu 8 den küçükse kabul etmicez tekrar
        // şifre alcaz
        // mail içinde doğru formatta yazmıyosa emaili tekrar isticez


        Scanner scanner = new Scanner(System.in);

        boolean check = true;
        boolean check2 = true;

        String emailFormat1 = "@outlook.com";
        String emailFormat2 = "@gmail.com";

        while (check) {
            System.out.println("Emailinizi girin: ");
            String email = scanner.nextLine().toLowerCase().trim();

            System.out.println(email);

            //if(!(email.endsWith(emailFormat1) || email.endsWith(emailFormat2))) {}
            if (!(email.substring(email.length() - emailFormat1.length()).equals(emailFormat1) ||
                    email.substring(email.length() - emailFormat2.length()).equals(emailFormat2))) {
                System.out.println("Email formatına uygun değildir");
            } else {
                while (check2) {
                    System.out.println("Passowrd gir");
                    String password = scanner.nextLine();

                    System.out.println("rePassword gir");
                    String rePassword = scanner.nextLine();

                    if (password.equals(rePassword) && password.length() > 8) {
                        System.out.println("Giriş Başarılı: Hoşgeldiniz--> " + email);
                        check2 = false;
                        check = false;
                    } else {
                        System.out.println("Şifrelerde problem var");
                    }
                }
            }
        }
    }
}
