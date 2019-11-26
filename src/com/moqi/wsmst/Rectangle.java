package com.moqi.wsmst;

import com.moqi.wsmst.service.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle:: draw() method");
    }
}
