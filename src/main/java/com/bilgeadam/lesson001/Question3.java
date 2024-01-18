package com.bilgeadam.lesson001;

import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {

        //Girilen Tl değerini USD ye çeviren program
        //usd --> 30,10

        Scanner scanner = new Scanner(System.in);

        String message = "Usd Karşılğı -->";

        System.out.println("Tl Miktarını Girin ");
        double hesaplanmakIstenenTl = scanner.nextDouble();
        double kurMiktari = 30.10;

        double hesaplananUsd = hesaplanmakIstenenTl / kurMiktari;

        System.out.println(message + hesaplananUsd + "$");
    }
}
