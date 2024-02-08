package com.bilgeadam.lesson014;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UserServiceImpl implements UserService {


    static DateTimeFormatter tarihFormati = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    @Override
    public void register() {
        String username = InputUtil.getStringValue("Kullanıcı adınızı girin");
        String password = InputUtil.getStringValue("Şifre girin");
        String phoneNumber = InputUtil.getStringValue("Telefon No girin");
        String identityNumber = InputUtil.getStringValue("Tc kimlik girin");
        double balance = InputUtil.getDoubleValue("Bakiye yükleyin");

        Customer customer = new Customer(username, password, phoneNumber, identityNumber, balance);

        DataBase.library.getCustomerList().add(customer);

        System.out.println("Kayı başarılı bir şekilde gerçekleşti");
    }

    @Override
    public Customer login() {
        String username = InputUtil.getStringValue("Usernameinizi girin: ");
        String password = InputUtil.getStringValue("Şifre gir: ");

        Customer customer = findCustomerByUsernameAndPassword(username, password);
        if (customer != null) {
            return customer;
        }
        System.out.println("Kullanıcı bulunamadı");
        return null;
    }

    private Customer findCustomerByUsernameAndPassword(String username, String password) {
        for (Customer customer : DataBase.library.getCustomerList()) {
            if (username.equals(customer.getUsername()) && password.equals(customer.getPassword())) {
                return customer;
            }
        }
        return null;
    }

    public void rentBook(Customer customer) {
        Main.adminService.findAllBooks();
        String id = InputUtil.getStringValue("Hanig kitabı kiralikcasın : ");
        Book book = Main.adminService.findById(id);

        if (book != null) {
            if (customer.getBalance() >= book.getPrice() && book.getStatus() == Status.ACTIVE) {
                customer.getRentedBooks().add(book);
                customer.setBalance(customer.getBalance() - book.getPrice());

                book.setRentDate(LocalDateTime.now());
                book.setReturnDate(setReturnDate());

                book.setStatus(Status.INRENT);

                System.out.println("Kitabı iade etmeniz tarihiniz: " + book.getReturnDate().format(tarihFormati));
                System.out.println(book.getName() + " Kitabını başarıyla kiraladınız");
            } else {
                System.out.println("Bakiyeniz yeterli değildir. ");
            }
        }
    }

    public void getAllRentedBook(Customer customer) {
        customer.getRentedBooks().forEach(book -> System.out.println(book.getName() + " İade Tarihi: " + book.getReturnDate().format(tarihFormati)));
    }

    private LocalDateTime setReturnDate() {
        int day = InputUtil.getIntegerValue("Kaç gün sonra iade edeceksin: ");
        LocalDateTime currentDate = LocalDateTime.now();
        return currentDate.plusDays(day);
    }

    public void returnBook(Customer customer){
        String id = InputUtil.getStringValue("Hanig kitabı kiralikcasın : ");
        Book book = Main.adminService.findById(id);

        if(book != null){
            if(customer.getRentedBooks().remove(book)){
                System.out.println("Kitabı iade ettiniz teşekkürler");
                book.setStatus(Status.ACTIVE);
            }else {
                System.out.println("iade işlemi başarısız");
            }
        }
    }
}
