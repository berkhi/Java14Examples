package com.bilgeadam.lesson016;

import java.util.PriorityQueue;
import java.util.Queue;

public class AcilServis {
    public static void main(String[] args) {

        //Hasta diye bir sınıf oluşturalım

        //öceliğe göre sıralama yapcaz

        //Apantis ise --> en yüksek öncelik

        //Yanık --> orta öncelik

        //Baş ağrısı ise --> en düşük öncelik

        //isim, şikayet

        //Şikayetleri enuma taşıyalım
        //önceliğide farklı metotta belirleyelim

        Queue<Hasta> acilServis = new PriorityQueue<>();

        acilServis.offer(new Hasta("Mustafa", "Apandist"));
        acilServis.offer(new Hasta("Oguz", "Apandist"));
        acilServis.offer(new Hasta("Kemal", "Agrı"));
        acilServis.offer(new Hasta("Ayşe", "Yanık"));
        acilServis.offer(new Hasta("Zeliha", "Yanık"));
        acilServis.offer(new Hasta("Okan", "Apandist"));
        acilServis.offer(new Hasta("Orhan", "Yanık"));
        acilServis.offer(new Hasta("Merve", "Yanık"));
        acilServis.offer(new Hasta("Gizem", "Agrı"));
        acilServis.offer(new Hasta("Muharrem", "Apandist"));
        acilServis.offer(new Hasta("Muharrem", Sikayet.YANIK));


        System.out.println("------");
        System.out.println(Sikayet.APANDIS.ordinal());
        System.out.println("------");

        while (!acilServis.isEmpty()){
            System.out.println(acilServis.peek().getIsim() + " Şikayeti " + acilServis.peek().getSikayet() + " " + acilServis.poll().getOncelik());
        }



    }
}
