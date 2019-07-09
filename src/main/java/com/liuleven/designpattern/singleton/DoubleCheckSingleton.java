package com.liuleven.designpattern.singleton;

import com.liuleven.designpattern.headfirst.factory.abstractfactory.Sauce;

/**
 * @description: 双重检查加锁
 * @date: 2019-07-09 20:28
 * @author: 十一
 */
public class DoubleCheckSingleton {
    /**
     *  volatile 禁止指令重排，可见性
     */
    private volatile static DoubleCheckSingleton doubleCheckSingleton;

    private DoubleCheckSingleton () {

    }

    public static DoubleCheckSingleton getSingleton() {
        if (null == doubleCheckSingleton) {
            synchronized (DoubleCheckSingleton.class) {
                if (doubleCheckSingleton == null) {
                    doubleCheckSingleton = new DoubleCheckSingleton();
                }
            }
        }
        return doubleCheckSingleton;
    }
}
