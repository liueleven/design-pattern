package com.liuleven.designpattern.headfirst20200510.chapter1.v4;

import com.liuleven.designpattern.headfirst.strategy.v2.FlyBehavior;

/**
 * @description: 一定要写注释啊
 * @date: 2020-05-10 10:03
 * @author: 十一
 */
public abstract class Duck {

    private FlyBehavior flyBehavior;

    public void swim() {
        System.out.println("duck swim ...");
    }

    public abstract void display();

    public void fly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
