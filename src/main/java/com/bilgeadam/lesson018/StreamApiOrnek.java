package com.bilgeadam.lesson018;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiOrnek {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(61);
        sayilar.add(55);
        sayilar.add(78);
        sayilar.add(42);
        sayilar.add(25);

        //5 ile bölünene sayıları bir listeye atalım ve bu listeyi yazdıralım
        //stream api kullanarak
        List<Integer> sayilar2 = new ArrayList<>();

        List<Integer> bolunenler = sayilar  //List<Integer>
                .stream()  //Strem<Integer>
                .filter(sayi -> sayi % 5 == 0) //Stream<Integer>
                .toList();  //List<Integer>

        System.out.println(bolunenler);

        //sayıların kendisi ile çarpıp yeni bir Set e  atalım.

        Set<Integer> carpilanlar = sayilar //List
                .stream() //Stream
                .map(sayi -> sayi * sayi) //Stream
                .collect(Collectors.toSet());  //Set

        System.out.println(carpilanlar);


        //kaç tane 5 e bölünen sayı var onu bulalaım
        long bolunenAdet = sayilar //List
                .stream() //Stream
                .filter(sayi -> sayi % 5 == 0) //Stream<Integer>  = [55,25]
                .count();
        System.out.println(bolunenAdet);

    }
}
