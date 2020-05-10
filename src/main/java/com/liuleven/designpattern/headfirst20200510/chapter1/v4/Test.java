package com.liuleven.designpattern.headfirst20200510.chapter1.v4;

/**
 * @description: 一定要写注释啊
 * @date: 2020-05-10 10:07
 * @author: 十一
 */
public class Test {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.setFlyBehavior(new FlyWithWings());
        mallardDuck.fly();
    }
}
