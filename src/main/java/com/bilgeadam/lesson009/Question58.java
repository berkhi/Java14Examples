package com.bilgeadam.lesson009;

import java.util.Arrays;

public class Question58 {
    public static void main(String[] args) {

        // parametre olarak iki tane array alan
        // ve aldıgı arrayleri toplayıp farklı bir arrayin içinde saklayan method

        // toplamları yazdırcaz

        int[] array1 = {1, 2, 3, 4, 5, 6, 6, 4, 5, 6};
        int[] array2 = {1, 2, 3, 4, 5, 6};

        diziyiGoster(diziToplam(array1, array2));
    }

    public static void diziyiGoster(int[] array) {
        System.out.println(Arrays.toString(array));
    }


    public static int[] diziToplam(int[] array1, int[] array2) {

        int[] toplamDizisi = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            toplamDizisi[i] = array1[i] + array2[i];
        }
        return toplamDizisi;
    }

    //toplayacak bir şey kalmadığında yeni bir diziye atsın
    //eğer çift sayı kadar length kaldıysa (index * index + 1)

    //lengthi tek sayı ise hepsinin toplamını versin
}
