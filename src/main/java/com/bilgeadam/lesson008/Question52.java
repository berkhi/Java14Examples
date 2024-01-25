package com.bilgeadam.lesson008;

import java.util.Arrays;

public class Question52 {
    public static void main(String[] args) {
        // 2 farklı method yazalım
        // parametre olarak dizi(array) aldıgı dizideki
        // tek elemanları farklı bir diziye atıcak metot ismi tekSayilariAta();

        // diğer metotta teksayıların oldugu diziyi ekrana yazdırcak

        int[][] matris = {{56, 23, 678, 231, 5, 3, 5}, {234, 21, 78, 26, 6, 4, 4}, {654, 33, 32, 67, 2, 5, 6},
                {189, 35, 56, 89, 8, 6, 7}, {189, 35, 56, 89, 8, 6, 8}, {189, 33, 59, 89, 1, 7, 7}};

        tekSayilarDizisiniYazdir(tekSayilariAta(matris));

    }

    public static int[] tekSayilariAta(int[][] matris) {

        int[] tekSayilarArray = tekBoyutluArrayOlustur(matris);

        int sayac = 0;
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                if (matris[i][j] % 2 != 0) {
                    tekSayilarArray[sayac] = matris[i][j];
                    sayac++;
                }
            }
        }
        return tekSayilarArray;
    }

    public static int[] tekBoyutluArrayOlustur(int[][] matris) {
        int tekSayiAdedi = 0;
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                if (matris[i][j] % 2 != 0) {
                    tekSayiAdedi++;
                }
            }
        }
        int[] tekSayilarArray = new int[tekSayiAdedi];
        return tekSayilarArray;
    }

    public static void tekSayilarDizisiniYazdir(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
