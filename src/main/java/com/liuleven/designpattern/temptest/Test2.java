package com.liuleven.designpattern.temptest;

import com.liuleven.designpattern.responsibility.CopyRightProcess;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @description: 一定要写注释啊
 * @date: 2020-01-17 11:55
 * @author: 十一
 */
public class Test2 {
   static List list = new ArrayList();

    public static void main(String[] args) {
        ExecutorService myThreadFactoryTest = Executors.newCachedThreadPool(new NamedThreadFactory("myThreadFactoryTest"));



        myThreadFactoryTest.submit(new Job());


    }
    static class Job implements Runnable {
        @Override
        public void run() {
            while (true) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                list.add(new CopyRightProcess());
            }
        }
    }
}