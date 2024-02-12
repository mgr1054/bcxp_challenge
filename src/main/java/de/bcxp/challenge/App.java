package de.bcxp.challenge;

import de.bcxp.challenge.Reader.CSVDayReader;
import de.bcxp.challenge.Analyzer.DayAnalyzer;
import de.bcxp.challenge.DataSources.*;

import java.util.List;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 */
public final class App {

    private static String basePath = "src/main/resources/de/bcxp/challenge/";
    private static String countriesPath = basePath + "countries.csv";
    private static String weatherPath = basePath + "weather.csv";

    /**
     * This is the main entry method of your program.
     * @param args The CLI arguments passed
     */
    public static void main(String... args) {

        CSVDayReader reader = new CSVDayReader();
        List<Day> data = reader.readDaysData(weatherPath, ",");
        DayAnalyzer analyzer = new DayAnalyzer();
        Day dayWithSmallestTempSpread = analyzer.getSmallestSpread(data);

        System.out.printf("Day with smallest temperature spread: %s%n", Integer.toString(dayWithSmallestTempSpread.getDay()));

        String countryWithHighestPopulationDensity = "Some country"; // Your population density analysis function call …
        System.out.printf("Country with highest population density: %s%n", countryWithHighestPopulationDensity);
    }
}
