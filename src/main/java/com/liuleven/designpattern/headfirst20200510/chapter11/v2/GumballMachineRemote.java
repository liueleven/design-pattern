package com.liuleven.designpattern.headfirst20200510.chapter11.v2;

import java.rmi.Remote;

/**
 * @description: 一定要写注释啊
 * @date: 2020-06-15 23:14
 * @author: 十一
 */
public interface GumballMachineRemote extends Remote {

    public int getCount();

    String getLocation();

    State getState();
}
