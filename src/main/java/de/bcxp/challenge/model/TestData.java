package de.bcxp.challenge.model;

import com.opencsv.bean.CsvBindByName;

public class TestData {
    @CsvBindByName(column = "id")
    private int id;

    @CsvBindByName(column = "name")
    private String name;
    public TestData() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
