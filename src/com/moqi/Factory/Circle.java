package com.moqi.Factory;

import com.moqi.Factory.service.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
