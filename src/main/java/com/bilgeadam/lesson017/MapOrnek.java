package com.bilgeadam.lesson017;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapOrnek {


    //kullanıcdan bir kelime alalım
    //ve girilen kelimede hangi harften kaç tane var onu yazdıralım.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("kelime");

        String kelime = scanner.nextLine();

        Map<Character, Integer> hashMap = new HashMap<>();

        //j , 1
        //a, 2
        /*
        for (int i = 0; i < kelime.length(); i++) {
            if (!hashMap.containsKey(kelime.charAt(i))) {
                hashMap.put(kelime.charAt(i), 1);
            } else {
                //
                int sayac = hashMap.get(kelime.charAt(i));
                hashMap.put(kelime.charAt(i), sayac + 1);
            }
        }
        System.out.println(hashMap);
         */

        for (int i = 0; i < kelime.length(); i++) {
            char harf = kelime.charAt(i);
            hashMap.put(harf, hashMap.getOrDefault(harf, 0) + 1);
        }
        //System.out.println(hashMap);

        hashMap.entrySet().forEach(map -> System.out.println(map.getKey() + " " + map.getValue()));

        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

}
