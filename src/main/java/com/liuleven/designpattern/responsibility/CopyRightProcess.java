package com.liuleven.designpattern.responsibility;

/**
 * @description: 一定要写注释啊
 * @date: 2020-01-15 17:42
 * @author: 十一
 */
public class CopyRightProcess implements Process {


    @Override
    public void doProcess() {
        System.out.println(this.getClass().getSimpleName()  + " is starting ...");
    }
}
