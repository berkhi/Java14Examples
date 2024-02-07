package com.bilgeadam.lesson014;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        //systemMenu();

        /*
        DataBase.library.getBookList().add(new Book("XKitabı","Ali", "AYayın", 150, new Category("Polisiye")));
        DataBase.library.getBookList().add(new Book("YKitabı","Ali", "BYayın", 200, new Category("Roman")));
        DataBase.library.getBookList().add(new Book("ZKitabı","Ayşe", "CYayın", 300, new Category("Öykü")));
        DataBase.library.getBookList().add(new Book("DKitabı","Mehmet", "DYayın", 350, new Category("Hikaye")));

         */

        UserServiceImpl userService = new UserServiceImpl();

        userService.register();
        userService.login();

        //System.out.println(DataBase.library.getCustomerList().get(0).getUsername());


    }

    //1- Admin Girişi -> AdminLoginPage
    //2- User Girişi -> UserPage
    //   UserPage -> Register, Login

    //User --> username, password, signDate
    //Book --> id, name, authorName, publisher, price, Category
    //Admin --> email
    //Library --> name, books, customerList
    //Customer --> id, phoneNumber, tc, rentedBooks. balance
    //Category --> name

    //Util sınıfı açıcaz
    //stringDegerAl();
    //intDegerAl();

    //Register metohdu yazalım
    //Login methodu yazalım
    //Bunlara birere interface tanımyalaım

    //mainde menuyu oluşturalım
    //mainde sadece system menuyu çağırca
    //1 e basarsa userPage açalım
    //register olsun
    //sonra login olsun
    //sonra login olduktan sonra
    //userApplication a gidecek ve hoşgeldiniz (kullanıcın id si)




    public static void systemMenu(){
        System.out.println("1- User İşlemleri");
        System.out.println("2- Admin Girişi");


    }
    public static void adminPage(){
        System.out.println("Kitap Ekle");
    }

    public static void userPage(){
        System.out.println("Register");
        System.out.println("Login");
    }
    public static void userApplication(){
        System.out.println("Kitap Kirala");

    }


}
