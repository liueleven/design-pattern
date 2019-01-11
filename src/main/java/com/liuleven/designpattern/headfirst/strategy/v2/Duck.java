package com.liuleven.designpattern.headfirst.strategy.v2;

/**
 * @description: 一定要写注释啊
 * @date: 2019-01-04 19:36
 * @author: 十一
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void quack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("all ducks float, even decoys!");
    }

    public abstract void display();

    public void fly() {
        flyBehavior.fly();
    }
}
