package org.courses.ex8_6_rl;

import java.util.concurrent.locks.ReentrantLock;

public class Worker1 implements Runnable {

    private ReentrantLock reentrantLock;

    public Worker1(ReentrantLock reentrantLock) {
        this.reentrantLock = reentrantLock;
    }


    @Override
    public void run() {
        try {
            reentrantLock.lock();
            System.out.println("START W1 \n* Worker1-1");
            Thread.sleep(1000);
            System.out.println("* Worker1-2");
            Thread.sleep(1000);
            System.out.println("* Worker1-3 \nEND W1");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            reentrantLock.unlock();
        }
    }
}
