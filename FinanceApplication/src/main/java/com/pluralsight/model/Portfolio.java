package com.pluralsight.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Portfolio {
    private String name;
    private String owner;
    private List<Valuable> valuables;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;

        this.valuables = new ArrayList<>();
    }


    public void add(Valuable valuable) {
        valuables.add(valuable);
    }

    public double getValue() {
        double totalValue = 0;
        for (Valuable valuable : valuables) {
            totalValue += valuable.getValue();
        }
        return totalValue;
    }

    public Valuable getMostValuable() {
        return valuables.stream()
                .max(Valuable::compareTo)
                .orElse(null);
    }

    public Valuable getLeastValuable() {
        return valuables.stream()
                .min(Valuable::compareTo)
                .orElse(null);
    }
} 