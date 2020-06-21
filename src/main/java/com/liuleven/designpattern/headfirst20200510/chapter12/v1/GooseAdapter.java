package com.liuleven.designpattern.headfirst20200510.chapter12.v1;

/**
 * @description: 适配器模式谁需要什么功能，谁就创建个新的适配器类
 * @date: 2020-06-21 08:13
 * @author: 十一
 */
public class GooseAdapter implements Quackable {

    private Goose goose;

    Observable observable;

    @Override
    public void quack() {
        goose.hook();
    }

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }



    public GooseAdapter() {
        observable = new Observable(this);
    }
}
