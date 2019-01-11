package com.liuleven.designpattern.headfirst.decorate;

/**
 * @description: DarkRoast
 * @date: 2019-01-10 15:48
 * @author: 十一
 */
public class DarkRoast extends Beverage {

    @Override
    public float cost() {
        return 38.99F;
    }

    public DarkRoast() {
        description = "Dark Roast coffee";
    }
}
