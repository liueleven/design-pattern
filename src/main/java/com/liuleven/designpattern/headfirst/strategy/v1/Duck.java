package com.liuleven.designpattern.headfirst.strategy.v1;

/**
 * @description: 一定要写注释啊
 * @date: 2019-01-04 19:36
 * @author: 十一
 */
public abstract class Duck {


    public void quack() {

        System.out.println("quack");
    }

    public void swim() {
        System.out.println("swim");
    }

    public abstract void display();

    public void fly() {

        System.out.println("fly");
    }
}
