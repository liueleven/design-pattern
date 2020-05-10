package com.liuleven.designpattern.headfirst20200510.chapter1.v3;

/**
 * @description: 一定要写注释啊
 * @date: 2020-05-10 10:05
 * @author: 十一
 */
public class MallardDuck extends Duck implements Flyable{
    @Override
    public void display() {
        System.out.println("duck color is green");
    }

    @Override
    public void fly() {
        System.out.println("duck fly ...");
    }
}
