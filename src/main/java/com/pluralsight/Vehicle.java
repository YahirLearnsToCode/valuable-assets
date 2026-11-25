package com.pluralsight;

public abstract class Vehicle implements Valuable{
    private String makemodel;
    private double initialCost;
    private int initialMileage;
    private int currentMileage;
    private static final double DEPRECIATION_PER_MILE = 0.05;

    public Vehicle (String makemodel, double initialCost, int initialMileage) {
        this.makemodel = makemodel;
        this.initialCost = initialCost;
        this.initialMileage = initialMileage;
        this.currentMileage = initialMileage;
    }

    public void drive(int miles) {
        this.currentMileage += miles;
    }

    public double getValue() {
        double usedMiles = this.currentMileage - initialMileage;
        double value = this.initialCost - usedMiles * DEPRECIATION_PER_MILE;
        return value;
    }
}