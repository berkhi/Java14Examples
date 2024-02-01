package com.bilgeadam.lesson011;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Pizza pizza2 = null;
        boolean cikis = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pizzanızı belirtin");
        boolean isVegi = true;
        String pizzaTercihi = scanner.nextLine();
        if (pizzaTercihi.equals("vegi")) {
            pizza2 = new Pizza(isVegi);
        } else if (pizzaTercihi.equals("normal")) {
            isVegi = false;
            pizza2 = new Pizza(isVegi);
        } else {
            System.out.println("böyle bir pizza bulunmamakta");
            cikis = false;
        }
        int sosSayac = 0;
        int peynirSayac = 0;
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
                    pizza2.sosEkle();
                    break;
                case 2:
                    pizza2.peynirEkle();
                    peynirSayac++;
                    break;
                case 3:
                    if (peynirSayac > 0) {
                        pizza2.peynirCikar();
                        peynirSayac--;
                    } else {
                        System.out.println("peynir eklenmemiş");
                    }
                    break;
                case 4:
                    pizza2.sosCikar();
                    break;
                case 5:
                    // System.exit(0);
                    pizza2.fisAl();
                    cikis = false;
                    break;

                default:
                    System.out.println("lütfen 1-3 arası sayı giriniz");
                    break;
            }
        }
    }
}
