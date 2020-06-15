package com.liuleven.designpattern.headfirst20200510.chapter11.v3;

/**
 * @description: 一定要写注释啊
 * @date: 2020-06-15 23:35
 * @author: 十一
 */
public class IconTest {
    public static void main(String[] args) {
        RealIcon realIcon = new RealIcon();
        IconProxy iconProxy = new IconProxy(realIcon);

        iconProxy.painIcon();
    }
}
