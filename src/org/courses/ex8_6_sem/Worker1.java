package org.courses.ex8_6_sem;

import java.util.concurrent.Semaphore;

public class Worker1 implements Runnable {

    private Semaphore semaphore;

    public Worker1(Semaphore semaphore) {
        this.semaphore = semaphore;
    }



    @Override
    public void run() {
        try {
            semaphore.acquire(1);
            System.out.println("START W1 \n* Worker1-1");
            Thread.sleep(1000);
            System.out.println("* Worker1-2");
            Thread.sleep(1000);
            System.out.println("* Worker1-3 \nEND W1");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release(1);
        }
    }
}
