package com.pluralsight.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Jewelry extends FixedAsset {
    private double karat;

    public Jewelry(String name, double karat) {
        super(name, 0);
        this.karat = karat;
    }

    @Override
    public double getValue() {
        // Value calculation based on karat (simplified example)
        return karat * 1000 + 0.01;
    }
} 