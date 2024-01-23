package com.bilgeadam.lesson007;

import java.util.Arrays;

public class Question43 {
    public static void main(String[] args) {

        //3
        //Verilen 2 matristeki sayıları toplayıp
        //2 ye üçlük bir yeni matriste yazdıralım

        int[][] matris1 = {{5, 6, 2}, {9, 1, 6}};

        int[][] matris2 = {{3, 4, 1}, {1, 3, 6}};

        int[][] toplamMatris = new int[2][3];

        for (int i = 0; i < matris1.length; i++) {
            for (int j = 0; j < matris2[i].length; j++) {
                toplamMatris[i][j] = matris1[i][j] + matris2[i][j];
            }
        }
        System.out.println(Arrays.deepToString(toplamMatris));
    }
}
