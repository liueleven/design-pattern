package com.liuleven.designpattern.headfirst.observer;

import java.util.ArrayList;

/**
 * @description: 一定要写注释啊
 * @date: 2019-01-08 14:50
 * @author: 十一
 */
public class WeatherData implements Subject {

    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    /**
     * 添加观察者
     * @param o
     */
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    /**
     * 删除观察者
     * @param o
     */
    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i >= 0) {
            observers.remove(o);
        }
    }

    /**
     * 通知信息
     */
    @Override
    public void notifyObserver() {
        for(int i=0; i<observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }

    /**
     * 气象台更新数据，我们就更新
     */
    public void measurementsChanged() {
        notifyObserver();
    }

    /**
     * 更新数据
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature,float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
