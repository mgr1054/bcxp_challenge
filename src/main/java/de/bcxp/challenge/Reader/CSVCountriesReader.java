package de.bcxp.challenge.Reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import de.bcxp.challenge.DataSources.*;

public class CSVCountriesReader {

    public List<Country> readCountriesData(String dataPath, String delimiter) {

        List<Country> countries = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(dataPath))) {
            
            String line = br.readLine();
            
            while ((line = br.readLine()) != null) {
                String[] attributes = line.split(delimiter);
                Country country = new Country(
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