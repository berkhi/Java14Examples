package com.bilgeadam.lesson015;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListOrnek2 {

    // 1 tane çift sayılar
    // 1 tane teksayılar arraylisti açalım

    // 1 den 100 e kadar 35 tane random sayı üretelim
    // üretilen sayılardan tekleri tekArrayListine
    // çiftleride çiftArraylistine atlaım

    public static void main(String[] args) {
        Random random = new Random();

        ArrayList<Integer> tekSayilar = new ArrayList<>();
        ArrayList<Integer> ciftSayilar = new ArrayList<>();

        for (int i = 0; i < 35; i++) {
            int sayi = random.nextInt(1,100);
            if(sayi % 2 == 0){
                ciftSayilar.add(sayi);
            }else {
                tekSayilar.add(sayi);
            }
        }

        System.out.println(tekSayilar);
        System.out.println(ciftSayilar);

        //14:30
    }




}
