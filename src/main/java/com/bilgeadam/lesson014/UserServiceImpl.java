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

}
