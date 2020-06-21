package com.liuleven.designpattern.headfirst20200510.chapter12.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 一定要写注释啊
 * @date: 2020-06-21 09:45
 * @author: 十一
 */
public class Observable implements QuackObserveable {

    QuackObserveable duck;

    List<Observer> observers = new ArrayList();

    public Observable(QuackObserveable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(duck);
        }
    }
}
