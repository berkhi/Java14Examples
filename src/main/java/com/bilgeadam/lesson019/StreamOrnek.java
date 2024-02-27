package com.bilgeadam.lesson019;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOrnek {


    public static void main(String[] args) {

        // User sınıfımız olsun
        // id ve name, salary
        // tostringmethodunu yazalım
        // bilgilerigostermethodu olsun
        // mainde users listeli oluşturalım içine bi kaç tane user atalım
        // bütün userları için bilgileri goster metodunu çağralım.

        ArrayList<User> users = new ArrayList<>();

        users.add(new User("1", "Deniz", 1200));
        users.add(new User("2", "Zeynep", 45000));
        users.add(new User("3", "Ali", 30000));
        users.add(new User("4", "Ayse", 25000));
        users.add(new User("5", "Mehmet", 15000));
        users.add(new User("6", "Berkin", 5000));
        users.add(new User("7", "Ali", 30000));

        //users.forEach(StreamOrnek::bilgileriGoster);

        //salary si 2500 büyük olanları bir liste atalım.


        //toList() --> oluşan listeyi immuutable yapar
        //collect(Collectors.toList() --> oluşan listeyi mutable yapar
        //List<User> collect = users.stream().filter(user -> user.getSalary() > 25000).collect(Collectors.toList());

        //System.out.println(collect);


        //ismin ali olanları bir sete atalım

        //Set<User> aliler = users.stream().filter(user -> user.getName().toLowerCase().equals("ali")).collect(Collectors.toSet());
        //System.out.println(aliler);

        // her bir user için yeni bir User nesnesi oluşturup isimlerini yanına BA
        // yazdırıp yeni listeye atalım

        List<User> collect = users.stream()
                .map(user -> new User(user.getId(), user.getName() + "BA", user.getSalary()))
                .collect(Collectors.toList());
        System.out.println(collect);

        //kullanıcıları aldıkları maaşa göre sıralayalım

        //users.stream().sorted(Comparator.comparingDouble(User::getSalary).reversed()).forEach(System.out::println);

        //maaşı en yüksek olan userı bulalım
        //users.stream().sorted(Comparator.comparingDouble(User::getSalary).reversed()).limit(1).forEach(System.out::println);

        //User user = users.stream().max((s1, s2) -> Double.compare(s1.getSalary(), s2.getSalary())).orElse(null);
        //System.out.println("User "+user);

        //ortalama maaşı bulalım

        //DoubleSummaryStatistics collect1 = users.stream().collect(Collectors.summarizingDouble(User::getSalary));
        //System.out.println(collect1);

        //Double collect2 = users.stream().collect(Collectors.averagingDouble(User::getSalary));
        //System.out.println(collect2);

        //id ve salary değerlerini hashmap yapısına atalım stream ile

        Map<String, Double> collect3 = users.stream().collect(Collectors.toMap(User::getId, User::getSalary));


        collect3.forEach((k, v) -> System.out.println(k + " " + v));


    }

    public static void bilgileriGoster(User user) {
        System.out.println(user.toString());
    }

}
