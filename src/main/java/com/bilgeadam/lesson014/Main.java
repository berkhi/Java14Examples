package com.bilgeadam.lesson014;

import java.util.Scanner;

public class Main {


    static UserServiceImpl userService = new UserServiceImpl();

    public static void main(String[] args) {

        systemMenu();

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
    //userApplication a gidecek ve hoşgeldiniz (kullanıcın usernameni


    public static void systemMenu() {
        System.out.println("1- User İşlemleri");
        System.out.println("2- Admin Girişi");

        while (true) {
            int secim = InputUtil.getIntegerValue("Seçim girin");

            switch (secim) {
                case 1:
                    userPage();
                    break;
                case 2:
                    adminPage();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }

        }


    }

    public static void adminPage() {
        System.out.println("Kitap Ekle");
    }

    public static void userPage() {

        while (true) {
            System.out.println("Register");
            System.out.println("Login");

            int secim = InputUtil.getIntegerValue("Seçim girin");

            switch (secim) {
                case 1:
                    userService.register();
                    break;
                case 2:
                    Customer loggedInCustomer = userService.login();
                    if (loggedInCustomer != null) {
                        userApplication(loggedInCustomer);
                    }
                    break;
            }
        }

    }

    public static void userApplication(Customer customer) {
        System.out.println("Hoşgeldiniz " + customer.getUsername());

        while (true) {
            System.out.println("1- Kitap Kirala");
            System.out.println("2- Bişey Kirala");
            System.out.println("3- Bişey Sat");

            int secim = InputUtil.getIntegerValue("Seçim girin");

            switch (secim) {
                case 1:
                    System.out.println("1- Kitap Kirala");
                    break;

            }
        }


    }


}
