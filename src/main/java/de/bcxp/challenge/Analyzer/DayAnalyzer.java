package de.bcxp.challenge.Analyzer;

import de.bcxp.challenge.DataSources.Day;

import java.util.List;

public class DayAnalyzer {

    public Day getSmallestSpread (List<Day> data) {
        
        // create initial day with a spread of 1000, so the first day will take its place
        Day smallestDay = new Day(0, 1000, 0);
        
        for (Day day : data) {
            if (day.calculateTemperatureSpread() < smallestDay.calculateTemperatureSpread()) {
                smallestDay = day;
            }
        }

        return smallestDay;

    }
    
}
