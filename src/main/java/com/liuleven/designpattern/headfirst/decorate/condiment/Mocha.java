package com.liuleven.designpattern.headfirst.decorate.condiment;

import com.liuleven.designpattern.headfirst.decorate.Beverage;

/**
 * @description: 一定要写注释啊
 * @date: 2019-01-10 16:15
 * @author: 十一
 */
public class Mocha extends CondimentDecorator{

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public float cost() {
        return 2.99f + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " Mocha";
    }
}
