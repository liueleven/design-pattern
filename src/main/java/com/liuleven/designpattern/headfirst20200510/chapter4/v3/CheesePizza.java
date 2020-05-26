package com.liuleven.designpattern.headfirst20200510.chapter4.v3;

/**
 * @description: 一定要写注释啊
 * @date: 2020-05-24 23:26
 * @author: 十一
 */
public class CheesePizza extends Pizza {


    NYPizzaIngredientFactory ingredientFactory;

    public CheesePizza(NYPizzaIngredientFactory nyPizzaIngredientFactory) {
        this.ingredientFactory = nyPizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        Cheese cheese = ingredientFactory.createCheese();
    }
}
