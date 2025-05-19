```mermaid
classDiagram
direction TB
    class Portfolio {
	    - String name
	    - String owner
	    - ArrayList~Asset~ assets
	    ---
	    + Portfolio(String name, String owner)
	    + add(Asset asset)
	    + getValue() double
    }

    class FixedAsset {
	    - String name
	    - double marketValue
	    ---
	    + FixedAsset(String name, double value)
	    + getValue() double
    }

    class Jewelry {
	    - double karat
	    ---
	    + Jewelry(String name, double karat)
	    + getValue() double
    }

    class Gold {
	    - double weight
	    ---
	    + Gold(double weight)
	    + getValue() double
    }

    class House {
	    - int yearBuilt
	    - int squareFeet
	    - int bedrooms
	    ---
	    + House(int year, int squareFeet, int bedrooms)
	    + getValue() double
    }
    
    class BankAccount {
        - double balance
        - double debt
        - String name
		
        + BankAccount(double balance, double debt, String name)
        + withdraw(int amout) void
        + deposit(int amout) void
		+ getValue(): double
    }

    class CreditCard {
        - double dept
        - String accountNumber
        + CreditCard(double dept, String accountNumber)
        + charge(int amout) void
        + pay(int amout) void
		+ getValue(): double
    }

    class Valuable{
        + getValue(): double
    }
    

	<<abstract>> FixedAsset
    <<interface>> Valuable
    Portfolio o-- FixedAsset
    Valuable --|>  BankAccount 
    Valuable --|> CreditCard  
    FixedAsset --|> Jewelry
    FixedAsset --|> Gold
    FixedAsset --|> House
	```
	