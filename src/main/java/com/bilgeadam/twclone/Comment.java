package com.bilgeadam.twclone;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Comment {

    private String userName;
    private String content;
    private LocalDateTime localDateTime;
    private int likedCount;
    private List<User> likeUsers = new ArrayList<>();

    public Comment(String userName, String content) {
        this.userName = userName;
        this.content = content;
        this.localDateTime = LocalDateTime.now();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public int getLikedCount() {
        return likedCount;
    }

    public void setLikedCount(int likedCount) {
        this.likedCount = likedCount;
    }

    public List<User> getLikeUsers() {
        return likeUsers;
    }

    public void setLikeUsers(List<User> likeUsers) {
        this.likeUsers = likeUsers;
    }
}
