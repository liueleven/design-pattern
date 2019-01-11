package com.liuleven.designpattern.headfirst.decorate;

/**
 * @description: 一定要写注释啊
 * @date: 2019-01-10 15:46
 * @author: 十一
 */
public abstract class Beverage {

    public String description = "unknown beverage ";

    public String getDescription() {
        return description;
    }

    public abstract float cost();
}
