package com.liuleven.designpattern.headfirst20200510.chapter12.v1;

/**
 * @description: 一定要写注释啊
 * @date: 2020-06-21 08:01
 * @author: 十一
 */
public class MallardDuack implements Quackable {

    Observable observable;

    public MallardDuack() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("MallardDuack");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
