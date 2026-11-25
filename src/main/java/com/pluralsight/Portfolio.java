package com.pluralsight;

import java.util.ArrayList;

public class Portfolio implements Valuable {
    private ArrayList<Valuable> valuable;

    public Portfolio() {
        this.valuable = new ArrayList<>();
    }

    public void addValuable(Valuable valuable) {
        this.valuable.add(valuable);
    }

    public double getValue() {
        double value = 0;

        for (Valuable v : this.valuable) {
            value += v.getValue();
        }
        return value;
    }
}
