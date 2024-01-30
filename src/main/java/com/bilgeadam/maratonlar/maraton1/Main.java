package com.bilgeadam.maratonlar.maraton1;

public class Main {
    public static void main(String[] args) {

        int sayiDizisi[] = {9, 7, 5, 7, 9, 3, 7, 3, 18, 9, 2, 0, 7};


        int tekrarSayisi = 0;
        boolean kontrol = false;

        for (int i = 0; i < sayiDizisi.length; i++) {
            tekrarSayisi = 0;
            for (int j = i + 1; j < sayiDizisi.length; j++) {
                if (sayiDizisi[i] == sayiDizisi[j]) {
                    tekrarSayisi++;
                }
            }
            if (tekrarSayisi > 1) {
                System.out.println(sayiDizisi[i] + " sayisi " + tekrarSayisi + " kez tekrar etmiş");
                kontrol = true;
            }
        }
        if (kontrol == false) {
            System.out.println("tekrar eden sayı bulunamamıstır");
        }
    }
}


