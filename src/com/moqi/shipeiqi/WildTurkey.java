package com.moqi.shipeiqi;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("鸭子呱呱叫");
    }

    @Override
    public void fly() {
        System.out.println("飞起来了");
    }
}
