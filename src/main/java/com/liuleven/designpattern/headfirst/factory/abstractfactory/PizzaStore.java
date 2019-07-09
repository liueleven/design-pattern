package com.liuleven.designpattern.headfirst.factory.abstractfactory;

/**
 * @description: 一定要写注释啊
 * @date: 2019-01-11 16:33
 * @author: 十一
 */
public class PizzaStore {

    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        switch (type) {
            case "cheese" :
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("NY style cheese pizza");
                break;
            case "clam" :
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("NY style clam pizza");
                break;
                default: break;
        }
        return pizza;
    }
}
