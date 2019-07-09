package com.liuleven.designpattern.singleton;

/**
 * @description: 饿汉式
 * @date: 2019-07-09 19:46
 * @author: 十一
 */
public class HungrySingleton {

    private static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    public static void main(String[] args) {
        new Thread( () -> System.out.println(getInstance().toString())).start();
        new Thread( () -> System.out.println(getInstance().toString())).start();
        new Thread( () -> System.out.println(getInstance().toString())).start();
        new Thread( () -> System.out.println(getInstance().toString())).start();
        new Thread( () -> System.out.println(getInstance().toString())).start();
        new Thread( () -> System.out.println(getInstance().toString())).start();
        new Thread( () -> System.out.println(getInstance().toString())).start();
    }
}