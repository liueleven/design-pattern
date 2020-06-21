package com.liuleven.designpattern.headfirst20200510.chapter12.v1;

/**
 * @description: 一定要写注释啊
 * @date: 2020-06-21 09:36
 * @author: 十一
 */
public interface QuackObserveable {

    void registerObserver(Observer observer);

    void notifyObservers();
}
