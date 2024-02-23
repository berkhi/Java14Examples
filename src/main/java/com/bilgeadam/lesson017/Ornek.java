package com.bilgeadam.lesson017;

import java.util.HashMap;
import java.util.Map;

public class Ornek {
    public static void main(String[] args) {
        int ay = 2;
        int gun = 13;
        find3(ay, gun);
    }

    public static void find(int ay, int gun) {
        int yilinToplamGunu = 0;
        if (ay > 1) yilinToplamGunu += 31;
        if (ay > 2) {
            yilinToplamGunu += 28;
        }
        if (ay > 3) yilinToplamGunu += 31;
        if (ay > 4) yilinToplamGunu += 30;
        if (ay > 5) yilinToplamGunu += 31;
        if (ay > 6) yilinToplamGunu += 30;
        if (ay > 7) yilinToplamGunu += 31;
        if (ay > 8) yilinToplamGunu += 31;
        if (ay > 9) yilinToplamGunu += 30;
        if (ay > 10) yilinToplamGunu += 31;
        if (ay > 11) yilinToplamGunu += 30;
        yilinToplamGunu += gun;
        System.out.println(ay + gun + yilinToplamGunu);
    }

    public static void find2(int ay, int gun) {
        int[] gunSayisi = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int totalGun = gun;

        for (int i = 0; i < ay - 1; i++) {
            totalGun += gunSayisi[i];
        }

        System.out.println(totalGun);
    }

    public static void verilenTariheGoreGecenGun(Integer ay, Integer gun) {
        HashMap<Integer, Integer> hashSet = new HashMap<>();
        hashSet.put(1, 31);
        hashSet.put(2, 28);
        hashSet.put(3, 31);
        hashSet.put(4, 30);
        hashSet.put(5, 31);
        hashSet.put(6, 30);
        hashSet.put(7, 31);
        hashSet.put(8, 31);
        hashSet.put(9, 30);
        hashSet.put(10, 31);
        hashSet.put(11, 31);
        hashSet.put(12, 30);

        Integer toplamGun = 0;
        for (int i = 1; i < ay; i++) {
            toplamGun += hashSet.get(i);
        }
        toplamGun += gun;
        System.out.println(toplamGun);
    }

    public static void find3(int ay, int gun) {
        //4
        //13
        int toplam = 0;
        for (int i = 1; i < ay; i++) {
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10) {
                toplam += 31;
            } else if (i == 4 || i == 6 || i == 9 || i == 11) {
                toplam += 30;

            } else
                toplam += 28;

        }
        toplam = toplam + gun;
        System.out.println(toplam);
    }
}
