package com.bilgeadam.lesson013;

import java.time.LocalDateTime;

public class Main {


    //Account
    //AccountNo
    //balance

    //Account sınıfı oluşturalım
    //para yatır ve para çek metotları yazalım
    //para yatırırken max 10.000 tl yatıralım

    //User
    //isim, soyisim, email, Account

    //Bir user oluşturduğumzda, emaili otomatik olarak belirlencek
    //mehmet
    //yardımcı
    //email --> mehmet.yardimci@xbanka.com
    //isim.soyisim@gmail.com

    //iki tane isim varsa
    //mehmet.berkin.yardımcı@xbanka.com


    // User olarak
    //UserManager sınıfına krediBasvurusndaBulun() methodu yazalım
    // krediBaşvurusunuda bulunalım
    // krediyi çekeceği accountu bir de ne kadar kredi istiyorsa, miktar

    //ben kredi başvurusnda bulunduktan sonra para hemen hesaba gelmicek

    //onaya düşecek.

    //Kredi başvurusnu onayla

    //Kredi başvurusnu reddet.


    //Kredi borcunu ödesin.
    //her ödediğinde kullanıcını kredi puanı 10 artsın
    //nakitle kredi kartı borcunu ödesin.

    //hesaptanKrediBorcunu ödesin

    //User Nakit avans çekebilsin
    //nakit avans çekebilmesi için kredi puanının 20 den fazla olması gerekiyor
    //Nakit avans hesabındaki paranın yarısı kadar.


    //bankadan kredi çekip kredimiz onaylandıktan sonra
    //kullanıcıya mail gönderelim

    //Mail sınıfı açacaz
    //Subject, content, gönderen, ne zaman gönderildi. Dekont

    //Dekont sınıfı açıacz
    //Tutar, hesap numarası,  aylık ödeme tutarı(Ayılık 10 da biri kadar takist ödeyecek)

    //kredi başvuru HK.
    //admin@xbanka.com
    //2023-06-02- 2:18
    //şu hesapnumarslı accountunza şu tutarda krediniz onaylnamıştır
    // aylık taksidiniz şu akdardır.

    public static void main(String[] args) {
        Account hesap1 = new Account("00666", 0);
        Account hesap2 = new Account("00777", 0);

        AccountManager accountManager = new AccountManager();
        UserManager manager = new UserManager();
        AdminManager adminManager = new AdminManager();

        accountManager.paraYatir(hesap2, 5000);
        accountManager.paraYatir(hesap2, 5000);
        accountManager.paraCek(hesap2, 2000);

        User user = new User("mehmet berkin", "yardimci");
        user.setAccount(hesap2);

        manager.krediBasvurusundaBulun(hesap2, 50000);

        adminManager.krediBasvurusunuOnayla(user);

        System.out.println("Subject "+user.getGelenKutusu().get(0).getSubject());
        System.out.println("Gönderen "+user.getGelenKutusu().get(0).getSender());
        System.out.println("Geen Saat: " + user.getGelenKutusu().get(0).getSendingDate());
        System.out.println("İçerik " +user.getGelenKutusu().get(0).getContent());
        System.out.println("Aylık Ödeme Miktarı " +user.getGelenKutusu().get(0).getDekont().getPayPerMounth());







    }


}
