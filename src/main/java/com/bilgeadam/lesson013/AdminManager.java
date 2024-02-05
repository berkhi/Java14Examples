package com.bilgeadam.lesson013;

public class AdminManager {

    public void krediBasvurusunuOnayla(Account account) {

        //kredi başvurusnda bulumuş mu
        if (account.isKrediBasvurusu()) {
            System.out.println(" Kredi başvurunuz onaylanmıştır.. ");

            account.setBalance(account.getBalance() + account.getIstenenKrediMiktari());

            account.setKrediBasvurusu(false);
            account.setIstenenKrediMiktari(0);

        } else {
            System.out.println("Kredi başvurusu yoktur");
        }
    }
}
