package com.zandor300.valutacalculator.windows;

import com.zandor300.valutacalculator.Currency;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;

/**
 * Created by Zandor on 4-2-2015.
 */
public class ValueCalculator extends Application {

    public static void openWindow() {
        launch("");
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        stage.setTitle("Currency Calculator");
        stage.setScene(new Scene(root, 400, 200));

        final Text valueT = new Text("Value:");
        valueT.setLayoutX(10);
        valueT.setLayoutY(40);
        root.getChildren().add(valueT);

        final Text currencyT = new Text("Currency:");
        currencyT.setLayoutX(10);
        currencyT.setLayoutY(80);
        root.getChildren().add(currencyT);

        final TextField value1 = new TextField("5");
        value1.setLayoutX(60);
        value1.setLayoutY(30);
        root.getChildren().add(value1);

        ArrayList<String> currencies = new ArrayList<String>();
        for(Currency currency : Currency.getAllCurrencies())
            currencies.add(currency.getName());

        final ChoiceBox<String> value1waarde = new ChoiceBox<String>(FXCollections.observableArrayList(currencies));
        value1waarde.setLayoutX(60);
        value1waarde.setLayoutY(70);
        root.getChildren().add(value1waarde);

        final TextField value2 = new TextField("0");
        value2.setLayoutX(230);
        value2.setLayoutY(30);
        root.getChildren().add(value2);

        final ChoiceBox<String> value2waarde = new ChoiceBox<String>(FXCollections.observableArrayList(currencies));
        value2waarde.setLayoutX(230);
        value2waarde.setLayoutY(70);
        root.getChildren().add(value2waarde);

        final Button calculate = new Button("Calculate");
        calculate.setLayoutX(120);
        calculate.setLayoutY(140);
        calculate.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                calculate(Currency.getCurrency(value1waarde.getValue()), Currency.getCurrency(value2waarde.getValue()), value1, value2);
            }
        });
        calculate.setOnKeyTyped(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                calculate(Currency.getCurrency(value1waarde.getValue()), Currency.getCurrency(value2waarde.getValue()), value1, value2);
            }
        });
        root.getChildren().add(calculate);

        stage.show();
    }

    private static void calculate(Currency value1waarde, Currency value2waarde, TextField value1, TextField value2) {
        try {
            double value1w = value1waarde.getValue();
            double value2w = value2waarde.getValue();
            double value1c = Double.valueOf(value1.getText().replaceAll(" ", "").replaceAll(",", "."));
            double value2c = Double.valueOf(value2.getText().replaceAll(" ", "").replaceAll(",", "."));
            value2.setText(value1c / value1w * value2w + "");
        } catch (NumberFormatException e) {
            System.out.println("Thats not a number!");
        }
    }
}
