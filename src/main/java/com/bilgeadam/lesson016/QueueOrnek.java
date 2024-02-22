package com.bilgeadam.lesson016;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueOrnek {

    public static void main(String[] args) {

        Customer customerQueue1 = new Customer("Serkan", 30);
        Customer customerQueue2 = new Customer("Ahmet", 32);
        Customer customerQueue3 = new Customer("Ayse", 16);
        Customer customerQueue4 = new Customer("Serpil", 42);

        Queue<Customer> kuyruk = new PriorityQueue<>();

        kuyruk.add(customerQueue1);
        kuyruk.add(customerQueue2);
        kuyruk.add(customerQueue3);
        kuyruk.add(customerQueue4);

        while (kuyruk.iterator().hasNext()) {
            System.out.println(kuyruk.poll() + " işlemini Yaptı");
        }


        //Bitane müşteri sınıfı açalaım
        //kuyruga müşterileri atalım
        //isim ve yaş değerleri olcak
        //yaşı büyük olanlar ilk sırada yer alcak
        //yaşa göre bir işlem önceliği sağlıyoru
        /*

        Queue<Customer> musteriler = new PriorityQueue<>(Comparator.comparing(Customer::getAge).reversed());
        Customer musteri = new Customer("Deniz", 28);
        Customer musteri2 = new Customer("Ali", 33);
        Customer musteri3 = new Customer("Mehmet", 44);
        musteriler.add(musteri);
        musteriler.add(musteri3);
        musteriler.add(musteri2);

        while (!musteriler.isEmpty()) {
            System.out.println(musteriler.poll());
        }






        Queue<Customer> customers = new LinkedList<>();

        customers.add(customerQueue1);
        customers.add(customerQueue2);
        customers.add(customerQueue3);
        customers.add(customerQueue4);

        sirala((LinkedList<Customer>) customers);
    }

    public static void sirala(LinkedList<Customer> linkedList) {
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.sort((o1, o2) -> o2.getAge() - o1.getAge());
        }
        System.out.println(linkedList);
    }
     */

    }
}
