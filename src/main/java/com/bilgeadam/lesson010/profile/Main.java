package com.bilgeadam.lesson010.profile;

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

        Profile mehmetinPRofili = profilOlustur();
        Profile ahmetinProfili = profilOlustur();

        postGonder(mehmetinPRofili);

        postGonder(ahmetinProfili);

        mehmetinPRofili.postlariGoster();
        ahmetinProfili.postlariGoster();

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

    public static Profile profilOlustur2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kullanıcı adınızı girin");
        String username = scanner.nextLine();

        System.out.println("Açıklama girin");
        String description =  scanner.nextLine();

        System.out.println("Resim Ekle");
        String image = scanner.nextLine();

        Profile profile = new Profile(username,description,image);

        return profile;
    }

    //postGonder diye bir method yazalım
    //kullanıcıdan alcaz bilgileri

    public static void postGonder(Profile profile){

        System.out.println(profile.getUsername() + " Bey Lütfen Post İsmini Girin");
        Scanner scanner = new Scanner(System.in);
        profile.postOlustur(scanner.nextLine());
    }

}
