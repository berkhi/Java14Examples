package com.bilgeadam.lesson002;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        //Girilen 3 sayıdan en Büyük olanu
        //bulalım

        Scanner scanner = new Scanner(System.in);
        int sayi1 =  scanner.nextInt();

        int sayi2 =  scanner.nextInt();

        int sayi3 =  scanner.nextInt();

        int max;


        if(sayi1 > sayi2 && sayi1 > sayi3){
            max = sayi1;
        }
        else if (sayi2 > sayi1 && sayi2 > sayi3) {
            max = sayi2;
        }else {
            max = sayi3;
        }
        System.out.println("En Büyük sayı + " + max);




        System.out.println("Altarnetif Çözüm ************");
        int max2;
        int num1 =  scanner.nextInt();

        int num2 =  scanner.nextInt();

        int num3 =  scanner.nextInt();

        if(num1 > num2){
            max2 = num1 > num3 ? num1 : num3;
        }else {
            max2 = num2 > num3 ? num2 : num3;
        }
        System.out.println("En Büyük sayı + " + max2);

        System.out.println("Altarnetif Çözüm ************");

        int number1 =  scanner.nextInt();

        int number2 =  scanner.nextInt();

        int number3 =  scanner.nextInt();

        int enBuyukSayi = number1;

        //10 20 35
        //enBüyük = 35
        if(number2 > enBuyukSayi){
            enBuyukSayi = number2;
        }if(number3 > enBuyukSayi){
            enBuyukSayi = number3;
        }
        System.out.println("En büyük Sayı :" + enBuyukSayi );


        System.out.println("Altarnetif Çözüm ************");

        System.out.println("Bir  sayı girin");
        int a = scanner.nextInt();

        System.out.println("Bir  sayı girin");
        int b = scanner.nextInt();

        System.out.println("Bir  sayı girin");
        int c = scanner.nextInt();


        int firstStep = (a>b)?a:b;
        int finalStep = (firstStep>c)?firstStep:c;
        System.out.println("En büyük sayı :" + finalStep);

        //16:26
    }
}
