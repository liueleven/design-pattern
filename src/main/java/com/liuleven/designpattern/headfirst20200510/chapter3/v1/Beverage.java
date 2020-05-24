package com.liuleven.designpattern.headfirst20200510.chapter3.v1;

/**
 * @description: 一定要写注释啊
 * @date: 2020-05-17 16:48
 * @author: 十一
 */
public abstract class Beverage {

    private String desc;

    public String getDesc() {
        return desc;
    }

    public abstract void cost();
}
