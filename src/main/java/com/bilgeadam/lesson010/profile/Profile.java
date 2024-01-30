package com.bilgeadam.lesson010.profile;

public class Profile {

    //filed, attribute, property
    private String username;
    private String description;
    private String imageUrl;
    private int follower;
    private int following;
    private boolean isBlueTick;
    private int postSize;
    private String[] posts = new String[10];

    public Profile() {

    }

    public Profile(String username, String description, String imageUrl) {
        this.username = username;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    public int getPostSize() {
        return postSize;
    }

    public void setPostSize(int postSize) {
        this.postSize = postSize;
    }

    public String[] getPosts() {
        return posts;
    }

    public void setPosts(String[] posts) {
        this.posts = posts;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getFollower() {
        return follower;
    }

    public void setFollower(int follower) {
        this.follower = follower;
    }

    public int getFollowing() {
        return following;
    }

    public void setFollowing(int following) {
        this.following = following;
    }

    public boolean isBlueTick() {
        return isBlueTick;
    }

    public void setBlueTick(boolean blueTick) {
        isBlueTick = blueTick;
    }

    public void bilgileriGoster() {
        System.out.println(toString());
    }

    public void postOlustur(String postDescription) {
        posts[postSize] = postDescription;
        //String[] posts = {"Ankarada 1 gün", null null ,null null null,null null null};
        System.out.println(username + " " + posts[postSize] + " Postunu Oluşturuldu");
        postSize++;
    }

    public void postlariGoster() {
        for (int i = 0; i < postSize; i++) {
            System.out.println(posts[i]);
        }
    }


    public void istegiKabulEt() {
        if (!isBlueTick) {
            maviTikKontrol();
        }
        follower++;
    }

    public void takiptenCikar() {
        follower--;
        maviTikKontrol();
    }

    private void maviTikKontrol() {
        if (this.follower > 5) {
            isBlueTick = true;
        } else {
            isBlueTick = false;
        }
    }


    @Override
    public String toString() {
        return "Profile{" +
                "username='" + username + '\'' +
                ", description='" + description + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", follower=" + follower +
                ", following=" + following +
                ", isBlueTick=" + isBlueTick +
                '}';
    }
}
