package com.bilgeadam.lesson013;

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

    //Mail
    //Subject, content, gönderen, ne zaman gönderildi.

    //Dekont
    //Tutar, hesap numarası,  aylık ödeme tutarı(Ayılık 10 da biri kadar takist ödeyecek)

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

        manager.krediBasvurusundaBulun(hesap2, 50000);

        System.out.println(hesap2.getIstenenKrediMiktari());
        System.out.println(hesap2.isKrediBasvurusu());
        System.out.println(hesap2.getBalance());
        System.out.println("****************");

        adminManager.krediBasvurusunuOnayla(hesap2);

        System.out.println("***********");

        System.out.println(hesap2.getIstenenKrediMiktari());
        System.out.println(hesap2.isKrediBasvurusu());
        System.out.println(hesap2.getBalance());

        System.out.println("****************");
        System.out.println(hesap2.getBalance());

        System.out.println(hesap2.getKrediBorcu());
        manager.krediBorcunuOde(hesap2, 65000);
        System.out.println(hesap2.getKrediBorcu());

        System.out.println(hesap2.getBalance());





    }


}
