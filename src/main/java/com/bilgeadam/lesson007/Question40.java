package com.bilgeadam.lesson007;

import java.util.Arrays;

public class Question40 {
    public static void main(String[] args) {

        // üçe üçlük boş bir matris oluşturalım

        //1 1 1
        //2 2 2
        //3 3 3

        /*
        int[][] matris = {{1, 1, 1},{2, 2, 2},{3, 3, 3}};

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
         */
        //int[][] tripleArr = {{1 1 1} , {2 2 2} , {3 3 3 }}
        int[][] tripleArr = new int[3][3];

        for (int i = 0; i < tripleArr.length; i++) {
            for (int j = 0; j < tripleArr[i].length; j++) {
                tripleArr[i][j] = i + 1;
                System.out.print(tripleArr[i][j] + " ");
            }
            System.out.println();
        }
        //System.out.println(Arrays.deepToString(tripleArr));
    }
}
