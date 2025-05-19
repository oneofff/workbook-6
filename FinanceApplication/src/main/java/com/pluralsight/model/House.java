package com.pluralsight.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class House extends FixedAsset {
    private int yearBuilt;
    private int squareFeet;
    private int bedrooms;

    public House(int year, int squareFeet, int bedrooms) {
        super("House", 0);
        this.yearBuilt = year;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    @Override
    public double getValue() {
        // Value calculation based on square footage and bedrooms (simplified example)
        double baseValue = squareFeet * 200; // $200 per square foot
        double bedroomBonus = bedrooms * 50000; // $50,000 per bedroom
        return baseValue + bedroomBonus;
    }
} 