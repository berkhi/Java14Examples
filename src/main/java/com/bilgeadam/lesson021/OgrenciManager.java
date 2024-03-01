package com.bilgeadam.lesson021;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OgrenciManager {


    List<Ogrenci> ogrenciList = new ArrayList<>();

    //String --> 8 byte

    public void ogrenciListesiOlustur() {

        try (BufferedReader reader = new BufferedReader(new FileReader("deneme.txt"))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] dizi = line.split(",");  //{Mustafa,55,55,55}
                double ortalama = ortalamaHesapla2(Arrays.asList(dizi));
                Ogrenci ogrenci = new Ogrenci(dizi[0], ortalama);
                ogrenciList.add(ogrenci);

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(ogrenciList);
    }

    private double ortalamaHesapla(List<String> list) {
        double toplam = 0;
        double ortalama;
        for (int i = 1; i < list.size(); i++) {
            toplam += Integer.parseInt(list.get(i));
        }
        ortalama = toplam / (list.size() - 1);
        return ortalama;
    }

    private double ortalamaHesapla2(List<String> list) {
        return list.stream().skip(1).mapToDouble(Double::parseDouble).average().orElse(0);
    }


    //listenini içine attıgımız öğrencileri not ortalama diye bir dosyaya yazalım

    //serilize işlemi yaptık
    public void dosyayaYaz() {
        try (ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream("notortalamalari.txt"))) {
            writer.writeObject(ogrenciList);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //deSerilize etmek gerekiyor.
    public void dosyayaOku() {
        try (ObjectInputStream reader = new ObjectInputStream(new FileInputStream("notortalamalari.txt"))) {
            List<Ogrenci> okunan = (List<Ogrenci>) reader.readObject();

            for (Ogrenci ogrenci : okunan) {
                System.out.println(ogrenci);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
