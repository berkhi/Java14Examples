package com.bilgeadam.lesson003;

import java.util.Random;
import java.util.Scanner;

public class Question12 {

    // telefona ve maile bir kod gelicek bu kodları biz tanımlicaz
    // kullanıcdan maile ve telefona gelen kod u isticez
    // eğer onun mailine ve telefonana giden kod ile uyuşuyosa
    // sisteme kayıt oldunuz diyelim
    // ya maili hatalıdır ya telefonu yada ikisde hatalıdır
    // kullanıcıyı bilgilendircez.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int kodMail = random.nextInt(100, 1000);
        System.out.println("Maile gelen kod --> " + kodMail);

        int kodTelefon = random.nextInt(100, 1000);
        System.out.println("Telefona gelen kod --> " + kodTelefon);

        System.out.println("Telefona gelen kodu giriniz");
        int gelenKodTelefon = scanner.nextInt();

        System.out.println("Maile gelen kodu giriniz");
        int gelenKodMail = scanner.nextInt();

        if (gelenKodMail == kodMail && gelenKodTelefon == kodTelefon) {
            System.out.println("Siteye kayıt oldunuz");
        } else if (gelenKodMail != kodMail && gelenKodTelefon != kodTelefon) {
            System.out.println("Girdiğiniz iki kodda hatalı");
        } else if (gelenKodMail != kodMail) {
            System.out.println("Maile kodu hatalı");
        } else {
            System.out.println("Telefon kodu hatalı");
        }


    }
}
