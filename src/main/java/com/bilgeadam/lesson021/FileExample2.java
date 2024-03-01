package com.bilgeadam.lesson021;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExample2 {
    public static void main(String[] args) {

        System.out.println("Satir sayısı:");
        System.out.println("Toplam Karakter sayısı: ");
        System.out.println("Toplam Kelime:");

        //Ödev
        System.out.println("En çok tekrar Eden kelime ");


        satirSayisi();
        karakterSayisi();
        toplamKelime();

    }

    public static void satirSayisi() {
        try (BufferedReader reader = new BufferedReader(new FileReader("mars.txt"))) {
            int sayiSayisi = 0;
            while (reader.readLine() != null) {
                sayiSayisi++;
            }
            System.out.println(sayiSayisi);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void karakterSayisi() {
        try (BufferedReader reader = new BufferedReader(new FileReader("mars.txt"))) {
            int karakterSayisi = 0;
            int okunan;
            while ((okunan = reader.read()) != -1) {
                if ((char) okunan != ' ') {
                    karakterSayisi++;
                }
            }
            System.out.println(karakterSayisi);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void toplamKelime(){
        try (BufferedReader reader = new BufferedReader(new FileReader("mars.txt"))) {
            int toplamKelime = 0;
            String satir;
            while ((satir = reader.readLine()) != null){
                String[] kelimeler = satir.split(" ");
                toplamKelime += kelimeler.length;
            }
            System.out.println(toplamKelime);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
