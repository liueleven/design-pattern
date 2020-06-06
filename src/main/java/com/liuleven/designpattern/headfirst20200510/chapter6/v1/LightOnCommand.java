package com.liuleven.designpattern.headfirst20200510.chapter6.v1;

/**
 * @description: 一定要写注释啊
 * @date: 2020-06-04 23:38
 * @author: 十一
 */
public class LightOnCommand implements Command {

    private Light light;

    @Override
    public void execute() {
        light.on();
    }

    public LightOnCommand(Light light) {
        this.light = light;
    }
}
