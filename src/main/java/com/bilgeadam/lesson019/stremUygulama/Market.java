package com.bilgeadam.lesson019.stremUygulama;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Market {

    List<Urun> productList = new ArrayList<>();

    public Market() {
        urunleriOlustur();
        urunleriGoster();
    }

    private void urunleriOlustur() {
        EUrun[] urunler = EUrun.values();
        //List<EUrun> = [EUrun,EUrun,EUrun,EUrun,EUrun]

        productList = Arrays.asList(urunler)
                .stream()
                .map(urun -> new Urun(urun.name(), urun.getFiyat()))
                .collect(Collectors.toList());
    }

    private void urunleriGoster() {
        productList.forEach(u -> System.out.println(u.getName() + " " + u.getPrice()));
    }




}
