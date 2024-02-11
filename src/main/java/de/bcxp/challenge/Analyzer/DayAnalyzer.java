package de.bcxp.challenge.Analyzer;

import de.bcxp.challenge.DataSources.WeatherDay;

import java.util.List;

public class DayAnalyzer {

    public WeatherDay getSmallestSpread (List<WeatherDay> data) {
        
        // create initial day with a spread of max_int, so the first day will guaranteed take its place
        WeatherDay smallestDay = new WeatherDay(0, Integer.MAX_VALUE, 0);
        
        for (WeatherDay day : data) {
            if (day.calculateTemperatureSpread() < smallestDay.calculateTemperatureSpread()) {
                smallestDay = day;
            }
        }
        return smallestDay;

    }
    
}
