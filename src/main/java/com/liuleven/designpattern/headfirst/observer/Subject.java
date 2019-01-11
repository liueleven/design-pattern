package com.liuleven.designpattern.headfirst.observer;

/**
 * @description: 主题
 * @date: 2019-01-08 14:46
 * @author: 十一
 */
public interface Subject {

    /**
     * 注册
     * @param o
     */
    void registerObserver(Observer o);

    /**
     * 删除
     * @param o
     */
    void removeObserver(Observer o);

    /**
     * 通知
     */
    void notifyObserver();

}
