package com.liuleven.designpattern.headfirst20200510.chapter12.v1;

/**
 * @description: 一定要写注释啊
 * @date: 2020-06-21 08:41
 * @author: 十一
 */
public abstract class AbstractDuckFactory {

    public abstract Quackable createMallardDuack();
    public abstract Quackable createRedHeadDuack();
    public abstract Quackable createGooseAdapter();
}
