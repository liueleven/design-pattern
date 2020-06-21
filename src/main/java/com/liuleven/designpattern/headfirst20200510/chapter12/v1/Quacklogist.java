package com.liuleven.designpattern.headfirst20200510.chapter12.v1;

/**
 * @description: 一定要写注释啊
 * @date: 2020-06-21 09:53
 * @author: 十一
 */
public class Quacklogist implements Observer {
    @Override
    public void update(QuackObserveable duck) {
        System.out.println("发现一只鸭子在乱叫，编号：" + duck);
    }
}
