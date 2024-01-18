package com.bilgeadam.lesson003;

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //girilen 3 sayıdan en büyüğü

    /*
        int max = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Sayı giriniz: ");
            int num = scanner.nextInt();
            if(num > max){
                max = num;
            }
        }
        System.out.println(max);


     */

        //girilen 3 sayıyı büyükten küçüğe doğru sıralayan program

        //Şubat
        System.out.println("---------------------");

        System.out.println("3 Sayı giriniz: ");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        int sayi3 = scanner.nextInt();

        if(sayi1 >= sayi2 && sayi1 >= sayi3){
            if(sayi2 >= sayi3){
                System.out.println("Sıralama Sayi1> Sayi2> Sayi3");
            }else {
                System.out.println("Sıralama Sayi1> Sayi3> Sayi2");
            }
        } else if (sayi2 >= sayi1 && sayi2>= sayi3) {
            if(sayi1 >= sayi3){
                System.out.println("Sıralama Sayi2> Sayi1> Sayi3");
            }else {
                System.out.println("Sıralama Sayi2> Sayi3> Sayi1");
            }
        } else {
            if(sayi1 >= sayi2){
                System.out.println("Sıralama Sayi3> Sayi1> Sayi2");
            }else {
                //System.out.println("Sıralama Sayi3> Sayi2> Sayi1");
                System.out.println("Sıralama: " + sayi3 + sayi2 + " > " + sayi1);
            }
        }
    }
}
