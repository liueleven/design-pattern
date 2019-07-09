package com.liuleven.designpattern.headfirst.factory.abstractfactory;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @description: pizza类，烘烤，切，打包都一样，做的过程由具体的子类来实现
 * @date: 2019-01-11 15:57
 * @author: 十一
 */
public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    abstract void prepare();

    public void bake() {
        System.out.println("bake  " + name + " pizza...");
    }

    public void cut() {
        System.out.println("cut  " + name + " pizza...");
    }

    public void box() {
        System.out.println("box  " + name + " pizza...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", veggies=" + Arrays.toString(veggies) +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", clams=" + clams +
                '}';
    }
}
