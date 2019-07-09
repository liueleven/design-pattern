package com.liuleven.designpattern.singleton;

/**
 * @description: 懒汉式
 * @date: 2019-07-09 19:45
 * @author: 十一
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private LazySingleton () {

    }

    public static LazySingleton getLazySingleton() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

}
