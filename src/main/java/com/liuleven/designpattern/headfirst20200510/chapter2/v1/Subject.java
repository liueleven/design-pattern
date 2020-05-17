package com.liuleven.designpattern.headfirst20200510.chapter2.v1;

/**
 * @description: 主题产出内容
 * @date: 2020-05-17 10:05
 * @author: 十一
 */
public interface Subject {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();


}
