package com.zandor300.valutacalculator;

import com.zandor300.valutacalculator.windows.MainWindow;

/**
 * Created by Zandor on 3-2-2015.
 */
public class CurrencyCalculator {

	public static void main(String[] args) {
		new Currency("Euro", "€", 1.0);
		new Currency("American Dollar", "$", 1.1441);
		new Currency("British Pound", "£", 0.752994603);
		new Currency("Japanese Yen", "¥", 134.315567);

		//Set<java.util.Currency> currencies = java.util.Currency.getAvailableCurrencies();
		//for(java.util.Currency currency : currencies)
		//	new Currency(currency.getDisplayName(), currency.getSymbol(), 5);

		MainWindow.openWindow();
	}

}
