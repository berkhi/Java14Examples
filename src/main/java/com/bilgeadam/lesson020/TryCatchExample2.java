package com.bilgeadam.lesson020;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchExample2 {

    public static void main(String[] args) {


        String[] array = {"6", "10", "bc", "20", null, "sd", "asd", "10", "10", null};
        String[] array2 = {null};
        String[] array3 = null;

        // Parametre olarak array alan ve girdiğimiz değere karşılık gelen indexi
        // getiren
        // bir method yazalım

        //farklı bir metotta
        // Array içinde gezelim sayısal değerleri int e çeviripi toplayalım
        // döngü sonunda sayıların toplamını ve toplam hata sayısını yazdıralım

        //System.out.println(elemanBul(array3));
        islemYap(array);


    }

    //arrayde null değer varsa nullpointer hatası fırlatalım
    public static void islemYap(String[] array) {
        int toplam = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            try {
                nullCheck(array[i]);
                toplam += Integer.parseInt(array[i]);
            }catch (NullCheckException e) {
                System.out.println(e.getMessage() + " Alınan Tarih" + e.getLocalDateTime());
                count++;
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
                count++;
            }
        }
        System.out.println("Toplam " + toplam + " Topşlam Hata sayısı: " + count);
    }

    public static String elemanBul(String[] array) {
        while (true) {
            System.out.println("index girin: ");
            Scanner scanner = new Scanner(System.in);

            try {
                int index = scanner.nextInt();
                return array[index];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Geçersiz index 0 ile " + (array.length - 1) + " Aralığında olmalıdır");
            } catch (InputMismatchException e) {
                System.out.println("Lütfen sayı giriniz: ");
            } catch (NullPointerException e) {
                System.out.println("Gelen veri null olamaz:: " + e.getMessage());
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    //NullPointerCehck diye custom bir exception sınıfı oluşturalım
    //farkılı bir metotta null chekc yapalım

    private static void nullCheck(String string) throws NullCheckException {
        if (string == null) {
            throw new NullCheckException("Null eleman!!");
        }
    }
}
