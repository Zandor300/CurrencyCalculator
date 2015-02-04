package com.zandor300.valutacalculator;

import com.zandor300.valutacalculator.windows.MainWindow;

/**
 * Created by Zandor on 3-2-2015.
 */
public class CurrencyCalculator {

	public static void main(String[] args) {
		new Currency("Euro", '€', 1.0);
		new Currency("Dollar", '$', 0.87);
		new Currency("Pound", '&', 1.45);

		MainWindow.openWindow();
	}

}
