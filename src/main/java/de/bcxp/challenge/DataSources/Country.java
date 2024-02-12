package de.bcxp.challenge.DataSources;

public class Country {
    
    private String name;
    private int population;
    private int area;
    
    public Country(String name, int population, int area) {
        this.name = name;
        this.population = population;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public int getArea() {
        return area;
    }

    @Override
    public String toString() {
        String res;
        res = String.format("Country: %s, Population: %d, Area: %d", name, population, area);
        return res;
    }
    
}
