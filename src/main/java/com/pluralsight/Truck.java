package com.pluralsight;

public class Truck extends Vehicle{
    private int cargoTons;

    public Truck(String makemodel, double initialCost, int initialMileage, int cargoTons) {
        super(makemodel, initialCost, initialMileage);
        this.cargoTons = cargoTons;
    }
}
