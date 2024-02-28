package com.bilgeadam.lesson020;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class Util {


    //intDegerAl() metodu yazalım

    //kullanıcıdan tarih alcaz (yil-gün-ay)(2024-02-02)
    //dogru girene kadar input alalım

    static Scanner scanner = new Scanner(System.in);

    public static int getIntegerValue(String mesaj) {
        while (true) {
            try {
                System.out.println(mesaj);
                int value = scanner.nextInt();
                scanner.nextLine();
                return value;
            } catch (Exception e) {
                System.out.println("Tekrar dene");
                scanner.nextLine();
            }
        }
    }

    public static String getIntegerValue() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        while (true) {
            try {
                System.out.println("2023-05-05 formatında giriş yapın");
                String deger = scanner.nextLine();
                Date date = simpleDateFormat.parse(deger);
                return simpleDateFormat.format(date);
            } catch (ParseException e) {
                System.out.println("Çevirme işlemi başarısız lütfen doğru formatta girin");
            }
        }
    }


    public static void main(String[] args) {
        getIntegerValue();
    }
}
