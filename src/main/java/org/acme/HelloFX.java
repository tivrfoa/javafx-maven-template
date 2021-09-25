package org.acme;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class HelloFX extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		stage.setScene(new Scene(createContent()));
		stage.show();
	}

	private Parent createContent() {
		var pane = new Pane();
		pane.setPrefSize(1280, 720);

		return pane;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
