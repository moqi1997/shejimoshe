package com.moqi.shipei;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    private AtomicInteger atomic = new AtomicInteger(0);
    private int i = 0;
    //使用cas安全计数器
    private void safeCount() {
        for (;;) {
            int i = atomic.get();
            boolean b = atomic.compareAndSet(i, ++i);
            if (b) {
                break;
            }
        }
    }
    //非线程安全的计数器
    private void count() {
        i++;
    }
    public static void main(String[] args) {
        final Counter cas = new Counter();
        ArrayList<Thread> ts = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 10000; j++) {
                        cas.count();
                        cas.safeCount();
                    }
                }
            });
            ts.add(t);
        }
        for (Thread t : ts) {
            t.start();
        }
        //等待所有线程执行完成
        for (Thread t : ts) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(cas.i);
        System.out.println(cas.atomic.get());
        System.out.println(System.currentTimeMillis() - start + "ms");
    }
}
