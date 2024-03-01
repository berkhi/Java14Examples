package com.bilgeadam.lesson021;

public class Main {
    public static void main(String[] args) {

        OgrenciManager ogrenciManager = new OgrenciManager();

        ogrenciManager.ogrenciListesiOlustur();
        ogrenciManager.dosyayaYaz();
        System.out.println("Dosyaya yazıldı");
        ogrenciManager.dosyayaOku();
    }
}
