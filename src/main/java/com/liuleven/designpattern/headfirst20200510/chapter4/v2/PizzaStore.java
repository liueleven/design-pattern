package com.liuleven.designpattern.headfirst20200510.chapter4.v2;

/**
 * @description: 一定要写注释啊
 * @date: 2020-05-24 22:54
 * @author: 十一
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
