package de.bcxp.challenge.util;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class CSVReader<T> implements DataReader<T> {
    
    private Class<T> type;
    private char delimiter;

    public CSVReader(Class<T> type, char delimiter) {
        this.type = type;
        this.delimiter = delimiter;
    }

    @Override
    public List<T> readData(String filePath) {
        try (Reader reader = Files.newBufferedReader(Paths.get(filePath))) {
            CsvToBean<T> csvToBean = new CsvToBeanBuilder<T>(reader)
                .withType(type)
                .withSeparator(delimiter)
                .withIgnoreLeadingWhiteSpace(true)
                .build();

            return csvToBean.parse();
        } catch (Exception e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }
}
