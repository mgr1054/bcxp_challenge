package de.bcxp.challenge.model;

import com.opencsv.bean.CsvBindByName;

public class WeatherData {

    @CsvBindByName(column = "Day")
    private int day;
    
    @CsvBindByName(column = "MxT")
    private float maxTemp;
    
    @CsvBindByName(column = "MnT")
    private float minTemp;

    public WeatherData() {
    }
    
    public WeatherData(int day, float maxTemp, float minTemp) {
        this.day = day;
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
    }

    public int getDay() {
        return day;
    }

    public float getMaxTemp() {
        return maxTemp;
    }

    public float getMinTemp() {
        return minTemp;
    } 

    public float calculateTemperatureSpread(){
        return this.maxTemp - this.minTemp;
    }

}
