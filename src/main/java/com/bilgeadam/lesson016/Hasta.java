package com.bilgeadam.lesson016;

public class Hasta implements Comparable<Hasta> {

    private String isim;
    private String sikayet;
    private Sikayet sikayetEnum;
    private int oncelik;

    public Hasta(String isim, String sikayet) {
        this.isim = isim;
        this.sikayet = sikayet;
        this.oncelik = sikayet.equalsIgnoreCase("Apandist") ? 1 : sikayet.equalsIgnoreCase("Yanık") ? 2 :
                sikayet.equalsIgnoreCase("Agrı") ? 3 : 4;
        //oncelikBelirle(sikayet);

    }

    public Hasta(String isim, Sikayet sikayet) {
        this.isim = isim;
        this.sikayetEnum = sikayet;
        oncelikBelirle(sikayet);
        //this.oncelik = sikayet.ordinal();
    }

    public void oncelikBelirle(String sikayet) {
        if (sikayet.equalsIgnoreCase("Apandist")) {
            this.oncelik = 1;
        } else if (sikayet.equalsIgnoreCase("Yanık")) {
            this.oncelik = 2;
        } else {
            this.oncelik = 3;
        }
    }

    public void oncelikBelirle(Sikayet sikayet){
        switch (sikayet){
            case APANDIS -> this.oncelik = 1;
            case YANIK -> this.oncelik = 2;
            case AGRI -> this.oncelik = 3;
            default -> System.out.println("Hastanemiz bu hastaya bakamaz: ");
        }
    }

    public Sikayet getSikayetEnum() {
        return sikayetEnum;
    }

    public void setSikayetEnum(Sikayet sikayetEnum) {
        this.sikayetEnum = sikayetEnum;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSikayet() {
        return sikayet;
    }

    public void setSikayet(String sikayet) {
        this.sikayet = sikayet;
    }

    public int getOncelik() {
        return oncelik;
    }

    public void setOncelik(int oncelik) {
        this.oncelik = oncelik;
    }

    @Override
    public int compareTo(Hasta o) {
        if (o.getOncelik() > this.getOncelik()) {
            return -1;
        } else if (o.getOncelik() < this.oncelik) {
            return 1;
        }
        return 0;
    }
}
