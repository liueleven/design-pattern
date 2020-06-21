package com.liuleven.designpattern.headfirst20200510.chapter12.v1;

/**
 * @description: 一定要写注释啊
 * @date: 2020-06-21 08:06
 * @author: 十一
 */
public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
//        duckSimulator.simulator1();
//        duckSimulator.simulator2();
//        duckSimulator.simulator3();

//        AbstractDuckFactory duckFactory = new CountingDuckFactory();
//        duckSimulator.simulator4(duckFactory);

        Flock flock = new Flock();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        flock.add(duckFactory.createMallardDuack());
        flock.add(duckFactory.createMallardDuack());
        flock.add(duckFactory.createGooseAdapter());

//        duckSimulator.quack(flock);
        Quacklogist quacklogist = new Quacklogist();
        flock.registerObserver(quacklogist);
        duckSimulator.quack(flock);
    }



    public void simulator1() {
        Quackable mallardDuack = new MallardDuack();
        Quackable redHeadDuack = new RedHeadDuack();
        quack(mallardDuack);
        quack(redHeadDuack);
    }

    public void simulator2() {
        Quackable mallardDuack = new MallardDuack();
        Quackable redHeadDuack = new RedHeadDuack();
        Goose goose = new Goose();
        Quackable gooseAdapter = new GooseAdapter(goose);
        quack(mallardDuack);
        quack(redHeadDuack);
        quack(gooseAdapter);
    }

    public void simulator3() {
        Quackable mallardDuack = new QuackCounter(new MallardDuack());
        Quackable redHeadDuack = new QuackCounter(new RedHeadDuack());
        Goose goose = new Goose();
        Quackable gooseAdapter = new QuackCounter(new GooseAdapter(goose));
        quack(mallardDuack);
        quack(redHeadDuack);
        quack(gooseAdapter);

        System.out.println("鸭子叫的次数："+QuackCounter.getNumberOfQuackables());

    }

    public void simulator4(AbstractDuckFactory duckFactory) {
        Quackable mallardDuack = duckFactory.createMallardDuack();
        Quackable redHeadDuack = duckFactory.createMallardDuack();
        Quackable gooseAdapter = duckFactory.createGooseAdapter();
        quack(mallardDuack);
        quack(redHeadDuack);
        quack(gooseAdapter);

        System.out.println("鸭子叫的次数："+QuackCounter.getNumberOfQuackables());
    }

    public void quack(Quackable quackable) {
        quackable.quack();
    }
}
