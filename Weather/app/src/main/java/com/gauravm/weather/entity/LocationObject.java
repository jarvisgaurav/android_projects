package com.gauravm.weather.entity;
public class LocationObject{
    int id; String locationCity; String weatherInformation;
public LocationObject(int id, String locationCity, String weatherInformation){
        this.id=id;
        this.locationCity=locationCity;
        this.weatherInformation=weatherInformation;
        }
public String getLocationCity() {
        return locationCity;
        }
public String getWeatherInformation() {
        return weatherInformation;
        }
public int getId() {
        return id;
        }
        }