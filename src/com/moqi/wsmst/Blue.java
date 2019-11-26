package com.moqi.wsmst;

import com.moqi.wsmst.service.Color;

public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
