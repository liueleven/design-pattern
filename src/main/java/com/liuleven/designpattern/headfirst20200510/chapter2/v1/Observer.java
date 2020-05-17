package com.liuleven.designpattern.headfirst20200510.chapter2.v1;

/**
 * @description: 观察者
 * @date: 2020-05-17 10:07
 * @author: 十一
 */
public interface Observer {

    void update(float temp,float humidity, float pressure);
}
