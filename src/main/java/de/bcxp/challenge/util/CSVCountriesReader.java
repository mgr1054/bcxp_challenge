package de.bcxp.challenge.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import de.bcxp.challenge.DataSources.*;

public class CSVCountriesReader {

    public List<CountryData> readCountriesData(String dataPath, String delimiter) {

        List<CountryData> countries = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(dataPath))) {
            
            String line = br.readLine();
            
            while ((line = br.readLine()) != null) {
                String[] attributes = line.split(delimiter);
                CountryData country = new CountryData(
                    attributes[0], 
                    normalizePopulationData(attributes[3]),
                    Double.parseDouble(attributes[4])
                );
                
                countries.add(country);
            }
        } catch (IOException e) {
            System.out.println("IOException occurred!" + e.getStackTrace().toString());

        }

        return countries;

    }

    public Double normalizePopulationData(String datapoint) {
        return Double.parseDouble(datapoint.trim().replaceAll("\\.", "").replace(",", "."));
    }

}