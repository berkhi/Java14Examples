package com.bilgeadam.lesson0222;

public class Ogrenci {

    private String name;
    private String ogrenciNo;
    private String password;
    private int puan;


    public Ogrenci(String name, String password) {
        this.name = name;
        this.password = password;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPuan() {
        return puan;
    }

    public void setPuan(int puan) {
        this.puan = puan;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "name='" + name + '\'' +
                ", ogrenciNo='" + ogrenciNo + '\'' +
                ", password='" + password + '\'' +
                ", puan=" + puan +
                '}';
    }
}

