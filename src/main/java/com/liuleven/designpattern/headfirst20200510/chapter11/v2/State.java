package com.liuleven.designpattern.headfirst20200510.chapter11.v2;

import java.io.Serializable;

/**
 * @description: 一定要写注释啊
 * @date: 2020-06-15 23:15
 * @author: 十一
 */
public interface State extends Serializable {

    void insert();

    void eject();

    void turnCrank();

    void dispence();
}
