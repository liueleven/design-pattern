package com.liuleven.designpattern.headfirst20200510.chapter5.v3;

/**
 * @description: 一定要写注释啊
 * @date: 2020-05-24 23:43
 * @author: 十一
 */
public class Singleton {

    private static Singleton uniqueInstance = new Singleton();

    private Singleton() {
    }

    public static  Singleton getInstance() {
        return uniqueInstance;
    }


}
