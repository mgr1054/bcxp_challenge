package de.bcxp.challenge.Analyzer;

import de.bcxp.challenge.DataSources.Country;

import java.util.List;

public class CountryAnalyzer {

    public Country getMostDenseCountry (List<Country> countries){

        Country mostDenseCountry = new Country(null, 0, 1);

        for (Country country : countries) {
            if (country.getDensity() > mostDenseCountry.getDensity()){
                mostDenseCountry = country;
            }
        }

        return mostDenseCountry;
        
    }
    
}
