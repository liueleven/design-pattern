package com.liuleven.designpattern.headfirst20200510.chapter2.v1;

/**
 * @description: 一定要写注释啊
 * @date: 2020-05-17 10:14
 * @author: 十一
 */
public class CurrentConditionDisplay implements Observer,DisplayElement{


    private float temprature;

    private float humidity;

    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("CurrentConditionDisplay: " + temprature +" F and " + humidity +" %");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temprature = temp;
        this.humidity = humidity;
        display();
    }


}
