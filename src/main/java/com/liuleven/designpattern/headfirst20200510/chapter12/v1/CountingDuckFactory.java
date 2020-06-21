package com.liuleven.designpattern.headfirst20200510.chapter12.v1;

/**
 * @description: 一定要写注释啊
 * @date: 2020-06-21 08:43
 * @author: 十一
 */
public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuack() {
        return new QuackCounter(new MallardDuack());
    }

    @Override
    public Quackable createRedHeadDuack() {
        return new QuackCounter(new RedHeadDuack());
    }

    @Override
    public Quackable createGooseAdapter() {
        return new QuackCounter(new GooseAdapter(new Goose()));
    }
}
