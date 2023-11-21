package org.courses.ex8_6_sem;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 5; i++) {
            Semaphore semaphore = new Semaphore(1);
            Thread thread1 = new Thread(new Worker1(semaphore));
            Thread thread2 = new Thread(new Worker2(semaphore));

            thread1.start();
            thread2.start();

            thread1.join();
            thread2.join();

        }
    }
}