package com.liuleven.designpattern.headfirst20200510.chapter1.v2;

/**
 * @description: 一定要写注释啊
 * @date: 2020-05-10 10:03
 * @author: 十一
 */
public abstract class Duck {

    public void quack() {
        System.out.println("duck quack ...");
    }

    public void swim() {
        System.out.println("duck swim ...");
    }

    public abstract void display();

    public void fly() {
        System.out.println("duck fly ...");
    }
}
