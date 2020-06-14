package com.liuleven.designpattern.headfirst20200510.chapter9.v1;

import java.util.Iterator;

/**
 * @description: 一定要写注释啊
 * @date: 2020-06-06 23:40
 * @author: 十一
 */
public abstract class Beverage {

    final void  prepareRecipe() {
        boilWater();;
        brew();
        pourInCup();
    }

    abstract void brew();

    void boilWater() {
        System.out.println("boilWater...");
    }

    void pourInCup() {
        System.out.println("pourInCup...");
    }
}
