package com.bilgeadam.twclone;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Tweet {

    private String id;
    private String content;
    private LocalDateTime postDate;
    private int commentCount;
    private int likeCount;
    private List<User> likedUsers =new ArrayList<>();
    private List<Comment> comments = new ArrayList<>();

    public Tweet(String content) {
        this.id = UUID.randomUUID().toString();
        this.postDate = LocalDateTime.now();
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getPostDate() {
        return postDate;
    }

    public void setPostDate(LocalDateTime postDate) {
        this.postDate = postDate;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public List<User> getLikedUsers() {
        return likedUsers;
    }

    public void setLikedUsers(List<User> likedUsers) {
        this.likedUsers = likedUsers;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Tweet{" +
                "id='" + id + '\'' +
                ", content='" + content + '\'' +
                ", postDate=" + postDate +
                ", commentCount=" + commentCount +
                ", likeCount=" + likeCount +
                ", comments=" + comments +
                '}';
    }
}

