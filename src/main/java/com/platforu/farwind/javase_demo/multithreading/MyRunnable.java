package com.platforu.farwind.javase_demo.multithreading;

public class MyRunnable implements Runnable {
    private Thread t;

    private String threadName;

    public MyRunnable(String threadName) {
        this.threadName = threadName;
        System.out.println("Creating thread: "+threadName);
    }

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        System.out.println("START RUN MyRunnable.run() method...");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("EXISTING MyRunnable.run() method...");
    }
}
