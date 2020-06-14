package com.liuleven.designpattern.headfirst20200510.chapter10.v1;

/**
 * @description: 一定要写注释啊
 * @date: 2020-06-14 15:03
 * @author: 十一
 */
public class GumballMachineDriveTest {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);
        System.out.println(gumballMachine.toString());

        gumballMachine.insertQuarter();
        gumballMachine.turCrak();
        System.out.println(gumballMachine.toString());
    }
}
