package com.bilgeadam.maratonlar.maraton1;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

       menu();

    }

    public static void menu(){
        boolean check = true;
        while (true){
            System.out.println("1- ");
            System.out.println("2- ");
            System.out.println("3- ");
            System.out.println("7-  Çıkış");
            Scanner scanner = new Scanner(System.in);
            int secim = scanner.nextInt();
            switch (secim){
                case 1:
                    topla(1,2);
                    break;
                case 2:
                    System.out.println("Topla");
                    break;
                case 3:
                    System.out.println("Bölme ");
                    break;
                case 7:
                    //System.out.println("Çıkış Yapldı");
                    //check = false;
                    System.exit(0);
                    break;
            }
        }
    }

    public static void topla(int a, int b){

    }


}
