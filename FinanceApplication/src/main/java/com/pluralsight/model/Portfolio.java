package com.pluralsight.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Portfolio {
    private String name;
    private String owner;
    private ArrayList<FixedAsset> assets;
    private List<Valuable> valuables;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.assets = new ArrayList<>();
        this.valuables = new ArrayList<>();
    }

    public void add(FixedAsset asset) {
        assets.add(asset);
    }

    public void add(Valuable valuable) {
        valuables.add(valuable);
    }

    public double getValue() {
        double totalValue = 0;
        for (FixedAsset asset : assets) {
            totalValue += asset.getValue();
        }
        for (Valuable valuable : valuables) {
            totalValue += valuable.getValue();
        }
        return totalValue;
    }
} 