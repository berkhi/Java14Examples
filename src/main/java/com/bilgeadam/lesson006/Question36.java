package com.bilgeadam.lesson006;

import java.util.Arrays;

public class Question36 {
    public static void main(String[] args) {

        String[] dizi = {"Almanya","Türkiye","Kazakistan","Amerika"};


        for (int i = 0; i < dizi.length; i++) {
            if(dizi[i].endsWith("a")){
                dizi[i] = "?";
                System.out.println(i + ". indexi değişti");
            }
        }

        System.out.println("Güncel Array " + Arrays.toString(dizi));
    }

}
