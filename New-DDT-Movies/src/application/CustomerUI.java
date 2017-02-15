package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import java.awt.Label;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
public class CustomerUI extends Application {

	
	
	
	
	
		@FXML
		public void startCustomerUI(ActionEvent event) {
			try {
			
				Parent root= FXMLLoader.load(getClass().getResource("\\appliation\\CustomersInfo.fxml"));
				Scene scene = new Scene(root, 400,400);
				//scene.getStylesheets().add(getClass().getResource("CustomersInfo.fxml").toExternalForm());
				Stage stage = new Stage();
				stage.setScene(scene);
				stage.show();
				
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		public static void main(String[] args) {
			launch(args);
		}
	
	
	
	Customer register = new Customer();
	@FXML
	private TextField fName;
	@FXML
	private TextField lName;
	@FXML
	private TextField pinn;
	@FXML
	private TextField birth;
	@FXML
	private TextField address;
	@FXML
	private TextField phone;
	@FXML
	private TextField credit;
	@FXML
	private TextField email;
	@FXML
	private Label txtpinn;

	public void storeINfo(ActionEvent event) {
		Customer temp = new Customer(fName.getText(), lName.getText(), pinn.getText(), birth.getText(),
				address.getText(), phone.getText(), credit.getText(), email.getText());

		System.out.println(temp.fn);
	}

	public void generatePin(ActionEvent event) {
		// incremently add in pinn numbers, System.out.print (zeros)
		int pinn = 0;
	if(pinn<10000){	
		
		if (pinn == 0) {
			pinn = 1;
			txtpinn.setText("000" + pinn);

		}
		else if (pinn < 1000) {
			pinn++;
			if (pinn < 100) {

				if (pinn < 10) {
					txtpinn.setText("000" + pinn);
				}
				else {
					txtpinn.setText("00" + pinn);
				}
			}else{
				txtpinn.setText("0"+pinn);
			}

		}
		}
		}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
	}
	}

