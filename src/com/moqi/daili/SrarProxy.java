package com.moqi.daili;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SrarProxy implements InvocationHandler {
    //目标类，也就是代理对象
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //方法的增强
        System.out.println("收钱");
        Object result = method.invoke(target, args);
        return result;
    }
    //生成代理类
    public Object CreatProxyedObj() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces()
        ,this);
    }
}
