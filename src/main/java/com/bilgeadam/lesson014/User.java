package com.bilgeadam.lesson014;

import java.time.LocalDateTime;

public class User {

    private String username;
    private String password;
    private LocalDateTime signDate;
    private UserStatus userStatus;
    public User(){

    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.signDate = LocalDateTime.now();
    }

    public UserStatus getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getSignDate() {
        return signDate;
    }

    public void setSignDate(LocalDateTime signDate) {
        this.signDate = signDate;
    }
}
