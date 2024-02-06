package com.bilgeadam.lesson013;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class User {
    private String name;
    private String surname;
    private String email;
    private Account account;
    private List<Mail> gelenKutusu;

    //Bir nesnenini farklı bir nesnenin referansı tutabilme özelliği

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.email = UserUtil.generateEmail(name, surname);
        this.gelenKutusu = new ArrayList<>();

    }

    public List<Mail> getGelenKutusu() {
        return gelenKutusu;
    }

    public void setGelenKutusu(List<Mail> gelenKutusu) {
        this.gelenKutusu = gelenKutusu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
