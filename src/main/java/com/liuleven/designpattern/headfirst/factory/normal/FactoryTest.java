package com.liuleven.designpattern.headfirst.factory.normal;

/**
 * @description: 一定要写注释啊
 * @date: 2019-01-10 20:10
 * @author: 十一
 */
public class FactoryTest {

    public static void main(String[] args) {
        PizzaStore nystore = new NYPizzaStore();
        Pizza pizza = nystore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.name );
    }
}
