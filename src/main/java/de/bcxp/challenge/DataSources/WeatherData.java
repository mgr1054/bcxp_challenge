package de.bcxp.challenge.DataSources;

public class WeatherData {

    private int day;
    private float maxTemp;
    private float minTemp;
    
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
