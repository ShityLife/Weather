package com.example.coolweather.gson;

/**
 * Created by chentianlong on 2017/12/30.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
