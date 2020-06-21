package com.liuleven.designpattern.headfirst20200510.chapter12.v1;

/**
 * @description: 一定要写注释啊
 * @date: 2020-06-21 08:42
 * @author: 十一
 */
public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuack() {
        return new MallardDuack();
    }

    @Override
    public Quackable createRedHeadDuack() {
        return new RedHeadDuack();
    }

    @Override
    public Quackable createGooseAdapter() {
        return new GooseAdapter(new Goose());
    }
}
