package com.car;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LoginController implements Initializable{

	@FXML
	private AnchorPane loginAnchorPane;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
	}
	
	@FXML
	private void handleSignup() {
		
		Stage primaryStage = new Stage();
		
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Signup.fxml"));
			Scene scene = new Scene(root,530,480);
			//scene.getStylesheets().add(getClass().getResource("/pmart/application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.initOwner(loginAnchorPane.getScene().getWindow());
			Image icon = new Image(getClass().getResourceAsStream("/titleicon/car-filled.png"));
			primaryStage.getIcons().add(icon);
			//primaryStage.initModality(Modality.WINDOW_MODAL);
			primaryStage.setResizable(false);
			//primaryStage.setMinHeight(400);
			//primaryStage.setMinWidth(850);
			primaryStage.setTitle("Car Review - Sign Up");
			//primaryStage.initStyle(StageStyle.DECORATED);
			primaryStage.show();
		
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Couldn't load the User Signup Window");
		}
		
		
		
	}


	
	
}
