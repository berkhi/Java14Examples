package com.bilgeadam.lesson007;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Question41 {
    public static void main(String[] args) {

        //1
        // Verilen arreyde en büyük ve en küçük değerleri bulalım
        String[] array = {"100", "8", "7", "5", "99", "85", "100", "150", "150"};

        int enKucuk = Integer.MAX_VALUE;
        int enBuyuk = Integer.MIN_VALUE;


        for (int i = 0; i < array.length; i++) {
            if (Integer.parseInt(array[i]) > enBuyuk) {
                enBuyuk = Integer.parseInt(array[i]);
            } else if (Integer.parseInt(array[i]) < enKucuk) {
                enKucuk = Integer.parseInt(array[i]);
            }
        }

        System.out.println("En büyük " + enBuyuk + " " + "En Küçük  " + enKucuk);

        System.out.println("**************************");

        int[] intArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            intArray[i] = Integer.parseInt(array[i]);
        }

        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
        System.out.println("En küçük " + intArray[0] + " En Büyük " + intArray[intArray.length -1]);


    }
}
