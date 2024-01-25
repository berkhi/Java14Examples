package com.bilgeadam.lesson009;

import java.util.Scanner;

public class Question57 {
    public static void main(String[] args) {
        // 3 metot yazcaz
        // 1- kullanıcdan aldıgımız email değerini kontrol edelim doğru formatta mı diye
        // @ varmı
        // hotmail.com ve ya gmail.com ile mi bitiyor

        // password ve repassword bunların uyuşup uyuşmadıgını kontrol edicez
        //mainde sadece login methodunu kullancaz

        login();
    }

    private static boolean emailKontrol() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Email: ");
        String mail = scanner.nextLine();
        //@hotmail.com
        if (!(mail.equals("@gmail.com") || mail.equals("@hotmail.com"))) {
            return mail.endsWith("@hotmail.com") || mail.endsWith("@gmail.com");
        }
        return false;
    }

    private static boolean passwordControl() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PAssword ve rePassword: ");
        String password = scanner.nextLine();
        String rePassword = scanner.nextLine();

        return password.equals(rePassword);
    }

    public static void login() {
        if(emailKontrol() && passwordControl()){
            System.out.println("Sisteme HoşGeldiniz: ");
        }else {
            System.out.println("Yanlış bilgiler");
        }
    }

    //kodları refactor edelim
    //ayrılması gerekn kodlar varsa ayıralım
    //Sisteme hoşgeldiniz --> (kullanıcın emailiniz yazdıralım)
}
