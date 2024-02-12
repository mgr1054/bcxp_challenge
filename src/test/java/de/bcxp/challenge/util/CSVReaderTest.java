package de.bcxp.challenge.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import de.bcxp.challenge.model.TestData;

public class CSVReaderTest {

    @Test
    public void testReadDataWitCorrectCSV() {
        // Assuming TestData is the class type T we're working with
        CSVReader<TestData> csvReader = new CSVReader<>(TestData.class, ',');
        
        // Mock CSV content, assuming a simple TestData class with a single String field
        String filePath = "src/test/java/de/bcxp/challenge/resources/mockData.csv";
        
        // Execute
        List<TestData> result = csvReader.readData(filePath);
        
        // Assert
        assertEquals(3, result.size()); 
    }

}
