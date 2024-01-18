package com.bilgeadam.lesson001;

import java.util.Scanner;

public class Question4 {


    public static void main(String[] args) {

        //Dairenin alanını ve çevresini hespalayan programı yapalım

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dairinin yarı çapını girin (r) ");

        double r = scanner.nextDouble();
        double pi = 3.14;

        double daireAlan = (r*r) * pi;
        double daireCevre = 2 * pi * r;

        System.out.println("Alanı: " + daireAlan);
        System.out.println("Çevresi: " + daireCevre);

    }
}
