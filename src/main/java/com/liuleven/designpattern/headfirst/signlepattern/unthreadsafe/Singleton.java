package com.liuleven.designpattern.headfirst.signlepattern.unthreadsafe;

/**
 * @description: 多线程是有问题的
 * @date: 2019-01-11 17:50
 * @author: 十一
 */
public class Singleton {

    private static Singleton uniqueInstance;

    private Singleton() {
        System.out.println("当前线程名称：>>>>" + Thread.currentThread().getName());
    }

    public static Singleton getUniqueInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
