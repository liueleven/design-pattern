package com.liuleven.designpattern.headfirst20200510.chapter3.v2;

/**
 * @description: 一定要写注释啊
 * @date: 2020-05-17 17:29
 * @author: 十一
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc()
                + ", Mocha";
    }

    @Override
    public double cost() {
        return 0 + beverage.cost();
    }
}
