package de.bcxp.challenge.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import de.bcxp.challenge.model.TestData;

public class CSVReaderTest {

    @Test
    public void testReadDataWitCorrectCSV() {
        
        CSVReader<TestData> csvReader = new CSVReader<>(TestData.class, ',');
        
        String filePath = "src/test/java/de/bcxp/challenge/resources/mockData.csv";
        
        List<TestData> result = csvReader.readData(filePath);

        assertEquals(3, result.size()); 
    }

}
