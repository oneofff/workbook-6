package com.pluralsight.model;

import lombok.Data;

@Data
public class Gold extends FixedAsset {
    private double weight;

    public Gold(double weight) {
        super("Gold", 0);
        this.weight = weight;
    }

    @Override
    public double getValue() {
        // Value calculation based on weight (simplified example)
        return weight * 1800; // Assuming $1800 per ounce
    }
} 