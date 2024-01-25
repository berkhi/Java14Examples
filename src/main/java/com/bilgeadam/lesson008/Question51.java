package com.bilgeadam.lesson008;

import java.util.Scanner;

public class Question51 {
    public static void main(String[] args) {

        //girilen sayının kaç basamakl ıoldugunu bulalım

        //kullanıcıya sayının kaç basamaklı olduğunu söyleyelim.


        System.out.println(Integer.MAX_VALUE);
        int sayi = getNumber();
        int basamakSayisi = basamakSayisi(sayi);
        print(basamakSayisi);
    }
    public static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi gir");
        int sayi = scanner.nextInt();
        return sayi;
    }

    public static int basamakSayisi(int sayi) {
        String stringSayi = String.valueOf(sayi);
        int basamakSayisi = stringSayi.length();
        return basamakSayisi;
    }

    public static void print(int basamakSayisi) {
        System.out.println(basamakSayisi + " Basamaklıdır");
    }
}
