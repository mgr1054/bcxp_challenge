package de.bcxp.challenge.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import de.bcxp.challenge.util.*;
import de.bcxp.challenge.model.CountryData;
import de.bcxp.challenge.model.WeatherData;


public class DataServiceTest {

    private DataService dataService;

    @BeforeEach
    public void setUp() {
        CSVReader<WeatherData> weatherDataReader = new CSVReader<>(WeatherData.class, ',');
        CSVReader<CountryData> countryDataReader = new CSVReader<>(CountryData.class, ';');
        dataService = new DataService(weatherDataReader, countryDataReader);
    }

    @Test
    public void testFindDayWithSmallestTemperatureSpreadSuccess() {

        String filePath = "src/test/java/de/bcxp/challenge/resources/mockDataWeather.csv";
        int day = dataService.findDayWithSmallestTemperatureSpread(filePath);

        assertEquals(1, day, "The day with the smallest temperature spread should be day 1.");
    }

    @Test
    public void testFindMostDenseCountrySuccess() {
        
        String filePath = "src/test/java/de/bcxp/challenge/resources/mockDataCountries.csv";
        String countryName = dataService.findCountryWithHighestPopulationDensity(filePath);

        assertEquals("CountryB", countryName, "The country with the highest population density should be CountryA.");
        
    }

    @Test
    public void testFindDayWithSmallestTemperatureSpreadFail() {
        String weatherDataFilePath = "src/test/java/de/bcxp/challenge/resources/mockDataWeatherBad.csv";

        assertThrows(IllegalStateException.class, () -> {
            dataService.findDayWithSmallestTemperatureSpread(weatherDataFilePath);
        }, "An IllegalStateException should be thrown if no weather data is found.");
    }


    @Test
    public void testFindMostDenseCountryFail() {

        String countryDataFilePath = "src/test/java/de/bcxp/challenge/resources/mockDataCountriesBad.csv";


        assertThrows(IllegalStateException.class, () -> {
            dataService.findCountryWithHighestPopulationDensity(countryDataFilePath);
        }, "An IllegalStateException should be thrown if no country data is found.");
    }

}
