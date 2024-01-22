package com.bilgeadam.lesson006;

import java.util.Random;
import java.util.Scanner;

public class Question34 {
    public static void main(String[] args) {

        //Sayi tahmin Uygulaması
        //sürekli kullanıcdan sayı tahmin etmsini isticez
        //ettiği sayı az ise tahmini artır
        //fazla ise azalt diye kullancıyı bilgilendirelim
        //doğru bildiği zaman kaçıncı denemesinde buldugunu söyleylim

        //random sayı 1 - 100 arasında olsun

        //5 tane tahmin hakkımız olsun
        //üzgünüz bilemediniz

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int randomSayi = random.nextInt(1,100);
        System.out.println(randomSayi);

        int maxDeneme = 5;
        int deneme = 0;

        while (deneme < maxDeneme){
            System.out.println("Tahminniz: ");
            int tahmin = scanner.nextInt();
            deneme ++;
            if(tahmin == randomSayi){
                System.out.println("Tebrikler Doğru: " +deneme + " denmenizde buldunuz");
                return;
            } else if (tahmin < randomSayi) {
                System.out.println("Artır: ");
            }else {
                System.out.println("Azalt");
            }
        }
        System.out.println("Bilemediniz ");


        //14:45

    }
}
