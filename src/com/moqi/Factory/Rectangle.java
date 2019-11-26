package com.moqi.Factory;

import com.moqi.Factory.service.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle:: draw() method");
    }
}
