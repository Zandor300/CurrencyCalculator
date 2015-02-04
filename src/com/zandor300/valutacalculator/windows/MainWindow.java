package com.zandor300.valutacalculator.windows;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * Created by Zandor on 4-2-2015.
 */
public class MainWindow extends Application {

	public static void openWindow() {
		launch("");
	}

	@Override
	public void start(final Stage stage) throws Exception {
		System.out.println("Constructing main window...");
		Group root = new Group();
		stage.setTitle("Own Currency Calculator");
		stage.setScene(new Scene(root, 270, 45));

		final Button own = new Button("Own Value Calculator");
		own.setLayoutX(10);
		own.setLayoutY(10);
		own.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				OwnValueCalculator.openWindow();
				stage.close();
			}
		});
		root.getChildren().add(own);

		final Button original = new Button("Value Calculator");
		original.setLayoutX(150);
		original.setLayoutY(10);
		original.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				ValueCalculator.openWindow();
				stage.close();
			}
		});
		root.getChildren().add(original);

		stage.show();
		System.out.println("Opened main window.");
	}
}
