package application;

import java.io.IOException;

import javafx.fxml.FXML;

public class MainScreenController {
	
	private Main main;

	@FXML
	private void goElectrical() throws IOException{
		main.showCustomerInfo();
	}

}
