package com.bilgeadam.lesson010.product.util;

import com.bilgeadam.lesson010.product.Product;

import java.util.Random;

public class RandomGenerateCode {

    public static void main(String[] args) {
    }

    public static String randomGenerateId(){
        Random random = new Random();
        int randomId = random.nextInt(10000,100000);
        return Integer.toString(randomId);
    }


    public static String randomProductCodeGenerator(String name){
        String productCode = name.substring(0,3);
        return productCode + randomGenerateId();
    }


}
