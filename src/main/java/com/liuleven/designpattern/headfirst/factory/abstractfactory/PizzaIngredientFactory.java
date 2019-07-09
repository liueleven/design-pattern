package com.liuleven.designpattern.headfirst.factory.abstractfactory;

/**
 * @description: 生产pizza原料抽象工厂
 * @date: 2019-01-11 12:04
 * @author: 十一
 */
public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createViggies();

    Pepperoni createPepperoni();

    Clams createClams();
}
