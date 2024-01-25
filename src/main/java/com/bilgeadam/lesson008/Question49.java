package com.bilgeadam.lesson008;

import java.util.Scanner;

public class Question49 {
    public static void main(String[] args) {


        //kullanıcıdan bitane kelime alcaz
        //burdaki türkçe karekterleri ingilzce karkterler ile değiştircez

        //--> input Şeydağğ

        //--> outPut Seydagg

        String word = inputWord();

        String donenKelime = changeTrToEng(word, Data.turkceKarakter, Data.ingilizceKarakter);
        System.out.println(donenKelime);

    }

    public static String inputWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("İsminizi girin ");
        String word = scanner.nextLine();
        return word;
    }

    public static String changeTrToEng(String word, String[] array1, String[] array2) {
        for (int i = 0; i < array1.length; i++) {
            word = word.replace(array1[i], array2[i]);
        }
        return word;
    }
}
