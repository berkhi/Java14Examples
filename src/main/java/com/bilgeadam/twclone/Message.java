package com.bilgeadam.twclone;

public class Message {
    private User user;
    private String icerik;

    public Message(User user, String icerik) {
        this.user = user;
        this.icerik = icerik;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getIcerik() {
        return icerik;
    }

    public void setIcerik(String icerik) {
        this.icerik = icerik;
    }

    @Override
    public String toString() {
        return "Message{" +
                "user=" + user +
                ", icerik='" + icerik + '\'' +
                '}';
    }
}
