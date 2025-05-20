package com.pluralsight.model;

import lombok.Data;

@Data
public class CreditCard implements Valuable {
    private double debt;
    private String accountNumber;

    public CreditCard(double debt, String accountNumber) {
        this.debt = debt;
        this.accountNumber = accountNumber;
    }

    public void charge(int amount) {
        debt += amount;
    }

    public void pay(int amount) {
        if (amount <= debt) {
            debt -= amount;
        }
    }

    @Override
    public double getValue() {
        return -debt; // Negative value since it's debt
    }

    @Override
    public int compareTo(Valuable o) {
        return 0;
    }
}