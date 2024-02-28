package com.bilgeadam.lesson020;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class TryCatchExample {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // bir tane bölme methodu yazalım kullanıcıdan 2 tane sayı alcaz

        // ve bölümü return dicez bunu yaparken gerekli hataları karşı önlem alalım

        // kulanıcıdı doğru sonuc girene kadar kullanıcdan girdi alalım


            double sonuc = bolme();
            System.out.println(sonuc);

    }

    public static double bolme(){
        boolean kontrol = true;
        double bolum = 0;
        int sayi1 = 0;
        int sayi2 = 0;

        while (kontrol) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("1. Sayi");
                sayi1 = scanner.nextInt();

                System.out.println("2. Sayi");
                sayi2 = scanner.nextInt();

                bolum = sayi1 / sayi2;
                kontrol = false;

            }catch (Exception e){
                handleException(e);
            }
        }
        return bolum;
    }

    //14:50

    public static void handleException(Exception e){
        if(e instanceof ArithmeticException){
            System.out.println(ErrorMessages.NOT_INPUT_ZERO_EXCEPTION_MESSAGE);
        } else if (e instanceof InputMismatchException) {
            System.out.println(ErrorMessages.INPUT_STRING_EXCEPTION_MESSAGE);
        }else {
            System.out.println(ErrorMessages.UNEXCEPTED_EXCEPION_MESSAGE);
        }
    }


}
