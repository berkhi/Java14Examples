package com.bilgeadam.lesson018;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Deneme {


    //Verilen karakter dizilerinden yalnızca tüm dizilerde ortak olarak bulunan karakterleri
    // döndüren bir fonksiyonu Türkçe'ye çevirelim. Verilen örnekte, karakter dizileri
    // bella, label ve roller'dan
    // ortak karakterleri bulmamız gerekiyor.


    public static void main(String[] args) {
        String[] strings = {"bellae", "labele", "rollere"};
        //String[] commonChars = commonCharacters(strings);
        //System.out.println("Common characters: " + String.join(", ", commonChars));
        commonCharacters2(strings);
    }

    public static void commonCharacters2(String[] strings) {

        ArrayList<Character> ortakKarakterler = new ArrayList<>();

        //ortakKarakterler = [b e l l a e]
        for (int i = 0; i < strings[0].length(); i++) {
            ortakKarakterler.add(strings[0].charAt(i));
        }
        for (int i = 1; i < strings.length; i++) {
            //currentKarakter = [r o l l e r e]
            ArrayList<Character> currentKarakter = new ArrayList<>();
            for (int j = 0; j < strings[i].length(); j++) {
                currentKarakter.add(strings[i].charAt(j));
            }
            //[b e l l a e]  [l a b e l e]
            //[b e l l a e]  [r o l l e r e]
            //[e l l e]
            ortakKarakterler.retainAll(currentKarakter);
        }
        System.out.println(ortakKarakterler);
    }


    public static String[] commonCharacters(String[] strings) {
        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : strings[0].toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (int i = 1; i < strings.length; i++) {
            Map<Character, Integer> tempCount = new HashMap<>();
            for (char c : strings[i].toCharArray()) {
                if (charCount.containsKey(c)) {
                    tempCount.put(c, tempCount.getOrDefault(c, 0) + 1);
                }
            }

            for (char c : charCount.keySet()) {
                if (tempCount.containsKey(c)) {
                    charCount.put(c, Math.min(charCount.get(c), tempCount.get(c)));
                } else {
                    charCount.put(c, 0);
                }
            }
        }

        List<String> result = new ArrayList<>();
        for (char c : charCount.keySet()) {
            for (int i = 0; i < charCount.get(c); i++) {
                result.add(String.valueOf(c));
            }
        }
        return result.toArray(new String[0]);
    }
}
