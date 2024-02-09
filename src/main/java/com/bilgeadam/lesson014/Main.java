package com.bilgeadam.lesson014;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {


    static UserServiceImpl userService = new UserServiceImpl();
    static AdminService adminService = new AdminService();

    public static void main(String[] args) {

        DataBase.library.getBookList().add(new Book("XKitabı","Ali", "AYayın", 150, new Category("Polisiye")));
        DataBase.library.getBookList().add(new Book("YKitabı","Ali", "BYayın", 200, new Category("Roman")));
        DataBase.library.getBookList().add(new Book("ZKitabı","Ayşe", "CYayın", 300, new Category("Öykü")));
        DataBase.library.getBookList().add(new Book("DKitabı","Mehmet", "DYayın", 350, new Category("Hikaye")));


        Customer customer1 = new Customer("deniz","1234","123535","12412",55);
        Customer customer2 = new Customer("ahmet","1234","123535","12412",55);
        customer1.setSignDate(LocalDateTime.of(2025, 3, 11, 0, 0));
        customer2.setSignDate(LocalDateTime.of(2024, 1, 1, 15, 0));
        DataBase.library.getCustomerList().add(customer1);
        DataBase.library.getCustomerList().add(customer2);

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



    //1- kullanıcı login olurken şifresini 3 kere doğru girmezse hesabını askıya alalım ve login yapamicak

    //2- kullanıcını girmiş olduğu tarihten sonra sisteme kayıt olan kullanıcıları listeleyelim
    //2024.02.05 bu tarhiten sonra kayıt olan kullanıcıları listelicez.



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
                case 7:
                    adminService.getAllCustomerByDate();
                    break;
            }
        }
    }

    public static void userPage() {

        while (true) {
            System.out.println("Register");
            System.out.println("Login");
            System.out.println("3- Üst sayfa");

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
                case 3 :
                    systemMenu();
                    break;
            }
        }

    }

    public static void userApplication(Customer customer) {
        System.out.println("Hoşgeldiniz " + customer.getUsername());


        while (true) {
            System.out.println("1- Kitap Kirala");
            System.out.println("2- Kiraladığım kitabları görüntüle ");
            System.out.println("3- Kitabı iade et ");
            System.out.println("4- Logout ");

            int secim = InputUtil.getIntegerValue("Seçim girin");

            switch (secim) {
                case 1:
                    userService.rentBook(customer);
                    break;
                case 2:
                    userService.getAllRentedBook(customer);
                    break;
                case 3:
                    userService.returnBook(customer);
                    break;
                case 4:
                    userPage();
                    break;

            }
        }
    }


}
