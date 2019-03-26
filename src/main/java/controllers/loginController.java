package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class loginController {
	@FXML
	private TextField username;
	@FXML
	private TextField password;

	// Event Listener on Button.onAction
	@FXML
	public void LoginAdmin(ActionEvent event) {
		if (this.username.getText().equals("admin") && this.password.getText().equals("admin")) {

			try {
				Parent root = FXMLLoader.load(getClass().getResource("../views/dashboard.fxml"));
				Stage stage = new Stage();

				stage.setTitle("Dashboard Gestion Assurances");
				stage.setScene(new Scene(root));
				stage.show();
				( ((Node) event.getSource())).getScene().getWindow().hide();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
