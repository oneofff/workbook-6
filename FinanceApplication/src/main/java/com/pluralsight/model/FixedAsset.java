package com.pluralsight.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public abstract class FixedAsset implements Valuable{
    protected String name;
    protected double marketValue;

    public FixedAsset(String name, double value) {
        this.name = name;
        this.marketValue = value;
    }
    @Override
    public int compareTo(Valuable o) {
        return Double.compare(this.getValue(), o.getValue());
    }
} 