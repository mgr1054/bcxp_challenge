package de.bcxp.challenge.model;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvNumber;

public class CountryData {
    
    @CsvBindByName(column = "Name")
    private String name;

    // Use CsvNumber to handle numbers with non-standard formats, like the population of Croatia
    @CsvBindByName(column = "Population")
    @CsvNumber(value = "#.###", writeFormat = "")
    private long population;

    @CsvBindByName(column = "Area (km²)")
    private float area;

    public CountryData() {

    }
    
    public CountryData(String name, long population, float area) {
        this.name = name;
        this.population = population;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public long getPopulation() {
        return population;
    }

    public float getArea() {
        return area;
    }

    public double getPopulationDensity() {
        return population/area;
    }
    
}
