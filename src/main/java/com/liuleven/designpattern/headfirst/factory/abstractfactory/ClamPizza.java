package com.liuleven.designpattern.headfirst.factory.abstractfactory;

/**
 * @description: 具体的某种pizza
 * @date: 2019-01-11 16:03
 * @author: 十一
 */
public class ClamPizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    /**
     * 做pizza
     * 不同的pizza可以使用不同的配料工厂，由配料工厂来看决定什么哪种原料，pizza之间解耦了
     */
    @Override
    void prepare() {
        System.out.println("preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
    }
}
