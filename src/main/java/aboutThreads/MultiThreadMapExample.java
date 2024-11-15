package main.java.aboutThreads;

import java.util.concurrent.ConcurrentHashMap;

//Birden fazla thread’in aynı anda bir ConcurrentHashMap‘te veri eklemesini sağlayan
// bir program yazınız. Her thread kendi ID’sine karşılık gelen bir mesaj eklesin.
public class MultiThreadMapExample {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        Runnable task = () -> {
            int threadId = (int) Thread.currentThread().getId();
            map.put(threadId, threadId + " works...");
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);

        t1.start();
        t2.start();
        t3.start();

        try{
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        map.forEach((key,value) -> System.out.println(key + " : " + value));
    }
}
