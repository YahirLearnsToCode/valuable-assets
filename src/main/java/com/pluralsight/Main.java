package com.pluralsight;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Valuable> valuables = new ArrayList<>();
        valuables.add(new Car("Ferrari", 500000, 10));
        valuables.add(new Truck("F150", 50000, 400, 100));
        valuables.add(new CheckingAccount(3000));


        Portfolio portfolio = new Portfolio();
        portfolio.addValuable(new Car("Ferrari", 500000, 10));
        portfolio.addValuable(new Truck("F150", 50000, 400, 100));
        portfolio.addValuable(new CheckingAccount(3000));

        System.out.println(portfolio.getValue());

    }
}
