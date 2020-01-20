package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StartMain {
    //启动测试
    public static void main(String[] args) {
        AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext(CglibConfig.class);
        System.out.println(anno.getBean(TestDomain.class));
        System.out.println(anno.getBean(TestDomainTwo.class));
    }
}
