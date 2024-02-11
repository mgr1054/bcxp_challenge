package de.bcxp.challenge.DataSources;

public class WeatherDay {

    private int day;
    private int maxTemp;
    private int minTemp;
    
    public WeatherDay(int day, int maxTemp, int minTemp) {
        this.day = day;
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
    }

    public int getDay() {
        return day;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public int getMinTemp() {
        return minTemp;
    } 

    public int calculateTemperatureSpread(){
        return this.maxTemp - this.minTemp;
    }

    @Override
    public String toString() {
        String res;
        res = String.format("Day: %d, Maximum Temperature: %d, Minimum Temperature: %d", day, maxTemp, minTemp);
        return res;
    }
    
}
