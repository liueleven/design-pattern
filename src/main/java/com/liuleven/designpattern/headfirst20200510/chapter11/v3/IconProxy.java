package com.liuleven.designpattern.headfirst20200510.chapter11.v3;

/**
 * @description: 一定要写注释啊
 * @date: 2020-06-15 23:31
 * @author: 十一
 */
public class IconProxy implements Icon {

    RealIcon realIcon;


    public IconProxy(RealIcon realIcon) {
        this.realIcon = realIcon;
    }

    @Override
    public void painIcon() {
        realIcon.painIcon();
    }
}
