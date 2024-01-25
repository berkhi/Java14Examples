package com.bilgeadam.lesson008;

public class Question53 {
    public static void main(String[] args) {


        //5 dk  girilen kelimenini ilk ve son harfini değiştirelim
        //girilen kelime 0 ile 100 arasında olması lazım
        //eğer tek harfli girildiyse girilen harfi return etsin


        //Example :  input --> bilgeadam
        //    output --> milgeadab
        System.out.println(swapString("a"));
    }
    public static String swapString(String str) {

        if (str.length() > 100 || str.length() < 0) {
            System.out.println("hata: ");
        } else {
            StringBuilder stringBuilder = new StringBuilder(str);

            char ilkHarf = str.charAt(0);
            char sonHarf = str.charAt(str.length() - 1);

            stringBuilder.setCharAt(0, sonHarf);
            stringBuilder.setCharAt(str.length() - 1, ilkHarf);

            return stringBuilder.toString();
        }
        return null;
    }
}
