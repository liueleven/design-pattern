package com.liuleven.designpattern.headfirst.strategy.v2;

/**
 * @description: 一定要写注释啊
 * @date: 2019-01-04 19:38
 * @author: 十一
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new ZhiZhi();
    }


    @Override
    public void display() {
        System.out.println("duck is yellow");
    }
}
