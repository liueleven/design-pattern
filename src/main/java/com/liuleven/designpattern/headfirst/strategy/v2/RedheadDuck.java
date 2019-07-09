package com.liuleven.designpattern.headfirst.strategy.v2;

/**
 * @description: 一定要写注释啊
 * @date: 2019-01-04 19:38
 * @author: 十一
 */
public class RedheadDuck extends Duck {

    RedheadDuck () {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("duck is red");
    }
}
