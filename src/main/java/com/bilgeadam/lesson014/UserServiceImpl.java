package com.bilgeadam.lesson014;

public class UserServiceImpl implements UserService {
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
    public void login() {
        String username = InputUtil.getStringValue("Usernameinizi girin: ");
        String password = InputUtil.getStringValue("Şifre gir: ");

        //[customer, customer]
        for (Customer customer : DataBase.library.getCustomerList()) {
            if (username.equals(customer.getUsername()) && password.equals(customer.getPassword())) {
                System.out.println("Hoşgeldiniz " + customer.getUsername());
                return;
            }
        }
        System.out.println("Kullanıcı bulunamadı!! ");
    }

}
