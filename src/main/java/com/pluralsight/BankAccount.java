package com.pluralsight;

public abstract class BankAccount implements Valuable {
    private double balance;

    public BankAccount(double amount) {
        this.balance = amount;
    }
    public void deposit(double amount) {
        this.balance += amount;
    }

    public double withdraw (double amount) {
        this.balance -= amount;
        return this.balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getValue() {
        return this.balance;
    }
}
