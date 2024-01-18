package com.bilgeadam.lesson003;

import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {

        //kullanıcdan aldıgımız sayı haftanın hangi gününe denk geliyo
        //bu gün hafta sonu mu hafta içi mi kontrol edelim
        //switch case

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kaçıncı ayda doğdunuz");
        int gunSayisi = scanner.nextInt();
        String durum = "Hafta İçi";

        switch (gunSayisi){
            case 1:
                System.out.println("Pazartesi " + durum );
                break;
            case 2:
                System.out.println("Salı " + durum );
                break;
        }

        System.out.println("-------------------");
        switch (gunSayisi){
            case 1 ,2,3,4,5:
                System.out.println(durum );
                break;
            case 6,7:
                System.out.println( "Hafta Sonu" );
                break;
        }
        System.out.println("-------------------");
        System.out.println(
                switch (gunSayisi) {
                    case 1-> "Pazartesi " + "Haftaiçi";
                    case 2-> "Salı " + "Haftaiçi";
                    case 3-> "Çarşamba " + "Haftaiçi";
                    case 4-> "Perşembe " + "Haftaiçi";
                    case 5-> "Cuma " + "Haftaiçi";
                    case 6-> "Cumartesi " + "Haftasonu";
                    case 7-> "Pazar " + "Haftasnu";
                    default -> "1-7 arasında bir sayı girin";
                }
        );


    }
}
