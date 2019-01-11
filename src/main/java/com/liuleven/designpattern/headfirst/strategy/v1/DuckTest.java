package com.liuleven.designpattern.headfirst.strategy.v1;

/**
 * @description: 一定要写注释啊
 * @date: 2019-01-04 19:41
 * @author: 十一
 */
public class DuckTest {

    public static void main(String[] args) {
        System.out.println("-----wood duck--------");
        Duck woodDuck = new WoodDuck();
        // quack
        woodDuck.quack();
        // fly
        woodDuck.fly();
        // I'm is strategy green duck
        woodDuck.display();

        System.out.println("-------redhead duck------");

        Duck redheadDuck = new RedheadDuck();
        // quack
        redheadDuck.quack();
        // fly
        redheadDuck.fly();
        // I'm is strategy red duck
        redheadDuck.display();

        System.out.println("-------rubber duck------");
        Duck rubberDuck = new RubberDuck();
        // quack
        rubberDuck.quack();
        // fly
        rubberDuck.fly();
        // I'm is strategy yellow duck
        rubberDuck.display();
    }
}
