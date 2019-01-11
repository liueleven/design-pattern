package com.liuleven.designpattern.headfirst.observer;

/**
 * @description: 测试
 * @date: 2019-01-08 15:10
 * @author: 十一
 */
public class WeatherStationTest {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay display = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80,65,30.4f);
    }
}
