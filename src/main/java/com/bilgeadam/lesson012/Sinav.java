package com.bilgeadam.lesson012;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Sinav {

    private int sure;
    private int soruSayisi;
    private int puan;
    private String ders;
    private String konu;
    private Soru[] sorular;
    private String[] cevaplar; //kullanıcını girdiği cevapları burda tutuyoruz

    public Sinav() {

    }

    public int getSure() {
        return sure;
    }

    public void setSure(int sure) {
        this.sure = sure;
    }

    public int getSoruSayisi() {
        return soruSayisi;
    }

    public void setSoruSayisi(int soruSayisi) {
        this.soruSayisi = soruSayisi;
    }

    public String getDers() {
        return ders;
    }

    public void setDers(String ders) {
        this.ders = ders;
    }

    public String getKonu() {
        return konu;
    }

    public void setKonu(String konu) {
        this.konu = konu;
    }

    public Soru[] getSorular() {
        return sorular;
    }

    public void setSorular(Soru[] sorular) {
        this.sorular = sorular;
    }

    public String[] getCevaplar() {
        return cevaplar;
    }

    public void setCevaplar(String[] cevaplar) {
        this.cevaplar = cevaplar;
    }


    public void sinavOlustur() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen sınavın dersini girin: ");
        ders = scanner.nextLine();

        System.out.println("Sınav Konusunu Girin: ");
        konu = scanner.nextLine();

        System.out.println("Sınav Süresi: ");
        sure = scanner.nextInt();

        System.out.println("Soru Sayısı : ");
        soruSayisi = scanner.nextInt();

        sorular = new Soru[soruSayisi];

        for (int i = 0; i < sorular.length; i++) {
            Soru soru = new Soru();

            soru.soruOlustur(Option.cevapSecenekleri);
            sorular[i] = soru;
        }
    }

    public void cevapGir() {
        Scanner scanner = new Scanner(System.in);

        //new String[1]
        cevaplar = new String[sorular.length];

        for (int i = 0; i < sorular.length; i++) {

            //Sorunun kendisini yazdırdık OOP Nedir?
            System.out.println(sorular[i].getIcerik());
            for (int j = 0; j < sorular[i].getCevapIcerkileri().length; j++) {
                //A) güzel bişeydir
                //B) kötü bişeydir
                //C) kötü bişeydir
                //D) kötü bişeydir
                System.out.println(Option.cevapSecenekleri[j] + ") " + sorular[i].getCevapIcerkileri()[j]);
            }
            System.out.println("Cevabınızı Girin: ");
            cevaplar[i] = scanner.nextLine().toUpperCase();
        }
    }

    public void sinaviOku() {
        int dogru = 0;
        int yanlis = 0;
        int puan = 0;

        //öğrencinin girdiği cevaplara erişcez
        //sorunun içindeki doğru cevap ile karşılaştırcaz

        for (int i = 0; i < sorular.length; i++) {
            if (cevaplar[i].equalsIgnoreCase(sorular[i].getDogurCevap())) {
                dogru++;
                puan += sorular[i].getPuan();
            } else {
                yanlis++;
            }
        }

        System.out.println("Doğru sayınız: " + dogru);
        System.out.println(";Yanlış sayınız: " + yanlis);
        System.out.println("Puanınız : " + puan);


    }
}
