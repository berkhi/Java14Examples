package com.bilgeadam.lesson013;

public class AdminManager {

    public void krediBasvurusunuOnayla(User user) {

        if (user.getAccount().isKrediBasvurusu()) {
            System.out.println(" Kredi başvurunuz onaylanmıştır.. ");
            user.getAccount().setBalance(user.getAccount().getBalance() + user.getAccount().getIstenenKrediMiktari());

            user.getAccount().setKrediBorcu(user.getAccount().getIstenenKrediMiktari());
            user.getAccount().setKrediBasvurusu(false);
            user.getAccount().setIstenenKrediMiktari(0);

            sendEmail(user);

        } else {
            System.out.println("Kredi başvurusu yoktur");
        }
    }

    public void krediBasvurusunuRedder(Account account) {
        if (account.isKrediBasvurusu()) {
            System.out.println(" Kredi başvurunuz Reddedilmiştir.. ");
            account.setKrediBasvurusu(false);
            account.setIstenenKrediMiktari(0);

        } else {
            System.out.println("Kredi başvurusu yoktur");
        }
    }

    private void sendEmail(User user) {
        Mail mail = new Mail();
        double aylikKrediOdemesi = user.getAccount().getKrediBorcu() / 10;

        mail.setContent("Krdei başvurunuz onaylanmıştır Teşekkürler... ");
        mail.setSubject("Kredi Başvuru Hk.");

        Dekont dekont = new Dekont();
        dekont.setCreditAmount(user.getAccount().getKrediBorcu());
        dekont.setAccountNo(user.getAccount().getAccountNo());
        dekont.setPayPerMounth(aylikKrediOdemesi);

        mail.setDekont(dekont);
        user.getGelenKutusu().add(mail);
    }



}
