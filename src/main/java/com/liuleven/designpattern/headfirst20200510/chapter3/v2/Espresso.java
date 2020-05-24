package com.liuleven.designpattern.headfirst20200510.chapter3.v2;

/**
 * @description: 一定要写注释啊
 * @date: 2020-05-17 17:27
 * @author: 十一
 */
public class Espresso extends Beverage {

    public Espresso() {
        desc = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
