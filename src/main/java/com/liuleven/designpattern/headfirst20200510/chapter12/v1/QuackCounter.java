package com.liuleven.designpattern.headfirst20200510.chapter12.v1;

/**
 * @description: 鸭子新的行为，给鸭子叫行为添加了计数的功能
 * @date: 2020-06-21 08:24
 * @author: 十一
 */
public class QuackCounter implements Quackable {

    Quackable quackable;
    static int numberOfQuackables;

    @Override
    public void quack() {
        quackable.quack();
        numberOfQuackables++;
    }

    public QuackCounter(Quackable quackable) {
        this.quackable = quackable;
    }

    public static int getNumberOfQuackables() {
        return numberOfQuackables;
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
