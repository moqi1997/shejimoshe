package com.moqi.volatileFeatures;

public class test1 {
    volatile long v1 = 0;

    public void setV1(long v1) {
        this.v1 = v1;
    }

    public void getV1() {
        v1++;
    }

    public long get() {
        return v1;
    }
}

class test2 {
    long vl = 0;

    public synchronized void setVl(long l) {
        vl = l;
    }

    public void getAndIncrement() {
        long temp = get();
        temp += 1L;
        setVl(temp);
    }

    public synchronized long get() {
        return vl;
    }
}