package com.moqi.wsmst;

import com.moqi.wsmst.service.Color;

public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}