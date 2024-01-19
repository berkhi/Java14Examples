package com.bilgeadam.lesson005;

import java.util.Scanner;

public class Question33 {
    public static void main(String[] args) {

        // Bizden bir kelime istenilcek (java)
        // hangi harfi değiştirmek istediğimizi sorcak (a)
        //neyle değiştirmek istiyosunuuz (???)
        // ??? varsa harfimiz değişecek

        //j???v???

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kelime girin ");
        String kelime = scanner.nextLine();

        System.out.println("Neyi değiştirmek istiyosun");
        String degisen = scanner.nextLine();

        if(kelime.contains(degisen)){
            System.out.println("Neyle değiştirmek istiyosun");
            String eklenen = scanner.nextLine();

            kelime = kelime.replace(degisen, eklenen);

            System.out.println(kelime);
        }else {
            System.out.println("Harf yok");
        }


    }
}
