package com.bilgeadam.lesson011;

public class Pizza {


    // Pizza sipariş uygulaması

    // Pizza sınıfı oluşturcaz
    // attribute --> price, vejeteryan mı, normal mi;
    // eğer vejeteryan pizza ise fiyat 300tl
    // normal ise fiyat 200 tl. Construtorda yapalım


    // sos ekle--> 50tl eklensin
    // peynirEkle--> 100tl eklensin
    // eve sipariş ver--> 20 tl kruye parası alalım
    // fiş al--> bize pizzamız total price ını vercek

    private int price;
    private boolean isVegie;

    private int sosAdet;
    private int peynirAdet;
    private static final int NORMAL_FIYAT = 200;
    private static final int VEGI_FIYAT = 200;
    private static final int SOS_FIYAT = 50;
    private static final int PEYNIR_FIYAT = 200;
    private static final int KURYE_FIYAT = 60;



    public Pizza(boolean isVegie) {
        this.isVegie = isVegie;
        if (this.isVegie) {
            this.setPrice(VEGI_FIYAT);
        } else {
            this.setPrice(NORMAL_FIYAT);
        }
    }

    public void sosEkle() {
        System.out.println("Sos Eklendi + " + SOS_FIYAT + " TL");
        setPrice(getPrice() + SOS_FIYAT);
        sosAdet++;
    }

    public void sosCikar() {

        if(sosAdet > 0){
            System.out.println("Sos Çıkarıldı + " + SOS_FIYAT + " TL");
            setPrice(getPrice() - SOS_FIYAT);
            sosAdet--;
        }else {
            System.out.println("Sos ekli değil");
        }


    }

    public void peynirEkle() {
        System.out.println("Peynir Ekleindi - " + PEYNIR_FIYAT + " TL");
        setPrice(getPrice() + PEYNIR_FIYAT);
        peynirAdet++;
    }

    public void peynirCikar() {

        if(peynirAdet > 0){
            System.out.println("Peynir Çıkarıldı - " + PEYNIR_FIYAT + " TL");
            setPrice(getPrice() - PEYNIR_FIYAT);
            peynirAdet--;
        }else {
            System.out.println("Peynir ekli değil");
        }
    }


    public int getSosAdet() {
        return sosAdet;
    }

    public void setSosAdet(int sosAdet) {
        this.sosAdet = sosAdet;
    }

    public int getPeynirAdet() {
        return peynirAdet;
    }

    public void setPeynirAdet(int peynirAdet) {
        this.peynirAdet = peynirAdet;
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

    public void setVegie(boolean vegie) {
        isVegie = vegie;
    }

    public void fisAl() {
        System.out.println("Pizza Fiyatı "+ getPrice());
    }
}
