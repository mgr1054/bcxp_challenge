package de.bcxp.challenge.Analyzer;

import de.bcxp.challenge.DataSources.CountryData;

import java.util.List;

public class CountryAnalyzer {

    public CountryData getMostDenseCountry (List<CountryData> countries){

        CountryData mostDenseCountry = new CountryData(null, 0, 1);

        for (CountryData country : countries) {
            if (country.getPopulationDensity() > mostDenseCountry.getPopulationDensity()){
                mostDenseCountry = country;
            }
        }

        return mostDenseCountry;
        
    }
    
}
