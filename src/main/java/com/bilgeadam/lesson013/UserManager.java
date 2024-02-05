package com.bilgeadam.lesson013;

public class UserManager {

    public void krediBasvurusundaBulun(Account account, double miktar) {

        account.setKrediBasvurusu(true);
        account.setIstenenKrediMiktari(miktar);

        System.out.println(account.getAccountNo() + " Numaralı hesap için "+ miktar + " TL Değerinde kredi başvurusnda bulundunuz");
        System.out.println("Lütfen onay bekleyin....");

    }
}
