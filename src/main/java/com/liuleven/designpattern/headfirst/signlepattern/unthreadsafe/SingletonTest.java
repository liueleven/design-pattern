package com.liuleven.designpattern.headfirst.signlepattern.unthreadsafe;


import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.concurrent.CountDownLatch;

/**
 * @description: 一定要写注释啊
 * @date: 2019-01-11 17:51
 * @author: 十一
 */
public class SingletonTest{

    public static int count = 100;
    public static CountDownLatch latch = new CountDownLatch(count);
    public static void main(String[] args) {


        for (int i=0; i<count; i++) {
            Thread t = new Thread(SingletonTest :: printResult);
            t.start();
            latch.countDown();
        }

    }

    public static void printResult() {
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Singleton uniqueInstance = Singleton.getUniqueInstance();

    }
}
