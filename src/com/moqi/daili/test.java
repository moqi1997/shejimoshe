package com.moqi.daili;

public class test {
    public static void main(String[] args) {
        //代理对象
        IUserDao userDaoProxy = new UserDaoProxy();
        //执行代理方法
        userDaoProxy.save();
    }
}
