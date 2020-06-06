package com.liuleven.designpattern.headfirst20200510.chapter6.v1;

/**
 * @description: 一定要写注释啊
 * @date: 2020-06-04 23:41
 * @author: 十一
 */
public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl() {
    }

    public void setSolt(Command slot) {
        this.slot = slot;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
