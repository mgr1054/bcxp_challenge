package de.bcxp.challenge.service;

import de.bcxp.challenge.model.WeatherData;
import de.bcxp.challenge.model.CountryData;
import de.bcxp.challenge.util.DataReader;

import java.util.Comparator;
import java.util.List;

public class DataService {

    private final DataReader<WeatherData> weatherDataReader;
    private final DataReader<CountryData> countryDataReader;

    public DataService(DataReader<WeatherData> weatherDataReader, DataReader<CountryData> countryDataReader) {
        this.weatherDataReader = weatherDataReader;
        this.countryDataReader = countryDataReader;
    }

    public int findDayWithSmallestTemperatureSpread(String weatherDataFilePath) {
        List<WeatherData> weatherDataList = weatherDataReader.readData(weatherDataFilePath);
        return weatherDataList.stream()
                .min(Comparator.comparing(WeatherData::calculateTemperatureSpread))
                .map(WeatherData::getDay)
                .orElseThrow(() -> new IllegalStateException("No data found"));
    }

    public String findCountryWithHighestPopulationDensity(String countryDataFilePath) {
        List<CountryData> countryDataList = countryDataReader.readData(countryDataFilePath);
        return countryDataList.stream()
                .max(Comparator.comparing(CountryData::getPopulationDensity))
                .map(CountryData::getName)
                .orElseThrow(() -> new IllegalStateException("No data found"));
    }
}
