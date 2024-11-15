package main.java.aboutThreads;

//Birden fazla thread oluşturup, her birinin farklı bir mesaj yazdırmasını sağlayan bir program yazınız.
public class LambdaThread {
    public static void main(String[] args) {
        Runnable task1 = () -> System.out.println("Thread 1: I'm now working");
        Runnable task2 = () -> System.out.println("Thread 2: I have been long working");
        Runnable task3 = () -> System.out.println("Thread 3: I will");

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        Thread t3 = new Thread(task3);

        t1.start();
        t2.start();
        t3.start();
    }
}
