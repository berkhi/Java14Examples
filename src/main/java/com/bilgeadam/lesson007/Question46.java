package com.bilgeadam.lesson007;

public class Question46 {
    public static void main(String[] args) {
        // bir dizide ard arda gelen 2 indexin sayı değeri 2 ise tru yoksa false
        // yazdıralım

        int[] sayilar = {2, 2, -256, -256, 2, 1258,2};

        int sayac = 0;

        boolean isDoubleTwo = false;
        for (int i = 0; i < sayilar.length; i++) {
            if (i < sayilar.length - 1) {
                if (sayilar[i] == 2 && sayilar[i + 1] == 2) {
                    isDoubleTwo = true;
                    sayac++;

                }
            }

        }
        System.out.println(isDoubleTwo);
        System.out.println(sayac);
    }
}
