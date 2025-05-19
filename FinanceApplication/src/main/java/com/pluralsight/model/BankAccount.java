package com.pluralsight.model;

import lombok.Data;

@Data
public class BankAccount implements Valuable {
    private double balance;
    private double debt;
    private String name;

    public BankAccount(double balance, double debt, String name) {
        this.balance = balance;
        this.debt = debt;
        this.name = name;
    }

    public void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    public void deposit(int amount) {
        balance += amount;
    }

    @Override
    public double getValue() {
        return balance - debt;
    }
} 