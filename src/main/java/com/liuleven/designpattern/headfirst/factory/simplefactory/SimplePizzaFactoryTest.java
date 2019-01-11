package com.liuleven.designpattern.headfirst.factory.simplefactory;

/**
 * @description: 一定要写注释啊
 * @date: 2019-01-10 19:29
 * @author: 十一
 */
public class SimplePizzaFactoryTest {
    public static void main(String[] args) {
        PizzaStore store = new PizzaStore(new SimplePizzaFactory());
        store.orderPizza("cheese");
    }
}
