package com.liuleven.designpattern.headfirst20200510.chapter1.v4;

import com.liuleven.designpattern.headfirst.strategy.v2.FlyBehavior;

/**
 * @description: 一定要写注释啊
 * @date: 2020-05-10 11:53
 * @author: 十一
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("use wings fly ...");
    }
}
