package com.bilgeadam.lesson002;

import java.util.Scanner;

public class Question8 {

    public static void main(String[] args) {
        //15:20

        //Kenarları girilen üçgenin nasıl bir üçgen oldugunu bulalım
        //ikiz, eşkenar, çeşit


        Scanner scanner = new Scanner(System.in);
        System.out.println("Kenar1 ");
        int sayi1 = scanner.nextInt();

        System.out.println("Kenar2 ");
        int sayi2 = scanner.nextInt();

        System.out.println("Kenar3 ");
        int sayi3 = scanner.nextInt();

        if(sayi1 >0 && sayi2 >0 && sayi3>0){

            if(sayi1 == sayi2 && sayi2 == sayi3){

                System.out.println("Eş kenar");
            } else if (sayi1 == sayi2 || sayi1 == sayi3 || sayi2 == sayi3) {
                System.out.println("İkiz Kenar ");
            }else {
                System.out.println("Çeşit Kenar");
            }
        }else {
            System.out.println("Kenar uzunlukları 0 dan büyük olmalıdır");
        }



    }

}
