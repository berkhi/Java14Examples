package com.bilgeadam.lesson007;

import java.util.Arrays;

public class Question45 {
    public static void main(String[] args) {

        // tek sayılıar bir tane arrayin içine atalım
        // arrayi yazdırcaz

        int[][] matris = { { 56, 23, 678, 231, 5, 3, 5 }, { 234, 21, 78, 26, 6, 4, 4 }, { 654, 33, 32, 67, 2, 5, 6 },
                { 189, 35, 56, 89, 8, 6, 7 }, { 189, 35, 56, 89, 8, 6, 8 }, { 189, 33, 59, 89, 1, 7, 7 } };

        int tekSayiAdedi = 0;

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                if(matris[i][j] %2 != 0){
                    tekSayiAdedi ++;
                }
            }
        }
        int[] tekSayilarArray = new int[tekSayiAdedi];
        int sayac = 0;
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                if(matris[i][j] %2 != 0){
                    tekSayilarArray[sayac] = matris[i][j];
                    sayac ++;
                }
            }
        }
        System.out.println(Arrays.toString(tekSayilarArray));



        // Verilen 2 matriste tekrar eden sayıları bulalım

        int array1[] = { 50, 60, 3, 4, 3, 9, 8, 7, 45, 95 };

        int array2[] = { 1, 2, 50, 50, 60, 3, 8, 9, 7, 88 };

    }
}
