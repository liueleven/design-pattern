package com.liuleven.designpattern.headfirst.factory.normal;

import java.util.ArrayList;

/**
 * @description: 一定要写注释啊
 * @date: 2019-01-10 20:10
 * @author: 十一
 */
public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();
    void prepare() {
        System.out.println("prepareing " + name);
        System.out.println("tossing dough ...");
        System.out.println("adding sauce...");
        System.out.println("adding toppings");
        for(int i=0; i<toppings.size(); i++) {
            System.out.println(" " + toppings.get(i));
        }
    }

    public void bake() {
        System.out.println("bake  " + name + " pizza...");
    }

    public void cut() {
        System.out.println("cut  " + name + " pizza...");
    }

    public void box() {
        System.out.println("box  " + name + " pizza...");
    }
}
