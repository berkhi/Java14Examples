package com.bilgeadam.lesson013;

public class AccountManager {

    //bussines logic bu sınıfta yazcaz

    public void paraYatir(Account account, double miktar) {
        if (miktar <= 10000) {
            account.setBalance(account.getBalance() + miktar);
            System.out.println(miktar + " Tl hesaba yatırıldı güncel Bakiye: " + account.getBalance());
        } else {
            System.out.println("Max 10.000Tl yatırabilirsiniz.");
        }
    }

    public void paraCek(Account account, double miktar) {
        if (miktar <= account.getBalance()) {
            account.setBalance(account.getBalance() - miktar);
            System.out.println(miktar + " Tl hesaptan çekildi güncel Bakiye: " + account.getBalance());
        } else {
            System.out.println("Yetersiz bakiye Bakiyeniz: " + account.getBalance());
        }
    }


}
