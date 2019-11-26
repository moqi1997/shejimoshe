package com.moqi.Factory;

import com.moqi.Factory.service.Color;

public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
