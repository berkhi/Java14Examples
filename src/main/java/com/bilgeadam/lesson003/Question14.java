package com.bilgeadam.lesson003;

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
/*
		  Koç Burcu : 21 Mart - 20 Nisan
		  Boğa Burcu : 21 Nisan - 21 Mayıs
		  İkizler Burcu : 22 Mayıs - 22 Haziran
		  Yengeç Burcu : 23 Haziran - 22 Temmuz
		  Aslan Burcu : 23 Temmuz - 22 Ağustos
		  Başak Burcu : 23 Ağustos - 22 Eylül
		  Terazi Burcu : 23 Eylül - 22 Ekim
		  Akrep Burcu : 23 Ekim - 21 Kasım
		  Yay Burcu : 22 Kasım - 21 Aralık

		  1. Ay Oğlak Burcu : 22 Aralık - 21 Ocak
		  //1 ocak ile 21 ocak arası
		  1. Ay Kova Burcu : 22 Ocak - 19 Şubat
		  //22 ocak ile 31 ocak arası

		  Balık Burcu : 20 Şubat - 20 Mart
		*/

        // Kaçıncı ayda doğdunuz-->  4. ayda
        // hangi gün doğdunuz-->  Ayın 20'sinde

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kaçıncı ayda doğdunuz");
        //1
        int ay = scanner.nextInt();

        System.out.println("Hani gün doğdunuz");
        int gun = scanner.nextInt();

        switch (ay) {
            case 1:
                if (gun <= 21) {
                    System.out.println("Oğlak Burcusunuz");
                } else {
                    System.out.println("Kova Burcusunuz");
                }
                break;
            case 2:
                if(gun <=19){
                    System.out.println("Kova burcu");
                }else {
                    System.out.println("Balık burcu");
                }
                break;
            default:
                System.out.println("Lütfen 1 ile 12 arası tuşlama yapın");
        }
    }
}
