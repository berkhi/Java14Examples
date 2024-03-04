package com.bilgeadam.lesson0222;


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

        try (ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream("Ogrenciler.txt", true))) {

            writer.writeObject(ogrenci);
            SinavSistemi.ogrenciler.add(ogrenci);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Ogrenci login() {
        String name = Util.getStringValue("Kullanıcı Adı Girin:");
        String password = Util.getStringValue("Şifre Girin:");
        Ogrenci ogrenci = findByNameAndPassword(name, password);

        if (ogrenci != null) {
            System.out.println("Giriş Başarılı");
            return ogrenci;
        }
        throw new RuntimeException("Kullanıcı Bulunamadı");
    }

    private Ogrenci findByNameAndPassword(String name, String password) {
        for (Ogrenci ogrenci : SinavSistemi.ogrenciler) {
            if (ogrenci.getName().equals(name) && ogrenci.getPassword().equals(password)) {
                return ogrenci;
            }
        }
        return null;
    }
}
