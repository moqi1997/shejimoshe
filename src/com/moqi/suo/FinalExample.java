package com.moqi.suo;

public class FinalExample {
    int i;
    final int j;
    static FinalExample obj;

    public FinalExample() {
        this.i = 1;
        this.j = 2;
    }
    public static void writer() {
         obj = new FinalExample();
    }
    public static void reader() {
        FinalExample object = obj;
        int a = object.i;
        int b = object.j;
    }
}
