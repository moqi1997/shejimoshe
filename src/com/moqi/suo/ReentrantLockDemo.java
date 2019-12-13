package com.moqi.suo;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {
    int a = 0;
    ReentrantLock lock = new ReentrantLock();
    public void writer() {
        //获取锁
        lock.lock();
        try {
            a++;
        } finally {
        //释放锁
            lock.unlock();
        }



    }
    public void reader() {
    //获取锁
        lock.lock();



        try {
        int i = a;
    } finally {
        //释放锁
        lock.unlock();
    }
}
}
