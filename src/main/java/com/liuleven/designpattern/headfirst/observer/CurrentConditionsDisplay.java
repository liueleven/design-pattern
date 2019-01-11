package com.liuleven.designpattern.headfirst.observer;

/**
 * @description: 根据条件显示
 * @date: 2019-01-08 15:01
 * @author: 十一
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(String.format("Current conditions: %s F degress and %s  humidity",this.temperature,this.humidity));
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
