package com.liuleven.designpattern.headfirst20200510.chapter7.v1;

/**
 * @description: 一定要写注释啊
 * @date: 2020-06-06 18:22
 * @author: 十一
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("gobble");
    }

    @Override
    public void fly() {
        System.out.println("i'm fly...");
    }
}
