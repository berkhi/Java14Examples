package com.bilgeadam.lesson015;

import java.util.ArrayList;

public class ArrayListOrnek {


    // bitane arraylist oluşturalım içine
    // bi kaç tane şehir atalım
    // şehirleden "an" ile başlayan var ise bunu "xxx" olarak değiştirelim

    public static void main(String[] args) {

        ArrayList<String> sehiler = new ArrayList<>();

        sehiler.add("Ankara");
        sehiler.add("Antep");
        sehiler.add("Yozgat");
        sehiler.add("Antalya");
        sehiler.add("Bodrum");
        sehiler.add("İzmir");
        sehiler.add("ankara");
        sehiler.add("istanbul");

        degerDegistirme2(sehiler);


    }

    public static void degerDegistirme(ArrayList<String> list){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).toLowerCase().startsWith("an")){

                list.set(i,list.get(i).toLowerCase().replaceFirst("an","xxx"));
            }
        }
        list.forEach(s-> System.out.println(s));
    }

    public static void degerDegistirme2(ArrayList<String> list){
        list.replaceAll(city -> city.toLowerCase().replaceAll("an","xxx"));

        list.forEach(s-> System.out.println(s));
    }


    //bütün kelimeyi xxx yapar.
    public static void degerDegistirme3(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).toLowerCase().startsWith("an")) {
                list.set(i, "xxx");
            }
        }
        list.forEach(deger -> System.out.println(deger));

        for (String string : list) {
            System.out.println(string);
        }
    }

}
