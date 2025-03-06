package main.java.vector;

import java.util.Vector;

public class MultiThreadVectorExample {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                vector.add(i);
                System.out.println("Thread 1 added: " + i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 5; i < 10; i++) {
                vector.add(i);
                System.out.println("Thread 2 added: " + i);
            }
        });

        t1.start();
        t2.start();
    }
}
