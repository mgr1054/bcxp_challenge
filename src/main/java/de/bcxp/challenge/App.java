package de.bcxp.challenge;

import de.bcxp.challenge.model.*;
import de.bcxp.challenge.service.DataService;
import de.bcxp.challenge.util.CSVReader;


import java.util.List;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 */
public final class App {

   

    /**
     * This is the main entry method of your program.
     * @param args The CLI arguments passed
     */
    public static void main(String... args) {

        final String basePath = "src/main/resources/de/bcxp/challenge/";
        final String weatherDataFilePath = basePath + "weather.csv";
        final String countryDataFilePath = basePath + "countries.csv";

        CSVReader<WeatherData> weatherDataReader = new CSVReader<>(WeatherData.class, ',');
        CSVReader<CountryData> countryDataReader = new CSVReader<>(CountryData.class, ';');
        DataService dataService = new DataService(weatherDataReader, countryDataReader);

        int dayWithSmallestTempSpread = dataService.findDayWithSmallestTemperatureSpread(weatherDataFilePath);
        System.out.println("Day with the smallest temperature spread: " + dayWithSmallestTempSpread);

        String countryWithHighestPopDensity = dataService.findCountryWithHighestPopulationDensity(countryDataFilePath);
        System.out.println("Country with the highest population density: " + countryWithHighestPopDensity);

    }
}
