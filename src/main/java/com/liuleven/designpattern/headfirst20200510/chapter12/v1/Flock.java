package com.liuleven.designpattern.headfirst20200510.chapter12.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 组合模式需要和叶子节点一样实现接口，这里的叶子节点是Quackable的实现类
 * @date: 2020-06-21 09:21
 * @author: 十一
 */
public class Flock implements Quackable {
    List<Quackable> quackers = new ArrayList();
    List<Observer> observers = new ArrayList();

    @Override
    public void quack() {
        for (Quackable quacker : quackers) {

            quacker.quack();
        }
    }

    public void add(Quackable quackable) {
        quackers.add(quackable);
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            for (Quackable quacker : quackers) {
                observer.update(quacker);
            }
        }

    }
}
