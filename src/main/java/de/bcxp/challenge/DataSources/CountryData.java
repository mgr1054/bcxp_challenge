package de.bcxp.challenge.DataSources;

public class CountryData {
    
    private String name;
    private long population;
    private float area;
    
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
