package com.moqi.daili;

public class LiuDeHua implements Star {
    @Override
    public String sing(String name) {
        System.out.println("啦啦啦啦");
        return "唱完";
    }

    @Override
    public String dance(String name) {
        System.out.println("开心的马驹");
        return "调完";
    }
}
