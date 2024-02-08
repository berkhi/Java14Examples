package com.bilgeadam.lesson014;

import java.util.Scanner;

public class Main {


    static UserServiceImpl userService = new UserServiceImpl();
    static AdminService adminService = new AdminService();

    public static void main(String[] args) {

        DataBase.library.getBookList().add(new Book("XKitabı","Ali", "AYayın", 150, new Category("Polisiye")));
        DataBase.library.getBookList().add(new Book("YKitabı","Ali", "BYayın", 200, new Category("Roman")));
        DataBase.library.getBookList().add(new Book("ZKitabı","Ayşe", "CYayın", 300, new Category("Öykü")));
        DataBase.library.getBookList().add(new Book("DKitabı","Mehmet", "DYayın", 350, new Category("Hikaye")));

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
        while (true) {
            System.out.println("1- Kitap Ekle");
            System.out.println("2- Bütün kitapları listelesin");
            System.out.println("3- Yazara göre arama yap");
            System.out.println("4- kitabın id sine göre silme işlemi ");

            System.out.println("5- kitabı Soft Delete yapalım ");

            System.out.println("6- Kitaba indirim uygulayalım ");




            int secim = InputUtil.getIntegerValue("Seçim girin");

            switch (secim) {
                case 1:
                    adminService.createBook();
                    break;
                case 2:
                    adminService.findAllBooks();
                    break;
                case 3:
                    adminService.findBookByAuthorName();
                    break;
                case 4:
                    adminService.deleteById();
                    break;
                case 5:
                    adminService.changeStatusToDeleted();
                    break;
                case 6:
                    adminService.discountForBook();
                    break;
            }
        }
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

            int secim = InputUtil.getIntegerValue("Seçim girin");

            switch (secim) {
                case 1:
                    System.out.println("1- Kitap Kirala");
                    break;

            }
        }


    }


}
