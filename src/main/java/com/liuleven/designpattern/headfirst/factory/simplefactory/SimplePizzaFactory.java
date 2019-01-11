package com.liuleven.designpattern.headfirst.factory.simplefactory;

/**
 * @description: 一定要写注释啊
 * @date: 2019-01-10 18:37
 * @author: 十一
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if ("cheese".equalsIgnoreCase(type)) {
            pizza = new CheesePizza(type);
        }else if("pepperoni".equalsIgnoreCase(type)) {
            pizza = new PepperoniPizza(type);
        }
        return pizza;
    }
}
