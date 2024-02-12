package de.bcxp.challenge.Analyzer;

import de.bcxp.challenge.DataSources.WeatherData;

import java.util.List;

public class DayAnalyzer {

    public WeatherData getSmallestSpread (List<WeatherData> data) {
        
        // create initial day with a spread of max_int, so the first day will guaranteed take its place
        WeatherData smallestDay = new WeatherData(0, Integer.MAX_VALUE, 0);
        
        for (WeatherData day : data) {
            if (day.calculateTemperatureSpread() < smallestDay.calculateTemperatureSpread()) {
                smallestDay = day;
            }
        }
        return smallestDay;

    }
    
}
