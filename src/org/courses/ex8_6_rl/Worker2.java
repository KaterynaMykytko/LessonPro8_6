package org.courses.ex8_6_rl;

import java.util.concurrent.locks.ReentrantLock;

public class Worker2 implements Runnable {
    private ReentrantLock reentrantLock;

    public Worker2(ReentrantLock reentrantLock) {
        this.reentrantLock = reentrantLock;
    }

    @Override
    public void run() {
        try {
            reentrantLock.lock();
            System.out.println("START W2 \n* Worker2-1");
            Thread.sleep(1000);
            System.out.println("* Worker2-2");
            Thread.sleep(1000);
            System.out.println("* Worker2-3\nEND W2");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            reentrantLock.unlock();
        }
    }
}
