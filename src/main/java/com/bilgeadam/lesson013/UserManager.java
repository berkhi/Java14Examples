package com.bilgeadam.lesson013;

public class UserManager {

    public void krediBasvurusundaBulun(Account account, double miktar) {

        account.setKrediBasvurusu(true);
        account.setIstenenKrediMiktari(miktar);

        System.out.println(account.getAccountNo() + " Numaralı hesap için " + miktar + " TL Değerinde kredi başvurusnda bulundunuz");
        System.out.println("Lütfen onay bekleyin....");

    }

    //problemi halledelim.
    public void krediBorcunuOde(Account account, int taksit) {
        double fazlaMiktar = taksit - account.getKrediBorcu();
        if (account.getKrediBorcu() > 0) {
            if (taksit > account.getKrediBorcu()) {

                account.setBalance(account.getBalance() + fazlaMiktar);
                System.out.println(fazlaMiktar + " Tl fazla yatırdınız fazla miktar hesabınıza aktarıldı");
                account.setKrediBorcu(0);
            }else {
                account.setBalance(fazlaMiktar);
                return;
            }
            account.setKrediBorcu(account.getKrediBorcu() - taksit);
            account.setKrediPuani(account.getKrediPuani() + Account.KREDI_PUAN_MIKTARI);
        } else {
            System.out.println("Kredi Borcunuz bitmiştir. ");
        }
    }

    public void hesaptanKrediBorcuOde(Account account, int taksit) {

    }

    public void nakitAvansCek(Account account, int taksit) {

    }
}
