package com.bilgeadam.lesson018;

import java.util.*;

public class MapOrnek {

    public static void main(String[] args) {


        //1- Her bir öğrencinin 1 notu olacak şekilde hashmapte tutalım
        String[] ogrenci = {"Ayşe", "Zeynep", "Mehmet"};
        Integer[] notlar = {60,80,70};

        //Hashmap te tutcaz
        //Ayşe - 60
        //Zeynep - 80
        //mehmet 70
        //metot halinde


        //2- Her bir öğrencinin 3 notu olacak şekilde hashmapte tutalım
        Integer[][] notlar2 = {{60,90,70},{60,50,70},{60,40,70}};



        ogrenciNotlari3(ogrenci,notlar2);

    }

    //1
    public static void ogrenciNotlari(String[] ogrenciDizi, Integer[] notlarDizi){
        HashMap<String, Integer> ogrenciNotlari = new HashMap<>();
        for (int i = 0; i < ogrenciDizi.length; i++) {
            ogrenciNotlari.put(ogrenciDizi[i],notlarDizi[i]);
        }
        ogrenciNotlari.entrySet().forEach(k -> System.out.println(k.getKey() + " - " + k.getValue()));

        //ogrenciNotlari.entrySet().forEach(System.out::println);
        /*
        for (Map.Entry<String, Integer> entry : ogrenciNotlari.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
         */
    }

    //2
    public static void ogrenciNotlari2(String[] ogrenciDizi, Integer[][] notlarDizi){
        HashMap<String, Integer[]> ogrenciNotlari = new HashMap<>();
        for (int i = 0; i < ogrenciDizi.length; i++) {
            ogrenciNotlari.put(ogrenciDizi[i],notlarDizi[i]);
        }
        ogrenciNotlari.entrySet().forEach(k -> System.out.println(k.getKey() + " - " + Arrays.toString(k.getValue())));
    }


    //3
    //Hashmap içinde öğgrencileri String, notlarıda List şeklinde tutalım
    public static void ogrenciNotlari3(String[] ogrenciDizi, Integer[][] notlarDizi){
        HashMap<String, ArrayList<Integer>> ogrenciNotlari = new HashMap<>();
        for (int i = 0; i < ogrenciDizi.length; i++) {
            for (int j = 0; j < notlarDizi[i].length; j++) {
                ogrenciNotlari.putIfAbsent(ogrenciDizi[i] , new ArrayList<>());

                ogrenciNotlari.get(ogrenciDizi[i]).add(notlarDizi[i][j]);
            }
        }
        ogrenciNotlari.entrySet().forEach(k -> System.out.println(k.getKey() + " " + k.getValue()));
    }

    public static void ogrenciNotlari4(String[] ogrenciDizi, Integer[][] notlarDizi){
        Map<String, List<Integer>> veriMap = new HashMap<>();

        for (int i = 0; i < ogrenciDizi.length; i++) {
            if(!veriMap.containsKey(ogrenciDizi[i])) {
                veriMap.put(ogrenciDizi[i], new ArrayList<Integer>());
            }
            for (int j = 0; j < notlarDizi[i].length; j++) {
                veriMap.get(ogrenciDizi[i]).add(notlarDizi[i][j]);
            }
        }
        for (Map.Entry<String, List<Integer>> entry : veriMap.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }
    }


}
