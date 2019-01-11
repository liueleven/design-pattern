package com.liuleven.designpattern.headfirst.strategy.v2;

/**
 * @description: 一定要写注释啊
 * @date: 2019-01-04 20:28
 * @author: 十一
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("fly 用翅膀飞");
    }
}
