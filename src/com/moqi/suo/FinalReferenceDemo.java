package com.moqi.suo;

public class FinalReferenceDemo {
    final int[] intArray;
    static FinalReferenceDemo obj;

    public FinalReferenceDemo() {
        intArray = new int[1];
        intArray[0] = 1;
    }
    public static void writerOne() {
        obj = new FinalReferenceDemo();
    }
    public static void writerTwo() {
        obj.intArray[0] = 2;
    }
    public static void reader() {
        if (obj != null) {
            int temp1 = obj.intArray[0];
        }
    }
}
