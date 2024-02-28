package com.bilgeadam.lesson019.stremUygulama;

import java.util.*;
import java.util.stream.Collectors;

public class Market {

    List<Urun> productList = new ArrayList<>();

    Map<String,Integer> sepet = new HashMap<>();

    double sepetTutari = 0;

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


    public void sepeteEkle(){
        System.out.println("Ürünü Girin: ");
        Scanner scanner = new Scanner(System.in);

        String isim = scanner.nextLine();

        System.out.println("Kaç adet istersiniz: ");
        int adet = scanner.nextInt();

        for (int i = 0; i <productList.size(); i++) {
            if(isim.equalsIgnoreCase(productList.get(i).getName())){
                sepet.put(isim,sepet.getOrDefault(isim,0) + adet);
                this.sepetTutari = this.sepetTutari + productList.get(i).getPrice() * adet;
            }
        }
        System.out.println("Sepet Tutarı: " + this.sepetTutari);
    }

    public void sepetiGoster(){
        sepet.forEach((k,v) -> System.out.println(k + " - " + v));
    }


    //sepeteUrunEkleMetodu()
    //sepetiGoster();




}
