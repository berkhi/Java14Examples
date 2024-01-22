package com.bilgeadam.lesson006;

public class Question38 {
    public static void main(String[] args) {

        int[] sayilar = { 2,4,10,5,66,55,33,12,43 };

        int toplam = 0;

        for (int i = 0; i < sayilar.length; i++) {

            toplam += sayilar[i];

            if(sayilar[i] %2 == 0){
                System.out.println(sayilar[i] + " Çifttir");
            }else {
                System.out.println(sayilar[i] + " Tektir");
            }
        }
        System.out.println(toplam);
    }
}
