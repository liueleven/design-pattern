package com.liuleven.designpattern.headfirst.decorate.condiment;

import com.liuleven.designpattern.headfirst.decorate.Beverage;

/**
 * @description: 配料装饰器
 * @date: 2019-01-10 16:11
 * @author: 十一
 */
public abstract class CondimentDecorator extends Beverage {

    @Override
    public abstract String getDescription();
}
