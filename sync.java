package testing;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Counter implements Runnable {
    private static int counter = 0;
    private static final int limit = 1000;
    private static final int threadPoolSize = 5;
    private static final Object lock = new Object();

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(threadPoolSize);
        for (int i = 0; i < threadPoolSize; i++) {
            executorService.submit(new Counter());
        }
        executorService.shutdown();
    }

    @Override
    public void run() {
        while (counter < limit) {
            increaseCounter();
        }
    }

    private void increaseCounter() {
        synchronized (lock) {
            System.out.println(Thread.currentThread().getName() + " : " + counter);
            counter++;
        }
    }
}