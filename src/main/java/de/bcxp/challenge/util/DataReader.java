package de.bcxp.challenge.util;

import java.util.List;

public interface DataReader<T> {
    List<T> readData(String filePath);
}
