package com.bilgeadam.lesson015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListOrnek3 {

    public static void main(String[] args) {

        //Bir ArrayList içinde, iki farklı öğenin toplamı hedef bir sayıyı verdiğinde, bu iki öğeyi bulalım


        //Girdi: [2, 7, 11, 15], Hedef: 9
        //Çıktı: [2, 7] veya [7, 2]

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 7, 11, 15, 7, 2));
        List<Integer> result = new ArrayList<>();

        int target = 9;

        toplamBul(list,target);


    }

    public static void toplamBul(List<Integer> list, int target){
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    result.add(list.get(i));
                    result.add(list.get(j));
                }
            }
        }
        System.out.println(result);
    }



    //10 kişi
    //5

    //bugün   5 rez
    //yarınım 2 rez

    //gün,ve ay

    //List<>

}
