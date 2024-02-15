package com.bilgeadam.twclone;

import com.bilgeadam.lesson008.Data;

public class UserManager implements PersonService {

    public void register() {
        String username = Util.getStringValue("Usernameni gir");
        String phone = Util.getStringValue("Telefon gir");

        while (true) {
            String password = Util.getStringValue("pasword gir");
            String rePassowrd = Util.getStringValue("pasowrd tekrar gir");

            if (!isPasswordMathces(password, rePassowrd)) {
                System.out.println("Hatalı şifre");
            }
            User user = new User(username, password, phone);

            DataBase.userList.add(user);
            DataBase.personList.add(user);
            return;
        }
    }

    private boolean isPasswordMathces(String password, String rePassowrd) {
        return password.equals(rePassowrd);
    }

    @Override
    public Person login() {
        String username = Util.getStringValue("Usernameni gir");
        String password = Util.getStringValue("Passowrd gir");

        Person person = findByUsernameAndPassowrd(username, password);
        if (person != null) {
            return person;
        }
        System.out.println("Kullanıcı bulunamadı");
        return null;
    }

    private Person findByUsernameAndPassowrd(String username, String password) {
        for (Person person : DataBase.personList) {
            if (person.getUsername().equals(username) && person.getPassword().equals(password)) {
                return person;
            }
        }
        return null;
    }

    public void tweetAt(User user) {
        if (user.getStatus() == Status.LOCK) {
            System.out.println("Tweet Atamazsın");
        } else {
            String icerik = Util.getStringValue("Tweet içeriğini gir");
            String atilanHashtag = Util.getStringValue("HashTag");

            HashTag hashTag = new HashTag(atilanHashtag);
            DataBase.hastagList.add(hashTag);

            Tweet tweet = new Tweet(icerik);
            DataBase.tweetList.add(tweet);

            Profile profil = user.getProfil();
            profil.getTweets().add(tweet);
            profil.setTweetCount(profil.getTweetCount() + 1);
        }
    }

    public void tweetlerimiGoster(User user) {
        user.getProfil().getTweets().forEach(tweet -> System.out.println(tweet.toString()));
    }

    public void tweetSil(User user) {
        tweetlerimiGoster(user);
        String id = Util.getStringValue("Hangi tweete silcen");

        Tweet tweetById = findTweetFromUserById(id, user);
        if (tweetById != null) {
            user.getProfil().getTweets().remove(tweetById);
            DataBase.tweetList.remove(tweetById);
        }
    }

    private Tweet findTweetFromUserById(String id, User user) {
        for (Tweet tweet : user.getProfil().getTweets()) {
            if (tweet.getId().equals(id)) {
                return tweet;
            }
        }
        System.out.println("Tweet bulunamadı");
        return null;
    }
    private Tweet findTweetFromDatabaseById(String id) {
        for (Tweet tweet : DataBase.tweetList) {
            if (tweet.getId().equals(id)) {
                return tweet;
            }
        }
        System.out.println("Tweet bulunamadı");
        return null;
    }

    public void tweetBegen(User user) {
        DataBase.tweetList.forEach(tweet -> System.out.println("İçerik: " + tweet.getContent() + " ID: " + tweet.getId()));
        String id = Util.getStringValue("Beğenmek istediğin tweet");
        Tweet tweet = findTweetFromDatabaseById(id);
        if(tweet != null){
            if(!tweet.getLikedUsers().contains(user)){
                tweet.setLikeCount(tweet.getLikeCount() + 1);
                tweet.getLikedUsers().add(user);
            }else {
                tweet.setLikeCount(tweet.getLikeCount() + -1);
                tweet.getLikedUsers().remove(user);
            }
        }
    }

    public void tweeteYorumYap(User user) {
        DataBase.tweetList.forEach(tweet -> System.out.println("İçerik: " + tweet.getContent() + " ID: " + tweet.getId()));
        String id = Util.getStringValue("Yorum yapmak istediğin tweet");
        Tweet tweet = findTweetFromDatabaseById(id);
        if(tweet != null){
            String comment = Util.getStringValue("Yorum yorumunuz:" );
            Comment comment1 = new Comment(user.getUsername(), comment);
            tweet.getComments().add(comment1);
            tweet.setCommentCount(tweet.getCommentCount() + 1);
            DataBase.commentList.add(comment1);
        }
    }

    public void mesajGonder(User user) {
        DataBase.userList.forEach(u -> System.out.println(u.getUsername()));
        String username = Util.getStringValue("Kime mesaj atmak istiyosun: ");

        User reciever = findByUsername(username);

        if(reciever != null){
            String mesaj = Util.getStringValue("Mesajınız:  ");
            Message message = new Message(user,mesaj);
            if(!engelCheck(reciever,user)){
                reciever.getProfil().getGelenKutus().add(message);
            }
        }

    }

    private boolean engelCheck(User reciever, User user) {
        if(reciever.getProfil().getEngellenenler().contains(user)){
            System.out.println(reciever.getUsername() + " Sizi engelledi");
            return true;
        }
        return false;
    }

    private User findByUsername(String username) {
        for (User user: DataBase.userList) {
            if(user.getUsername().equals(username)){
                return user;
            }
        }
        System.out.println("Kişi Bulunamadı");
        return null;
    }

    public void gelenKutusu(User user) {
        user.getProfil().getGelenKutus()
                .forEach(message ->
                        System.out.println("Kimde: " + message.getUser().getUsername() + " İçerik " + message.getIcerik()));
    }

    public void mesajIstekleriniKitle(User user) {
        String username = Util.getStringValue("Kim size mesaj atamasın : ");
        User bannedUser = findByUsername(username);
        if(bannedUser != null){
            user.getProfil().getEngellenenler().add(bannedUser);
        }
        }

    public void profilGoster(User user) {
        System.out.println(user.getProfil());
    }

    public void somethin(User user) {
        System.out.println(user.toString());
    }
}
