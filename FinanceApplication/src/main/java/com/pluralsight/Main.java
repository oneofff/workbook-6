package com.pluralsight;

import com.pluralsight.model.*;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(123,12500,"Pam");
        Valuable account2 = new BankAccount(456, 1500, "Gary");

        account1.deposit(100);
        Portfolio portfolio = new Portfolio("My Portfolio", "Pam");
        portfolio.add(account1);
        portfolio.add(account2);
        portfolio.add(new House(2000, 1213, 3));
        portfolio.add(new Gold(1000));
        portfolio.add(new CreditCard(5000, "1234-5678-9012-3456"));
        portfolio.add(new Jewelry("Gold Ring", 2000));
        System.out.println();
        DecimalFormat formatter = new DecimalFormat("#,###.00");
        String formattedNumber = formatter.format(portfolio.getValue());
        System.out.printf("Total value of portfolio: $ %s%n", formattedNumber );
        System.out.printf("Most valuable item: %s%n", portfolio.getMostValuable());
        System.out.printf("Least valuable item: %s%n", portfolio.getLeastValuable());
    }
}