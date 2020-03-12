package com.platforu.farwind.javase_demo.multithreading;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.addThreadWithRunnable();
    }

    void addThreadWithRunnable(){
        MyRunnable myRunnable = new MyRunnable();
        for (int i = 0; i < 1000; i++) {
            Thread t = new Thread(myRunnable);
            t.start();
        }
    }
}
