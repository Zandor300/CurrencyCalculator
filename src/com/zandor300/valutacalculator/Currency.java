package com.zandor300.valutacalculator;

import java.util.ArrayList;

/**
 * Created by Zandor on 3-2-2015.
 */
public class Currency {

	private static ArrayList<Currency> allCurrencies = new ArrayList<Currency>();

	private final String name;
	private final Character character;
	private final double value;

	public Currency(String name, char character, double value) {
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
			if (currency.getName().equalsIgnoreCase(name))
				return currency;
		return null;
	}

	public String getName() {
		return name;
	}

	public Character getCharacter() {
		return character;
	}

	public double getValue() {
		return value;
	}
}
