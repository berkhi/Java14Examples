package com.bilgeadam.lesson007;

public class Question47 {
    public static void main(String[] args) {

        // Verilen 2 matriste tekrar eden sayıları bulalım

        int array1[] = { 50, 60, 70, 4, 3, 9, 8, 7, 45, 95 };

        int array2[] = { 1, 2, 50, 50, 60, 3, 8, 9, 7, 88 };


        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if(array1[i] == array2[j]){
                    System.out.println(array1[i]);
                    break;
                }
            }
        }
    }

}
