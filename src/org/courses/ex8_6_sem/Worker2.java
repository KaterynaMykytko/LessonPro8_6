package org.courses.ex8_6_sem;

import java.util.concurrent.Semaphore;

public class Worker2 implements Runnable {

    private Semaphore semaphore;

    public Worker2(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
            try {
                semaphore.acquire(1);
                System.out.println("START W2 \n* Worker2-1");
                Thread.sleep(1000);
                System.out.println("* Worker2-2");
                Thread.sleep(1000);
                System.out.println("* Worker2-3\nEND W2");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                semaphore.release(1);
        }
    }
}
