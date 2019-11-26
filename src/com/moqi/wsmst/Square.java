package com.moqi.wsmst;

import com.moqi.wsmst.service.Shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}