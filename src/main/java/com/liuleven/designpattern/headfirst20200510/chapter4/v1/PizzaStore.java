package com.liuleven.designpattern.headfirst20200510.chapter4.v1;

/**
 * @description: 一定要写注释啊
 * @date: 2020-05-24 09:42
 * @author: 十一
 */
public class PizzaStore {

    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }


    public Pizza orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.box();
        return pizza;
    }
}
