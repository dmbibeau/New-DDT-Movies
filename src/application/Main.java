package application;

import javafx.fxml.FXMLLoader;

import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root= FXMLLoader.load(getClass().getResource("MainScreen.fxml"));
			FXMLLoader loader = new FXMLLoader();
			Scene scene = new Scene(root, 400,400);
			scene.getStylesheets().add(getClass().getResource("MainScreen.fxml").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//Dave Added this 2/23/2017
	public static void showCustomerInfo() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("submenuUIs/CustomersInfo.fxml"));
		BorderPane customesInfo = loader.load();
//		mainLayout.setCenter(customersInfo);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
