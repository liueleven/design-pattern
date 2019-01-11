package com.liuleven.designpattern.headfirst.decorate;

/**
 * @description: HouseBlend 咖啡
 * @date: 2019-01-10 15:48
 * @author: 十一
 */
public class HouseBlend extends Beverage {

    @Override
    public float cost() {
        return 45.0F;
    }

    public HouseBlend() {
        description = "house blend coffee";
    }
}
