package com.liuleven.designpattern.headfirst20200510.chapter7.v1;

/**
 * @description: 一定要写注释啊
 * @date: 2020-06-06 18:59
 * @author: 十一
 */
public class DuckTestDrive {

    /**
     * 有一只火鸡，一只鸭子，现在鸡想变鸭子，可以使用适配器，来让鸡变成鸭
     * @param args
     */
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();

        WildTurkey wildTurkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

//        System.out.println("the Turkey says...");
//
//        wildTurkey.gobble();
//        wildTurkey.fly();
//
//        System.out.println("the Duck says...");
//        testDuck(mallardDuck);

        System.out.println("the TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.fly();
        duck.quack();
    }
}
