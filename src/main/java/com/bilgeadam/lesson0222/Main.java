package com.bilgeadam.lesson0222;

import com.bilgeadam.twclone.Util;

public class Main {


    static OgrenciManager ogrenciManager = new OgrenciManager();

    public static void main(String[] args) {


        userPage();
    }


    public static void userPage() {
        while (true) {
            System.out.println("1- Register");
            System.out.println("2- Login");
            System.out.println("0 -Sistemi kapa");
            int secim = Util.getIntegerValue("Seçiminizi girin");
            switch (secim) {
                case 1:
                    ogrenciManager.register();
                    break;
                case 2:
                    Ogrenci loginUser = ogrenciManager.login();
                    sinavSistemi(loginUser);
                    break;
            }
        }
    }

    private static void sinavSistemi(Ogrenci loginUser) {
        while (true) {
            System.out.println("1- Sınavı Başlat");
            System.out.println("2- Öğrencilerin notlarını Göster ");
            System.out.println("3- Üst Menü ");
            System.out.println("0- Sistemi Kapat");
            int secim = Util.getIntegerValue("Seçiminizi girin");
            switch (secim){
                case 1:

                    //Odev
                    //Soru.txt dosyasındaki verilerler soru nesnesi üretip sınavı başlatalım
                    //Exception yapısı oluşturalım
                    //CustomException --> UserNotFoundException
                    //UserAlreadyException
                    //metotları bu yapuıya göre refactor edelim.

                    //opsiyonel --> sorunun süresi olsun
                    //soru geldikten sonra o soru için süre bitince sonraki sorya geçsin.


                    //Tüm öğrencilerin notlarını göster metodu.

            }

        }
    }
}
