package com.liuleven.designpattern.headfirst.factory.simplefactory;

/**
 * @description: 一定要写注释啊
 * @date: 2019-01-10 18:41
 * @author: 十一
 */
public class PizzaStore {

    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = null;

        pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
