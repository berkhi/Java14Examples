package com.bilgeadam.lesson017;
import java.util.Scanner;
public class OyunMenusu {
    static Scanner scanner = new Scanner(System.in);


    public static void menu() {
        PlakaTahmin plakaTahmin = new PlakaTahmin();
        String message = "Şehir Tahmin Oyununa Hoşgeldiniz\n" + "Oyunumuzda toplam 3 tahmin hakkınız bulunmaktadır.\n"
                + "1- Oyuna başla \n" + "2- Tahminlerim \n" + "0- Çıkış \n";

        int input;
        do {
            System.out.println("================");
            System.out.println(plakaTahmin.getOyunSayisi() + ". Oyun");
            System.out.println(message);
            input = scanner.nextInt();
            scanner.nextLine();

            switch (input) {
                case 1:
                    plakaTahmin.tahimEt();
                    break;
                case 2:
                    plakaTahmin.tahminListem();
                    break;
                case 0:
                    System.err.println("Çıkış yapıldı");
                    System.exit(0);
                    break;
                default:
                    break;
            }
        } while (true);
    }
}
