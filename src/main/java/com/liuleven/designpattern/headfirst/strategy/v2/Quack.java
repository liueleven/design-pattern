package com.liuleven.designpattern.headfirst.strategy.v2;

/**
 * @description: 一定要写注释啊
 * @date: 2019-01-04 20:26
 * @author: 十一
 */
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("quack 嘎嘎叫");
    }
}
