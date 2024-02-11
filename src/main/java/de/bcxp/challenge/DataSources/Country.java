package de.bcxp.challenge.DataSources;

public class Country {
    
    private String name;
    private double population;
    private double area;
    
    public Country(String name, double population, double area) {
        this.name = name;
        this.population = population;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public double getPopulation() {
        return population;
    }

    public double getArea() {
        return area;
    }

    public double getDensity() {
        return population/area;
    }

    @Override
    public String toString() {
        String res;
        res = String.format("Country: %s, Population: %d, Area: %d", name, population, area);
        return res;
    }
    
}
