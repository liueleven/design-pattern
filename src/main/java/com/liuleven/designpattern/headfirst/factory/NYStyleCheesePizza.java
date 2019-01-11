package com.liuleven.designpattern.headfirst.factory;

/**
 * @description: 一定要写注释啊
 * @date: 2019-01-10 20:24
 * @author: 十一
 */
public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = "NY";
        dough = "thin crust dough";
        sauce = "marinara sauce";
        toppings.add("grated reggiano cheese");
    }

}
