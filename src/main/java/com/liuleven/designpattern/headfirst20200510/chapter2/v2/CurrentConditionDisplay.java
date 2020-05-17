package com.liuleven.designpattern.headfirst20200510.chapter2.v2;

import com.liuleven.designpattern.headfirst20200510.chapter2.v1.DisplayElement;
import com.liuleven.designpattern.headfirst20200510.chapter2.v1.Subject;

import java.util.Observable;
import java.util.Observer;

/**
 * @description: 一定要写注释啊
 * @date: 2020-05-17 10:14
 * @author: 十一
 */
public class CurrentConditionDisplay implements Observer,DisplayElement {


    private float temprature;

    private float humidity;

    private Subject weatherData;

    private Observable observable;

    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }


    @Override
    public void update(Observable observable,Object arg) {
        if (observable instanceof WeatherData) {
            WeatherData observable1 = (WeatherData) observable;
            this.temprature = observable1.getTemperature();
            this.humidity = observable1.getHumidity();
            display();
        }
    }
    @Override
    public void display() {
        System.out.println("CurrentConditionDisplay: " + temprature +" F and " + humidity +" %");
    }


}
