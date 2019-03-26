package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import java.io.IOException;

import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;

import javafx.scene.layout.AnchorPane;

public class dashboardController {
	@FXML
	private JFXButton acceuil;
	@FXML
	private JFXButton gestionUser;
	@FXML
	private JFXButton gestionContracts;
	@FXML
	private JFXButton gestionPromotions;
	@FXML
	private AnchorPane mainContentPane;
	
	private AnchorPane contratPane;
	private AnchorPane promotionsPane;
	private AnchorPane userPane;

	// Event Listener on JFXButton[#acceuil].onAction
	@FXML
	public void acceuilClicked(ActionEvent event) {
		
		}
	// Event Listener on JFXButton[#gestionUser].onAction
	@FXML
	public void gestionUserClicked(ActionEvent event) throws IOException {
		this.userPane = FXMLLoader.load(getClass().getResource("../views/GestionUser.fxml"));
		this.mainContentPane.getChildren().clear();
		this.mainContentPane.getChildren().add(this.userPane);
	}
	// Event Listener on JFXButton[#gestionContracts].onAction
	@FXML
	public void gestionContractsClicked(ActionEvent event) throws IOException {
		this.contratPane = FXMLLoader.load(getClass().getResource("../views/GestionContrat.fxml"));
		this.mainContentPane.getChildren().clear();
		this.mainContentPane.getChildren().add(this.contratPane);
	}
	// Event Listener on JFXButton[#gestionPromotions].onAction
	@FXML
	public void gestionPromotionsClicked(ActionEvent event) throws IOException {
		this.promotionsPane = FXMLLoader.load(getClass().getResource("../views/GestionPromotions.fxml"));
		this.mainContentPane.getChildren().clear();
		this.mainContentPane.getChildren().add(this.promotionsPane);
	}
}
