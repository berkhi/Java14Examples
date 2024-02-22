package com.bilgeadam.lesson016;

import java.util.Random;
import java.util.Stack;

public class StackOrnek {


    //LIFO Last in first out

    // --> bitane stack oluşturalım içine int değerler atalım
    //stack boşalana kadar bunları cıkartalım..


    public static void main(String[] args) {


        Stack<Integer> stack = new Stack<>();

        Stack<Integer> stack2 = new Stack<>();

        stack.add(1);
        stack.add(5);
        stack.add(55);
        stack.add(123);
        stack.add(85);
        stack.add(190);

        /*
        while (!stack.isEmpty()){
            System.out.println("Değer çıkarıldı Çıkarılan Değer:  " + stack.pop());
        }
         */

        // 100 den küçük değerleri toplayıp stackten cıkaralım
        // 100 den büyükleride farklı bi stackin içine atalaım
        // hem toplamı, hemde yeni stacki yazdıralım

        int toplam = 0;

        /*
        for (int i = 0; i < stack.size(); i++) {
            if (stack2.get(i) < 100) {
                toplam += stack.get(i);
            } else {
                stack2.add(stack.get(i));
            }
        }
         */


        while (!stack.isEmpty()){
            if(stack.peek() < 100){
                toplam += stack.pop();
            }else {
                stack2.push(stack.pop());
            }
        }

        System.out.println(toplam);
        System.out.println(stack);
        System.out.println(stack2);



    }
}
