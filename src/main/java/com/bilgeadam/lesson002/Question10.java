package com.bilgeadam.lesson002;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {

        //girilen iki sayının toplamı
        //çift ise true tek ise false yazdıralım

        //boolean olarak yazdıarlım
        //en sonda iki sayını toplamını çıktı olarak verelim

        Scanner scanner = new Scanner(System.in);
        System.out.println("iki sayı girin");

        int a = scanner.nextInt();
        int b = scanner.nextInt();


        boolean toplamCiftMi = (a +b) %2 == 0 ;

        if(toplamCiftMi){
            System.out.println("Çifttir " + toplamCiftMi);
        }else {
            System.out.println("Tektir " + toplamCiftMi);
        }

    }
}
