package com.bilgeadam.lesson018;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    //Bir dizideki sayıların çiftlerini bulan ve her çiftin toplamını hedef bir sayı
    // ile eşleştiren algoritmayı yazın. Eşleşen çiftleri bulduğunuzda, bu çiftleri ve
    // toplamlarını bir HashMap'te saklayın ve daha sonra ekrana bastırın.
    //Örneğin, verilen bir dizi: [3, 7, 9, 2, 4, 6, 5, 8] ve hedef sayı: 10 ise,
    // çiftler (2, 8) ve (4, 6)'yı bulmalısınız. Sonuç olarak,
    // HashMap şu şekilde olmalıdır: {(2, 8): 10, (4, 6): 10}.


    public static void main(String[] args) {
        int[] array = {3, 7, 9, 2, 4, 6, 5, 8};
        int targetSum = 10;

        find2(array, targetSum);
    }


    public static void find2(int[] array, int target) {
        HashMap<ArrayList<Integer>, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] + array[j] == target){
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(array[i]);
                    list.add(array[j]);
                    map.put(list,target);
                }
            }
        }
        map.entrySet().forEach(System.out::println);
    }

    public static void find(int[] array, int targetSum) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int complement = targetSum - array[i];
            if (map.containsKey(complement)) {
                System.out.println("(" + array[i] + ", " + complement + "): " + targetSum);
            }
            map.put(array[i], complement);
        }
    }
}
