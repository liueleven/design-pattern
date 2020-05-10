package com.liuleven.designpattern.temptest;

import com.liuleven.designpattern.responsibility.CopyRightProcess;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @description: 一定要写注释啊
 * @date: 2020-01-17 11:55
 * @author: 十一
 */
public class Test {

    public static void main(String[] args) {
        List list = new ArrayList();
        new Thread(() -> {

            while (true) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                list.add(new CopyRightProcess());
            }
        }).start();

    }
}
