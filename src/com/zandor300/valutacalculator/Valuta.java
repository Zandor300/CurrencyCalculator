package com.zandor300.valutacalculator;

import java.util.ArrayList;

/**
 * Created by Zandor on 3-2-2015.
 */
public class Valuta {

    private static ArrayList<Valuta> allValutas = new ArrayList<Valuta>();

    private final double waarde;

    public Valuta(double waarde) {
        this.waarde = waarde;

        allValutas.add(this);
    }

    public double getWaarde() {
        return waarde;
    }
}
