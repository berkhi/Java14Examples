package com.bilgeadam.lesson016;

import java.util.HashSet;
import java.util.Set;

public class SetOrnek {


    // 2 tane set oluşturalım
    // tekrarEdenler, tekrar etmeyenler
    // kullanıcdan bir kelime alcaz
    // eğer tekrar eden harf varsa tekraredenler setine atalım
    // ve tekrar etmeyenlerden çıkaralım


    //kullanıcı -> java
    //tekraredenler--> a
    //tekrarEtmeyenler --> j,v

    public static void main(String[] args) {

        Set<Character> tekrarEdenler = new HashSet<>();
        Set<Character> tekrarEtmeyenler = new HashSet<>();

        String kelime = "javaajavajSpringg";

        //tekrarEtmeyenler --> ,v
        //tekrarEdenler --> a , j

        //i = 0, 1, 2, 3
        for (int i = 0; i < kelime.length(); i++) {
            if (!tekrarEdenler.contains(kelime.charAt(i)) && !tekrarEtmeyenler.add(kelime.charAt(i))) {
                tekrarEdenler.add(kelime.charAt(i));
                tekrarEtmeyenler.remove(kelime.charAt(i));
            }
        }
        System.out.println("Tekrar Edenler " + tekrarEdenler);
        System.out.println("Tekrar Etmeyenler " + tekrarEtmeyenler);
        System.out.println("----------------");
        metod(kelime);


    }

    public static void metod(String veri) {
        HashSet<Character> tekrarsizHali = new HashSet<>();
        HashSet<Character> tekrarEdenler = new HashSet<>();
        HashSet<Character> essiz = new HashSet<>();

        for (int i = 0; i < veri.length(); i++) {
            boolean add = tekrarsizHali.add(veri.charAt(i));
            if (!add) {
                tekrarEdenler.add(veri.charAt(i));
            }
        }
        System.out.println(tekrarEdenler);
        for (Character c : tekrarsizHali) {
            boolean add = tekrarEdenler.add(c);
            if (add) {
                essiz.add(c);
            }
        }
        System.out.println(essiz);
    }

}
