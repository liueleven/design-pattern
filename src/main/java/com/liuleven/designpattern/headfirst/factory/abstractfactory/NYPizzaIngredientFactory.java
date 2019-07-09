package com.liuleven.designpattern.headfirst.factory.abstractfactory;

/**
 * @description: 纽约pizza 工厂 每种配料返回纽约特色的配料
 * @date: 2019-01-11 15:45
 * @author: 十一
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createViggies() {
        Veggies[] veggies = {new Girlic(),new Onion(),new Mushroom(),new RedPeper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicePepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
