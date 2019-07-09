package com.liuleven.designpattern.headfirst.factory.simplefactory;

/**
 * @description: 一定要写注释啊
 * @date: 2019-01-10 18:38
 * @author: 十一
 */
public class Pizza {

    public String pizzaName = null;

    public void prepare() {
        System.out.println("prepare " + pizzaName + " pizza...");
    }

    public void bake() {
        System.out.println("bake  " + pizzaName + " pizza...");
    }

    public void cut() {
        System.out.println("cut  " + pizzaName + " pizza...");
    }

    public void box() {
        System.out.println("box  " + pizzaName + " pizza...");
    }
}
