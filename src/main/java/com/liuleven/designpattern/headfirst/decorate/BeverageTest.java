package com.liuleven.designpattern.headfirst.decorate;

import com.liuleven.designpattern.headfirst.decorate.condiment.Milk;
import com.liuleven.designpattern.headfirst.decorate.condiment.Mocha;

/**
 * @description: 一定要写注释啊
 * @date: 2019-01-10 16:32
 * @author: 十一
 */
public class BeverageTest {

    public static void main(String[] args) {
        Beverage beverage = new DarkRoast();
        System.out.println(beverage.getDescription() + " " + beverage.cost() + "$");

        beverage = new Milk(beverage);
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription() + " " + beverage.cost() + "$");
    }
}
