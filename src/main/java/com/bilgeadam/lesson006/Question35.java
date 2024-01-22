package com.bilgeadam.lesson006;

import java.util.Scanner;

public class Question35 {
    public static void main(String[] args) {

        //1-
        //System.out.println("====String işlemleri====");
        //			System.out.println("1- Palindrom kontrol");
        //			System.out.println("2- Kelimenini ilk 3 indexini alıp ... koy");
        //			System.out.println("3- Kelimenini ilk 3 indexini alıp gerisine ...... koy");

        Scanner scanner = new Scanner(System.in);

        boolean kontol = true;

        while (kontol) {
            System.out.println("Bir seçim yapınız");
            System.out.println("1- Palindrom kontrol");
            System.out.println("2- Kelimenini ilk 3 indexini alıp ... koy");
            System.out.println("3- Kelimenini ilk 3 indexini alıp gerisine ...... koy");

            int secim = scanner.nextInt();
            scanner.nextLine();

            switch (secim) {
                case 1:
                    System.out.println("Bir kelime Giriniz: ");
                    String kelime = scanner.nextLine();
                    String reverse = "";

                    for (int i = kelime.length() - 1; i >= 0; i--) {
                        reverse += kelime.charAt(i);
                    }
                    String outPut = kelime.equals(reverse) ? " Palindrom" : "Palindrom değil";
                    System.out.println(outPut);
                    /*
                    if(kelime.equals(reverse)){
                        System.out.println("Palindrom");
                    }else {
                        System.out.println("Palindrom değil");
                    }
                     */
                case 2:
                    System.out.println("Bir kelime Giriniz: ");
                    String kelime2 = scanner.nextLine();

                    String newKelime =  kelime2.substring(0,3) + "...";
                    System.out.println(newKelime);

                    String newKelime2 = "..." + kelime2.substring(3);
                    System.out.println(newKelime2);

                case 3:
                    /*
                    System.out.println("Bir kelime Giriniz: ");
                    String kelime3 = scanner.nextLine();
                    String noktalar = "";

                    //ahmetmehmetali

                    for (int i = 0; i < kelime3.length() - 3; i++) {
                        noktalar += ".";
                    }
                    System.out.println(kelime3.substring(0,3) + noktalar);

                     */

                    System.out.println("Append--- ");

                    System.out.println("Bir kelime Giriniz: ");
                    StringBuilder kelime4 = new StringBuilder();
                    kelime4.append(scanner.next());
                    //kelime4 = ahmetttalii

                    //ahmetttalii
                    for (int i = 3; i < kelime4.length(); i++) {
                        kelime4.replace(i,i+1,".");
                    }
                    System.out.println(kelime4);
                    /*
                    if(kelime3.length() < 3) {
                        System.out.println("içeri girmedi "+kelime3);
                    }else {
                        for(int i = 0 ; i < kelime.length(); i++) {
                            if(i<3) {
                                kelime3 += kelime.charAt(i);
                            }else {
                                kelime2 += ".";
                            }
                        }
                        System.out.println(kelime2);
                    }

                     */

            }

        }


        //bitane menu oluşturuyoruz

        //2- içinde 5 tane ülke bulunan bir dizi oluşturalım
        //
        //		//a ile biten ülkelerin yerine ? koyalım ["Amerika", "Ukranya"]
        //
        //		//1. index değişti
        //		//2. index değişti

        //3- int[] sayilar = { 0, 120, -5, -85, -256, 16, 1258, 81, 14 };
        //
        //		//0 dan küçük sayıları 100 ile değiştirelim

        //4 - int[] sayilar = { 2,4,10,5,66,55,33,12,43 };

        //bu sayı çiftdir ve bu sayı tekdir şeklinde çıktı alan ve.
        //dizi deki tüm sayıların toplamını veren program


    }
}
