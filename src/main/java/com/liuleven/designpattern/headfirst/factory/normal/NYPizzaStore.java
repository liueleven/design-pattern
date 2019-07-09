package com.liuleven.designpattern.headfirst.factory.normal;



/**
 * @description: NY pizza have more taste
 * @date: 2019-01-10 20:09
 * @author: 十一
 */
public  class NYPizzaStore  extends PizzaStore{


    /**
     * 子类需要实现它的工厂方法
     * @param type
     * @return
     */
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equalsIgnoreCase(type)) {
            pizza = new NYStyleCheesePizza();
        }
        // todo more taste
        return pizza;
    }


}
