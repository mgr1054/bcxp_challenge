package de.bcxp.challenge;

import de.bcxp.challenge.Analyzer.CountryAnalyzer;
import de.bcxp.challenge.Analyzer.DayAnalyzer;
import de.bcxp.challenge.DataSources.*;
import de.bcxp.challenge.util.CSVCountriesReader;
import de.bcxp.challenge.util.CSVWeatherReader;

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

        CSVWeatherReader weatherReader = new CSVWeatherReader();
        List<WeatherData> weatherData = weatherReader.readDaysData(weatherPath, ",");
        DayAnalyzer dayAnalyzer = new DayAnalyzer();
        WeatherData dayWithSmallestTempSpread = dayAnalyzer.getSmallestSpread(weatherData);

        System.out.printf("Day with smallest temperature spread: %s%n", dayWithSmallestTempSpread.getDay());

        CSVCountriesReader countriesReader = new CSVCountriesReader();
        List<CountryData> countryData = countriesReader.readCountriesData(countriesPath, ";");
        CountryAnalyzer countryAnalyzer = new CountryAnalyzer();
        CountryData countryWithHighestPopulationDensity = countryAnalyzer.getMostDenseCountry(countryData);

        System.out.printf("Country with highest population density: %s%n", countryWithHighestPopulationDensity.getName());
    }
}
