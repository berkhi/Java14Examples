package com.bilgeadam.lesson005;

import java.util.Arrays;
import java.util.Scanner;

public class Odev {

    // 1 ) Bir dizide en büyük ikinci sayıyı bulan program


    //toplam == 1 + 5 + 7


    public static void main(String[] args) {

        int[] sayilar = {95, 1258, 1258, 1258, 99, -256, 16, 0, 36, 81, 14, 85, 86};

        int max = Integer.MIN_VALUE;
        int ikinciEnbuyuk = Integer.MIN_VALUE;

        for (int item : sayilar) {
            if (item > max) {
                ikinciEnbuyuk = max;
                max = item;
            } else if (item > ikinciEnbuyuk && item < max) {
                ikinciEnbuyuk = item;
            }
        }
        System.out.println("En büyük ikinci: " + ikinciEnbuyuk);
        System.out.println("-------------");


        System.out.println(Arrays.toString(sayilar));

        Arrays.sort(sayilar);



        int[] sayilar2 = {95, 1258, 1258, 1258, 99, -256, 16, 0, 36, 81, 1258, 1258, 1258};

        Arrays.sort(sayilar2);
          for (int i=sayilar2.length-1; i>=0; i--) {
            if(sayilar2[i]!=sayilar2[(i-1)]) {
                System.out.println("En küçük ikinci say**********ı = "+sayilar2[i-1]);
                break;
            }
        }

        //2) bir dizide eğer 13 var ise hem 13ü hemde bir sonraki indexi toplama işlemine almicak dizideki elemanların toplamını bulalım

        System.out.println("2. soru-----------------");
        int nums[] = {1, 13, 13, 13, 2, 5, 13, 1, 7, 13};

        int toplam = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                i++;
            } else {
                toplam += nums[i];
            }
        }
        System.out.println("Toplam " + toplam);



        System.out.println("2. soru--------Farklı Çözüm---------");
        int nums2[] = {1, 13, 13, 13, 2, 5, 13, 1, 7, 13};

        int toplam2 = 0;
        int lastNumber = 0;
        for (int item : nums2) {
            if (item == 13 || lastNumber == 13) {
                lastNumber = item;
            } else {
                toplam2 += item;
            }
        }
        System.out.println("13'ler ve bir sonraki indexler hariç dizinin toplamı: " + toplam);
    }
}
