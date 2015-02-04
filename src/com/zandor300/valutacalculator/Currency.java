package com.zandor300.valutacalculator;

import java.util.ArrayList;

/**
 * Created by Zandor on 3-2-2015.
 */
public class Currency {

	private static ArrayList<Currency> allCurrencies = new ArrayList<Currency>();

	private final String name;
	private final String character;
	private final double value;

	public Currency(String name, String character, double value) {
		this.name = name;
		this.character = character;
		this.value = value;

		allCurrencies.add(this);
	}

	public static ArrayList<Currency> getAllCurrencies() {
		return allCurrencies;
	}

	public static Currency getCurrency(String name) {
		for (Currency currency : allCurrencies)
			if (name.toLowerCase().contains(currency.getName().toLowerCase()))
				return currency;
		return null;
	}

	public String getName() {
		return name;
	}

	public String getCharacter() {
		return character;
	}

	public double getValue() {
		return value;
	}
}
