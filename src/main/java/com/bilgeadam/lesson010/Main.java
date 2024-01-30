package com.bilgeadam.lesson010;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Heapte bir Yer açılıyor
        Profile profile = new Profile();

        profile.setUsername("mehmet123");
        profile.setDescription("3 yıldır Çalışıyorum");
        profile.setImageUrl("image.png");
        profile.setFollower(5);
        profile.setFollowing(20);
        profile.setBlueTick(false);

        profile.bilgileriGoster();

        profile.postOlustur("Ankarada 1 gün");
        profile.postOlustur("İzmirde 1 gün");
        profile.postOlustur("Bodrumda 1 gün");


        //bilgileri Goster methodu yazalım içerde tostring kullanalım

        //post oluştur methodu, postun ismini verelim
        //mehmet123 post oluşturdu.

        //kullanıcının bütün postlarını göster methodu yazalım


        profile.postlariGoster();


        //gelen isteği kabul et
        //kullanı takipten çıkar

        //maviTik kontrolü eğer 5 ten fazla takipçisi varsa
        //kullanıcıya mavi tik verelim.

        profile.istegiKabulEt();
        profile.takiptenCikar();
        System.out.println(profile.isBlueTick());


        //Bitane metot yazalım post oluşturcak ama
        //bilgileir kullanıcıdan alcaz

        System.out.println("--------------------");

        Profile ilkOlusturlanProfil = profilOlustur();
        Profile ikinciOlusturlanProfil = profilOlustur();

        System.out.println(ilkOlusturlanProfil.hashCode());
        System.out.println(ikinciOlusturlanProfil.hashCode());

        System.out.println(ilkOlusturlanProfil.getUsername());

        System.out.println(ikinciOlusturlanProfil.getUsername());
    }


    public static Profile profilOlustur() {

        Scanner scanner = new Scanner(System.in);

        Profile profile = new Profile();

        System.out.println("Kullanıcı adınızı girin");
        profile.setUsername(scanner.nextLine());

        System.out.println("Açıklama girin");
        profile.setDescription(scanner.nextLine());

        System.out.println("Resim Ekle");
        profile.setImageUrl(scanner.nextLine());

        return profile;
    }

    //postGonder diye bir method yazalım
    //kullanıcıdan alcaz bilgileri

}
