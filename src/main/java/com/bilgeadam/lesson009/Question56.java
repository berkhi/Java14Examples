package com.bilgeadam.lesson009;

public class Question56 {
    public static void main(String[] args) {
        // 1 den 1000 e kadar olan sayıların asal olanlarını bulan methodu yazalım
        // asalMi methodunuz yazcaz, bu metotta sadece sayı asal mı diye bakıyoruz
        // daha sonra mainde for döngüsüne sokup bulucaz

        bineKadarAsallar();

    }

    public static void asalMi(int sayi) {
        boolean asalmi = true;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                asalmi = false;
            }
        }
        if (asalmi) {
            System.out.println(sayi + " Asaldır");
        }
    }

    public static void bineKadarAsallar(){
        for (int i = 2; i < 1000; i++) {
            asalMi(i);
        }
    }
}
