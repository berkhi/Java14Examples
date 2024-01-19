package com.bilgeadam.lesson005;

public class Question30 {
    public static void main(String[] args) {

        // her virgülden öncesini aşağı satıra yazan program
        //substring(index, i)

        //Java
        //Spring
        //Postgre
        //React

        String text = "Java,Spring,Postgre,React";
        String[] dizi = text.split(",");
        //String[] dizi = {Java, Spring, Postgre, React}

        for (int i = 0; i < dizi.length; i++) {
            System.out.println(dizi[i]);
        }

        System.out.println("New String  ");

        String newString = text.replace(",", "\n");
        System.out.println(newString);


        System.out.println("Altarnatif  ");

        String text2 = "Java,Spring,Postgre,React";
        int index = 0;

        for (int i = 0; i < text2.length(); i++) {
            if (text2.charAt(i) == ',') {           //0,4
                System.out.println(text2.substring(index, i));
                index = i + 1;
            }
        }
        System.out.println(text2.substring(index));

    //14:45
    }
}
