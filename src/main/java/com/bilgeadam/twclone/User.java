package com.bilgeadam.twclone;

public class User extends Person{

    private String phone;
    private Profile profil;
    private Status status;

    public User(String username, String password,String phone) {
        super(username, password);
        this.phone = phone;
        this.status = Status.ACTIVE;
        this.profil = new Profile();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Profile getProfil() {
        return profil;
    }

    public void setProfil(Profile profil) {
        this.profil = profil;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
