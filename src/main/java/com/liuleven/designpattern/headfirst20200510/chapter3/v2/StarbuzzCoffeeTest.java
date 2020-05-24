package com.liuleven.designpattern.headfirst20200510.chapter3.v2;

/**
 * @description: 一定要写注释啊
 * @date: 2020-05-17 17:32
 * @author: 十一
 */
public class StarbuzzCoffeeTest {

    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDesc() + " " + espresso.cost()        );

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        System.out.println(darkRoast.getDesc() + " " + darkRoast.cost());


    }
}
