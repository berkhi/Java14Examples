package com.bilgeadam.lesson008;

import java.util.Scanner;

public class Question50 {
    public static void main(String[] args) {

        // topla() methodu yazalım dışardan 2 tane sayı alcaz
        // ondanBuyukmu() diye bir method yazalım

        //topla m. dönen değer 10 dan büyükse true dönsün
        //küçükse false dönsün

        //10 dan büyükse indirim kazanacak
        //ekrana indirim kazandınız ve ya idniriminiz yok


        int sayi1 = getNumber();
        int sayi2 = getNumber();
        int toplam = topla(sayi1,sayi2);
        boolean indirim = ondanBuyukMu(toplam);
        indirimVarMi(indirim);


        indirimVarMi(ondanBuyukMu(topla(getNumber(),getNumber())));

    }

    public static void indirimVarMi(boolean isIndırım){
        if(isIndırım){
            System.out.println("İndiriminiz var");
        }else {
            System.out.println("İndiriminiz Yoktur!!!!");
        }
    }

    public static boolean ondanBuyukMu(int num){
        return num > 10;
    }

    public static int topla(int num1, int num2){
        return num1 + num2;
    }

    public static int getNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi gir");
        int sayi = scanner.nextInt();
        return sayi;
    }
}
