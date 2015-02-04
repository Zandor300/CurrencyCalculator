package com.zandor300.valutacalculator.windows;

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

/**
 * Created by Zandor on 4-2-2015.
 */
public class OwnValueCalculator {

    public static void openWindow() {
        Stage stage = new Stage();
        Group root = new Group();
        stage.setTitle("Own Currency Calculator");
        stage.setScene(new Scene(root, 400, 200));

        final Text valueT = new Text("Value:");
        valueT.setLayoutX(10);
        valueT.setLayoutY(40);
        root.getChildren().add(valueT);

        final Text waardeT = new Text("Waarde:");
        waardeT.setLayoutX(10);
        waardeT.setLayoutY(80);
        root.getChildren().add(waardeT);

        final TextField value1 = new TextField("5");
        value1.setLayoutX(60);
        value1.setLayoutY(30);
        root.getChildren().add(value1);

        final TextField value1waarde = new TextField("1");
        value1waarde.setLayoutX(60);
        value1waarde.setLayoutY(70);
        root.getChildren().add(value1waarde);

        final TextField value2 = new TextField("0");
        value2.setLayoutX(230);
        value2.setLayoutY(30);
        root.getChildren().add(value2);

        final TextField value2waarde = new TextField("1.5");
        value2waarde.setLayoutX(230);
        value2waarde.setLayoutY(70);
        root.getChildren().add(value2waarde);

        final Button calculate = new Button("Calculate");
        calculate.setLayoutX(120);
        calculate.setLayoutY(140);
        calculate.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                calculate(value1waarde, value2waarde, value1, value2);
            }
        });
        calculate.setOnKeyTyped(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                calculate(value1waarde, value2waarde, value1, value2);
            }
        });
        root.getChildren().add(calculate);

        stage.show();
    }

    private static void calculate(TextField value1waarde, TextField value2waarde, TextField value1, TextField value2) {
        try {
            double value1w = Double.valueOf(value1waarde.getText());
            double value2w = Double.valueOf(value2waarde.getText());
            double value1c = Double.valueOf(value1.getText());
            double value2c = Double.valueOf(value2.getText());
            value2.setText(value1c / value1w * value2w + "");
        } catch (NumberFormatException e) {
            System.out.println("Thats not a number!");
        }
    }
}
