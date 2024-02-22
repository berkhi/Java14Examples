package com.bilgeadam.lesson016;

import java.util.Stack;

public class StackOrnek2 {
    public static void main(String[] args) {


        //palindrom --> stack kullanarak çözeleim

        //metotta boolean

        System.out.println(isPalindrome("kayakk"));

    }
    public static boolean isPalindrome(String kelime) {

        Stack<Character> harfler = new Stack<>();

        for (int i = 0; i < kelime.length(); i++) {
            harfler.add(kelime.charAt(i));
        }

        for (int i = 0; i < kelime.length() / 2;  i++) {
            if (kelime.charAt(i) != harfler.pop()) {
                return false;
            }
        }
        return true;
    }


}
