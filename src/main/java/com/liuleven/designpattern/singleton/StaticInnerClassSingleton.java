package com.liuleven.designpattern.singleton;


/**
 * @description: 静态内部类
 * @date: 2019-07-09 20:36
 * @author: 十一
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton() {

    }

    private static class Singleton{
         private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getSingleton() {
        return Singleton.staticInnerClassSingleton;
    }
}
