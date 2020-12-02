package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

public class Main extends Application {
	
	private static Scene mainScene; 
	
	
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml"));
			
			ScrollPane scroollpane = loader.load();
			scroollpane.setFitToHeight(true);
			scroollpane.setFitToWidth(true);
			
			mainScene = new Scene(scroollpane);
			primaryStage.setScene(mainScene);
			primaryStage.setTitle(" GUARDA MUNICIPAL DE CAMPINAS ");
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Scene getMainScene() {
		return mainScene;
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
