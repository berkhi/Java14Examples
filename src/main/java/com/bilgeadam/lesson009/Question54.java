package com.bilgeadam.lesson009;

public class Question54 {
    public static void main(String[] args) {

        //kelime palindrom mu değil mi palindrom tru yoksa false dönsün
        //Plaindrom
        //for kullanmicaz


        System.out.println(isPalindrom("kayaks"));
    }


    public static boolean isPalindrom(String kelime) {

        StringBuilder stringBuilder = new StringBuilder(kelime);

        return kelime.equals(stringBuilder.reverse().toString());

    }

}
