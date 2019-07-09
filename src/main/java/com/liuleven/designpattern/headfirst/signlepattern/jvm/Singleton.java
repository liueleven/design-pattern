package com.liuleven.designpattern.headfirst.signlepattern.jvm;

/**
 * @description: 利用jvm加载这个类的时候，创建唯一的实例，缺点是如果不用占用内存
 * @date: 2019-01-11 17:50
 * @author: 十一
 */
public class Singleton {

    private static Singleton uniqueInstance = new Singleton();

    private Singleton() {
        System.out.println("当前线程名称：>>>>" + Thread.currentThread().getName());
    }

    public static Singleton getUniqueInstance() {
        return uniqueInstance;
    }
}
