package com.logical.logicalservice.dto;

public class WeightedDTO {
    private String input;
    private Integer[] queries;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public Integer[] getQueries() {
        return queries;
    }

    public void setQueries(Integer[] queries) {
        this.queries = queries;
    }
}
