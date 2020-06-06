package com.liuleven.designpattern.headfirst20200510.chapter7.v1;

/**
 * @description: 一定要写注释啊
 * @date: 2020-06-06 18:21
 * @author: 十一
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("quack");
    }

    @Override
    public void fly() {
        System.out.println("i'm fly");
    }
}
