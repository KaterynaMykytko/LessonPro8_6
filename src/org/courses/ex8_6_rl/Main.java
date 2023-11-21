package org.courses.ex8_6_rl;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 5; i++) {
            ReentrantLock reentrantLock = new ReentrantLock();
            Thread thread1 = new Thread(new Worker1(reentrantLock));
            Thread thread2 = new Thread(new Worker2(reentrantLock));

            thread1.start();
            thread2.start();

            thread1.join();
            thread2.join();

        }
    }
}