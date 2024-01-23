package com.bilgeadam.lesson007;

import java.util.Arrays;

public class Question39 {
    public static void main(String[] args) {

        String[][] matris1 = {{"Bilge", "Advanced"}, {"Postgre", "Data"}, {"ABC", "CDE"}};

        String[][] matris2 = {{"Adam", "Java"}, {"SQL", "Base"}};

        System.out.println("----");

        //BilgeAdam
        //AdvancedJava
        //PostgreSQL
        //DataBase

        System.out.println(matris1[0][0] + matris2[0][0]);
        System.out.println(matris1[0][1] + matris2[0][1]);
        System.out.println(matris1[1][0] + matris2[1][0]);
        System.out.println(matris1[1][1] + matris2[1][1]);

        System.out.println("------------");

        //lengthi küçük olan matris kadar ford döngüsüde gezmek için
        int donguSayisi = matris1.length < matris2.length ? matris1.length : matris2.length;

        for (int i = 0; i < donguSayisi; i++) {
            for (int j = 0; j < matris1[i].length; j++) {
                System.out.println(matris1[i][j] + matris2[i][j]);
                //matris1[1][1] + matris2[1][1]
                //matris[2][0] + matris[2][0]
            }
        }
    }
}
