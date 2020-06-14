package com.liuleven.designpattern.headfirst20200510.chapter10.v2;

/**
 * @description: 一定要写注释啊
 * @date: 2020-06-14 15:16
 * @author: 十一
 */
public class SoldOutState implements State {

    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {

    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispese() {

    }
}
