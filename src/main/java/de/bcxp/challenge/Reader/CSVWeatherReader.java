package de.bcxp.challenge.Reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import de.bcxp.challenge.DataSources.*;

public class CSVWeatherReader {

    public List<WeatherDay> readDaysData(String dataPath, String delimiter) {

        List<WeatherDay> days = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(dataPath))) {
            
            String line = br.readLine();
            
            while ((line = br.readLine()) != null) {
                String[] attributes = line.split(delimiter);
                WeatherDay day = new WeatherDay(
                    Integer.parseInt(attributes[0]), 
                    Integer.parseInt(attributes[1]),
                    Integer.parseInt(attributes[2])
                );
                
                days.add(day);
            }
        } catch (IOException e) {
            System.out.println("IOException occurred!" + e.getStackTrace().toString());

        }

        return days;

    }

}