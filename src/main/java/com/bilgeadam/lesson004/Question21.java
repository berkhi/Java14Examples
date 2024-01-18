package com.bilgeadam.lesson004;

import java.util.Scanner;

public class Question21 {
    public static void main(String[] args) {

        // girilen sayıya kadar çift sayıları yazdıran program

        //Ödev: Kodu refactor edelim daha efectif çözme yolunu bulalım
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayı girin");
        int sayi = scanner.nextInt();

        for (int i = 0; i < sayi; i+=2) {
            if(sayi %2 == 0){
                if(i == sayi - 2){
                    System.out.print(i);;
                }else {
                    System.out.print(i + " ,");
                }
            }else {
                if(i == sayi - 1){
                    System.out.print(i);;
                }else {
                    System.out.print(i + " ,");
                }
            }
        }
    }
}

