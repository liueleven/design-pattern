package com.liuleven.designpattern.headfirst20200510.chapter2.v1;

/**
 * @description: 一定要写注释啊
 * @date: 2020-05-17 12:28
 * @author: 十一
 */
public class WeatherStationTest {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        weatherData.setMeasurements(70.4f,90f,2f);
    }
}
