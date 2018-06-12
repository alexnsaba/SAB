package application;
	
//import java.awt.Color;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
//import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
	Player player = new Player("file:///c:/superman.mp4");
	Scene scene = new Scene(player,720,480);
	primaryStage.setScene(scene);
	primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
