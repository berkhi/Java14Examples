package com.bilgeadam.twclone;

import static com.bilgeadam.lesson014.Main.adminPage;

public class Main {

    static UserManager userManager = new UserManager();
    public static void main(String[] args) {

        User user = new User("mehmet", "123", "3125554747");
        User user2 = new User("ahmet", "123", "3125554111");
        DataBase.userList.add(user);
        DataBase.personList.add(user);
        DataBase.userList.add(user2);
        DataBase.personList.add(user2);
        tweeterSystemMenu();

    }

    public static void tweeterSystemMenu() {
        while (true) {
            System.out.println("1-Login");
            System.out.println("2- Register");
            System.out.println("0- Sistemi Kapat");
            int secim = Util.getIntegerValue("Seçiminizi girin");
            switch (secim) {
                case 1:
                    Person loggedUser = userManager.login();
                    if(loggedUser != null){
                        if(loggedUser instanceof User){
                            userPage((User) loggedUser);
                        }else {
                            adminPage();
                        }
                    }
                    break;
                case 2:
                    userManager.register();
                    break;
            }
        }
    }



    public static void userPage(User user) {
        while (true) {
            System.out.println("1- Tweet At");
            System.out.println("2- Tweet Göster");
            System.out.println("3- Tweet Sil ");
            System.out.println("4- Tweet Begen " );
            System.out.println("5- Yorum Yap" );
            System.out.println("6- Mesaj Gonder");
            System.out.println("7- Gelen Kutusu");
            System.out.println("8- Mesajları kısıtla");
            System.out.println("9- Profil Goster" );
            System.out.println("10- Üst Menüye Git" );
            System.out.println("11- User Engelle" );
            System.out.println("0- Sistemi Kapat");
            int secim = Util.getIntegerValue("Seçiminizi girin");
            switch (secim) {
                case 1:
                    userManager.tweetAt(user);
                    break;
                case 2:
                    userManager.tweetlerimiGoster(user);
                    break;
                case 3:
                    userManager.tweetSil(user);
                    break;
                case 4:
                    userManager.tweetBegen(user);
                    break;
                case 5:
                    userManager.tweeteYorumYap(user);
                case 6:
                    userManager.mesajGonder(user);
                    break;
                case 7:
                    userManager.gelenKutusu(user);
                    break;
                case 8:
                    userManager.mesajIstekleriniKitle(user);
                    break;
                case 9:
                    userManager.profilGoster(user);
                    break;
                case 10:
                    System.out.println("Üst Menüye Dön");
                    return;
                case 11:
                    //managerImpl.userEngelle(user);
                    break;
                case 0:
                    System.out.println("Sistem kapandı");
                    return;
                default:
                    break;
            }
        }
    }
}