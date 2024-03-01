package com.bilgeadam.lesson021;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FileExample {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        menu();
    }

    private static void menu() {
        System.out.println("İşlem girin");
        System.out.println("1- Dosya oluştur");
        System.out.println("2- Dosya Metin Ekle");
        System.out.println("3- Dosyayı oku");

        int secim = scanner.nextInt();
        scanner.nextLine();
        switch (secim) {
            case 1:
                showTxtFiles();
                File file = dosyaAdiniBelirle();
                dosyaOlustur(file);
            case 2:
                metinEkle();
            case 3:
                dosyaOku();
        }
    }

    private static void dosyaOku() {

        File file = dosyaAdiniBelirle();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

            String satir;
            while ((satir = reader.readLine()) != null) {
                System.out.println(satir);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void metinEkle() {
        File file = dosyaAdiniBelirle();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            System.out.println("Metin giriniz: ");
            String text = scanner.nextLine();
            writer.write(text + "\n");
        } catch (IOException e) {
            System.out.println(e);
        }
    }


    public static void dosyaOlustur(File file) {

        try {
            if (file.createNewFile()) {
                System.out.println("Dosya oluşturuldu: " + file.getName());
            } else {
                throw new IOException("File Already Exist!");
            }
        } catch (IOException e) {
            System.out.println("Dosya Hatası " + e.getMessage() + " Var olan dosya adı: " + file.getName());
        }

    }

    public static File dosyaAdiniBelirle() {
        System.out.println("Dosya adını belirle");
        String dosyaAdi = scanner.nextLine();
        String dosyaYolu = dosyaAdi + ".txt";

        File file = new File(dosyaYolu);
        return file;
    }

    //oluşturudğum tüm dosyalrı kullanıcıya gösterlim
    //kullanıcı hangi dosyaya işlem yapmak istiyorsa onu seçsin
    //1- deneme.txt
    //2- mars.txt


    private static File selectFile() {
        Path path = Path.of(System.getProperty("user.dir"));
        try {
            List<Path> paths = Files.list(path).collect(Collectors.toList());
            paths.forEach(f -> System.out.println(f.getFileName()));

            System.out.println("Hangi dosyaya yazmak istiyosunuz");

            int secim = scanner.nextInt();
            scanner.nextLine();
            return new File(paths.get(secim).toUri());
        } catch (Exception e) {
            return null;
        }
    }
    private static File showTxtFiles(){
        File directory = new File(".");
        File[] files = directory.listFiles((dir, name) -> name.toLowerCase().endsWith(".txt"));

        if (files != null && files.length > 0) {
            System.out.println("Txt Dosyalari:");
            for (File file : files) {
                System.out.println(file.getName());
            }
        } else {
            System.out.println("Txt dosyasi bulunamadi.");
        }
        int secim = scanner.nextInt();
        return files[secim];
    }
}
