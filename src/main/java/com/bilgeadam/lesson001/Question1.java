package com.bilgeadam.lesson001;

import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        //Verilen iki sayının çarpımını bulup ekrana yazdıralım

        int sayi1 = 5;
        int sayi2 = 10;
        int carpinKatSayisi = 3;
        int bolmeKatsayisi = 2;

        int carpimSonucu = (sayi1 * sayi2 * carpinKatSayisi) / bolmeKatsayisi;

        System.out.println(carpimSonucu);

        //Girilen iki sayının çarpımını bulup ekrana yazdıralım

        Scanner scanner = new Scanner(System.in);

        //ctrl + d --> satırın kopyasını yazar

        System.out.println("1. sayıyı girin");
        int number1 = scanner.nextInt();

        System.out.println("2. sayıyı girin");
        int number2 = scanner.nextInt();

        int result = number1 * number2;
        System.out.println(result);


    }

}



//Naming Convension
//Javada Class isimleri --> UserService  --> PascalCase
//Javada değişken isimleri --> enBuyukSayi --> camelCase
//Java metod isimleri --> sayilariTopla() --> camelCase

//kodlama yaparken Türkçe karakter kullanmıyoruz
//Boşluk kullanmıyoruz

//değişken tanımlarken o değiken neyi temsil ediyosa ismini ona göre koyalım
// a , b
//sayi1, sayi2

//sayiTopla
//kullanicidanAlinanSayilariTopla()