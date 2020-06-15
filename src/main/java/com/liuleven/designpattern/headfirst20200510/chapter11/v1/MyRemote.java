package com.liuleven.designpattern.headfirst20200510.chapter11.v1;

import java.rmi.Remote;

/**
 * @description: 一定要写注释啊
 * @date: 2020-06-15 23:07
 * @author: 十一
 */
public interface MyRemote extends Remote {

    public String sayHello();

}
