package com.liuleven.designpattern.headfirst20200510.chapter5.v4;

/**
 * @description: 一定要写注释啊
 * @date: 2020-05-24 23:43
 * @author: 十一
 */
public class Singleton {

    private static volatile Singleton uniqueInstance = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {

            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }


}
