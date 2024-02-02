package com.bilgeadam.lesson012;

import java.util.Scanner;

public class Soru {

    private int puan;
    private String icerik;
    private String dogurCevap;

    private String[] cevapIcerkileri; //A şıkkında yazan değer, B şıkkında yazan değer

    public Soru() {

    }

    public int getPuan() {
        return puan;
    }

    public void setPuan(int puan) {
        this.puan = puan;
    }

    public String getIcerik() {
        return icerik;
    }

    public void setIcerik(String icerik) {
        this.icerik = icerik;
    }

    public String getDogurCevap() {
        return dogurCevap;
    }

    public void setDogurCevap(String dogurCevap) {
        this.dogurCevap = dogurCevap;
    }

    public String[] getCevapIcerkileri() {
        return cevapIcerkileri;
    }

    public void setCevapIcerkileri(String[] cevapIcerkileri) {
        this.cevapIcerkileri = cevapIcerkileri;
    }

    public void soruOlustur(String[] cevapSecenekleri) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen soruyu girin: ");
        icerik = scanner.nextLine();

        cevapIcerkileri = new String[Option.cevapSecenekleri.length];

        for (int i = 0; i < cevapIcerkileri.length; i++) {
            System.out.println("Lütfen " + cevapSecenekleri[i] + " Şıkkını Girin");
            cevapIcerkileri[i] = scanner.nextLine();
        }

        System.out.println("Bir tane doğru cevap belirleyin");
        dogurCevap = scanner.nextLine().toUpperCase();

        System.out.println("Sorunun puanı ? ");
        puan = scanner.nextInt();

    }

    //Sorunun ne oldugunu
    //şıklarını tanımladık
    //hangisi doğru cevap
}
