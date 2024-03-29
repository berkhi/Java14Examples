package com.bilgeadam.lesson013;

public class Account {
    public final static int KREDI_PUAN_MIKTARI = 10;

    private String accountNo;
    private double balance;
    private boolean krediBasvurusu;
    private double istenenKrediMiktari;
    private double krediBorcu;
    private int krediPuani;

    public Account(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public double getKrediBorcu() {
        return krediBorcu;
    }

    public void setKrediBorcu(double krediBorcu) {
        this.krediBorcu = krediBorcu;
    }

    public int getKrediPuani() {
        return krediPuani;
    }

    public void setKrediPuani(int krediPuani) {
        this.krediPuani = krediPuani;
    }

    public double getIstenenKrediMiktari() {
        return istenenKrediMiktari;
    }

    public void setIstenenKrediMiktari(double istenenKrediMiktari) {
        this.istenenKrediMiktari = istenenKrediMiktari;
    }

    public boolean isKrediBasvurusu() {
        return krediBasvurusu;
    }

    public void setKrediBasvurusu(boolean krediBasvurusu) {
        this.krediBasvurusu = krediBasvurusu;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /*
    public void paraYatir(double miktar) {
        if (miktar <= 10000) {
            balance += miktar;
            System.out.println(miktar + " Tl hesaba yatırıldı güncel Bakiye: " + balance);
        } else {
            System.out.println("Max 10.000Tl yatırabilirsiniz.");
        }
    }

    public void paraCek(double miktar) {
        if (miktar <= balance) {
            balance -= miktar;
            System.out.println(miktar + " Tl hesaptan çekildi güncel Bakiye: " + balance);
        } else {
            System.out.println("Yetersiz bakiye Bakiyeniz: " + balance);
        }
    }

     */

    //burdaki para çek ve para yatır sınıfını
    //AccountManager sınıfına taşıyalım
}
