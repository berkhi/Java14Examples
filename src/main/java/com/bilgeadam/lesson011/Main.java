package com.bilgeadam.lesson011;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);


        Pizza pizza = null;
        boolean pizzaCheck= true;

        System.out.println("Neli Pizza: ");
        String choosePizza = scanner.nextLine();

        if(choosePizza.equalsIgnoreCase("vegi")){
            pizza = new Pizza(pizzaCheck);
        } else if (choosePizza.equalsIgnoreCase("normal")) {
            pizzaCheck = false;
            pizza = new Pizza(pizzaCheck);
        }else {
            System.out.println("Böyle bir pizza yok");
        }


        boolean cikis = true;
        while (cikis) {

            System.out.println("Seçim Yapınız ");
            System.out.println("--Menu-- ");
            System.out.println("1- SosEkle ");
            System.out.println("2- PeynirEkle ");
            System.out.println("3- PeynirCikar ");
            System.out.println("4- SosCikar ");
            System.out.println("5- Görüntüle ");
            int secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    pizza.sosEkle();
                    break;
                case 2:
                    pizza.peynirEkle();
                    break;
                case 3:
                    pizza.peynirCikar();
                    break;
                case 4:
                    pizza.sosCikar();
                    break;
                case 5:
                    pizza.fisAl();
                    break;

                default:
                    System.out.println("lütfen 1-3 arası sayı giriniz");
                    break;
            }
        }
    }
}








