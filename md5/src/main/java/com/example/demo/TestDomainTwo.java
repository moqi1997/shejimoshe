package com.example.demo;

import org.springframework.stereotype.Component;

@Component("testDomainTwo")
public class TestDomainTwo {
    public TestDomainTwo() {
        //构造参数打印，证明被调过
        System.out.println("new TestDomainTwo-------------");
    }
}