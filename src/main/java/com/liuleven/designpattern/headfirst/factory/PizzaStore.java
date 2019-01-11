package com.liuleven.designpattern.headfirst.factory;


/**
 * @description: 一定要写注释啊
 * @date: 2019-01-10 18:41
 * @author: 十一
 */
public abstract class PizzaStore extends Pizza{



    public Pizza orderPizza(String type) {
        Pizza pizza = null;

        pizza = createPizza(type);
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
