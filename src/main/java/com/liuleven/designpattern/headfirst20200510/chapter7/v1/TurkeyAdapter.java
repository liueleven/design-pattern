package com.liuleven.designpattern.headfirst20200510.chapter7.v1;

/**
 * @description: 一定要写注释啊
 * @date: 2020-06-06 18:24
 * @author: 十一
 */
public class TurkeyAdapter implements Duck {

    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        // 火鸡飞的距离短，要飞5次才可以追的上鸭子
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
