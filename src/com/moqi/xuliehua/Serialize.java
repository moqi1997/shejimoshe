package com.moqi.xuliehua;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialize implements Serializable {
    private static final long serialVersionUID = 5379994821831828801L;
    public int num = 1390;

    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("d:/serialize.dat");
            ObjectOutputStream fos = new ObjectOutputStream(fileOutputStream);
            Serialize serialize = new Serialize();
            fos.writeObject(serialize);
            fos.flush();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
