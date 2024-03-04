package com.bilgeadam.lesson022;

import com.bilgeadam.twclone.Util;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class OgrenciManager {
    public void register() {
        String isim = Util.getStringValue("Kullanıcı Adı Girin:");
        String password = Util.getStringValue("Şifre Girin:");

        Ogrenci ogrenci = new Ogrenci(isim, password);
        try (ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream("Aogrenciler.txt", true))) {
            writer.writeObject(ogrenci);
            SinavSistemi.ogrenciler.add(ogrenci);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Kayıt Başarılı Sisteme Hoşgeldiniz ");
    }

    public Ogrenci login() {
        String isim = Util.getStringValue("Kullanıcı Adı Girin:");
        String password = Util.getStringValue("Şifre Girin:");
        Ogrenci ogrenci = findByUsernameAnPassword(isim, password);
        if (ogrenci != null) {
            System.out.println("Giriş başarılı");
            return ogrenci;
        } else {
            throw new  RuntimeException("Kullanıcı Bulanamadıı");
        }
    }

    private Ogrenci findByUsernameAnPassword(String isim, String password) {
        for (Ogrenci ogrenci : SinavSistemi.ogrenciler) {
            if(ogrenci.getAd().equals(isim) && ogrenci.getPassword().equals(password)) {
                return ogrenci;
            }
        }
        return null;
    }
}
