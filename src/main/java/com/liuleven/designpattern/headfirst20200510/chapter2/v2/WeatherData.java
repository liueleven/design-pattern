package com.liuleven.designpattern.headfirst20200510.chapter2.v2;

import com.liuleven.designpattern.headfirst20200510.chapter2.v1.Observer;
import com.liuleven.designpattern.headfirst20200510.chapter2.v1.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * @description: 一定要写注释啊
 * @date: 2020-05-17 10:25
 * @author: 十一
 */
public class WeatherData extends Observable {

    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;


    public WeatherData() {
        observers = new ArrayList<>();
    }



    private void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature,float humidity,float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }




    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
