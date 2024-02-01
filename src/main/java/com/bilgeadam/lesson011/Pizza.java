package com.bilgeadam.lesson011;

public class Pizza {
    private int price;
    private boolean isVegie;

    // Constant
    private static final int NORMAL_FIYAT = 200;
    private static final int VEGI_FIYAT = 300;

    private static final int SOS_FIYATI = 50;
    private static final int PEYNIR_FIYATI = 100;

    private static final int KURYE_FIYATI = 20;

    // 16:01

    public Pizza() {

    }

    public Pizza(boolean isVegie) {
        this.isVegie = isVegie;

        if (this.isVegie) {
            this.setPrice(VEGI_FIYAT);
        } else {
            this.setPrice(NORMAL_FIYAT);
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isVegie() {
        return isVegie;
    }

    public void setVegie(boolean isVegie) {
        this.isVegie = isVegie;
    }

    public void sosEkle() {
        System.out.println("SosEklendi " + SOS_FIYATI);
        setPrice(getPrice() + SOS_FIYATI);
    }

    public void peynirEkle() {
        System.out.println("Peynir Eklendi " + PEYNIR_FIYATI);
        setPrice(getPrice() + PEYNIR_FIYATI);
    }

    public void eveSiparisVer() {
        setPrice(getPrice() + KURYE_FIYATI);
    }

    public void fisAl() {
        System.out.println("Toplam Ücret--> " + getPrice());
    }

    public void sosCikar() {

        System.out.println("Sos Çıkarıldı " + SOS_FIYATI);
        setPrice(getPrice() - SOS_FIYATI);

    }

    public void peynirCikar() {

        System.out.println("Peynir Çıkarıldı " + PEYNIR_FIYATI);
        setPrice(getPrice() - PEYNIR_FIYATI);

    }
}
