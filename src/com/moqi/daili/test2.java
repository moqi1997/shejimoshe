package com.moqi.daili;

public class test2 {
    public static void main(String[] args) {
        IUserDao target = new UserDao();
        System.out.println("目标对象：" + target.getClass());
        //代理对象
        IUserDao proxy = (IUserDao) new ProxyFactory(target).getProxyInstance();
        System.out.println("代理对象：" + proxy.getClass());
        //执行dial对象的方法
        proxy.save();
        proxy.find();
    }
}
