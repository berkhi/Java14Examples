package com.bilgeadam.lesson013;

import java.time.LocalDateTime;

public class Mail {
    private static final String SENDER = "admin@xbanka.com";
    private String subject;
    private String content;
    private LocalDateTime sendingDate;
    private String sender;
    private Dekont dekont;

    public Mail() {
        this.sendingDate = LocalDateTime.now();
        this.sender = Mail.SENDER;
    }

    public Dekont getDekont() {
        return dekont;
    }

    public void setDekont(Dekont dekont) {
        this.dekont = dekont;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getSendingDate() {
        return sendingDate;
    }

    public void setSendingDate(LocalDateTime sendingDate) {
        this.sendingDate = sendingDate;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}
