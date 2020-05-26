package com.liuleven.designpattern.headfirst20200510.chapter5.v1;

/**
 * @description: 一定要写注释啊
 * @date: 2020-05-24 23:43
 * @author: 十一
 */
public class Singleton {

    private static Singleton unqueInstance = null;

    public static Singleton getInstance() {
        if (unqueInstance == null) {
            return new Singleton();
        }
        return unqueInstance;
    }


}
