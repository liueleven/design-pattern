package com.liuleven.designpattern.headfirst.observer;

/**
 * @description: 一定要写注释啊
 * @date: 2019-01-08 14:47
 * @author: 十一
 */
public interface Observer {

    /**
     * 更新
     * @param temp
     * @param humidity
     * @param pressure
     */
    void update(float temp,float humidity,float pressure);
}
