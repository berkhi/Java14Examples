package com.bilgeadam.lesson019.stremUygulama;

public enum EUrun {

    CIPS(50), KOLA(30), GOFRET(20), SUT(10), KEK(15);

    private double fiyat;

    EUrun(double fiyat) {
        this.fiyat = fiyat;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }
}
