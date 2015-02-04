package com.zandor300.valutacalculator;

import com.zandor300.valutacalculator.windows.MainWindow;
import com.zandor300.valutacalculator.windows.ValueCalculator;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import sun.applet.Main;

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
