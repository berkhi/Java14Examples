package com.bilgeadam.twclone;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Profile {

    private String id;
    private int tweetCount;
    private int followerCount;
    private int followingCount;
    private String photo;
    private Address address;
    private List<User> followers = new ArrayList<>();
    private List<User> followings = new ArrayList<>();
    private List<Tweet> tweets = new ArrayList<>();
    private List<User> engellenenler = new ArrayList<>();
    private List<Message> gelenKutus = new ArrayList<>();

    public Profile(){
        this.id = UUID.randomUUID().toString();
    }


    public List<Message> getGelenKutus() {
        return gelenKutus;
    }

    public void setGelenKutus(List<Message> gelenKutus) {
        this.gelenKutus = gelenKutus;
    }

    public List<User> getEngellenenler() {
        return engellenenler;
    }

    public void setEngellenenler(List<User> engellenenler) {
        this.engellenenler = engellenenler;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getTweetCount() {
        return tweetCount;
    }

    public void setTweetCount(int tweetCount) {
        this.tweetCount = tweetCount;
    }

    public int getFollowerCount() {
        return followerCount;
    }

    public void setFollowerCount(int followerCount) {
        this.followerCount = followerCount;
    }

    public int getFollowingCount() {
        return followingCount;
    }

    public void setFollowingCount(int followingCount) {
        this.followingCount = followingCount;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<User> getFollowers() {
        return followers;
    }

    public void setFollowers(List<User> followers) {
        this.followers = followers;
    }

    public List<User> getFollowings() {
        return followings;
    }

    public void setFollowings(List<User> followings) {
        this.followings = followings;
    }

    public List<Tweet> getTweets() {
        return tweets;
    }

    public void setTweets(List<Tweet> tweets) {
        this.tweets = tweets;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "tweetCount=" + tweetCount +
                ", followerCount=" + followerCount +
                ", followingCount=" + followingCount +
                ", photo='" + photo + '\'' +
                ", address=" + address +
                ", engellenenler=" + engellenenler +
                '}';
    }
}
