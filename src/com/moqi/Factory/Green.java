package com.moqi.Factory;

import com.moqi.Factory.service.Color;

public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}