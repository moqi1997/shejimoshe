package com.moqi.Thread;

public class TestThread extends Thread {
    public TestThread(String name){
        super(name);
    }
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            for(long k=0;k<100000000;k++);
            System.out.println(this.getName()+":"+i);
        }
    }
    public static void main(String[] args){
        Thread t1=new TestThread("李白");
        Thread t2=new TestThread("屈原");
        t1.start();
        t2.start();
    }
}
