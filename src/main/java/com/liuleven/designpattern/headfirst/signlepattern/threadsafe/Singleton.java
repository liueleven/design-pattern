package com.liuleven.designpattern.headfirst.signlepattern.threadsafe;

/**
 * @description: 使用关键字synchronized，缺点只有第一次会用到同步，以后就不用了，影响性能
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
            synchronized (Singleton.class) {
                if(uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
