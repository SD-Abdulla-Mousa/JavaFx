/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import view.ViewManager;

/**
 * FXML Controller class
 *
 * @author abdmf
 */
public class SystemPage_Controller implements Initializable {

    @FXML
    private Button logoutbtn;
    @FXML
    private TextField usdfield;
    @FXML
    private TextField nisfeild;
    @FXML
    private Button convertbtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void LogoutButton(ActionEvent event) throws IOException {
        ViewManager.openLoginPage();
        ViewManager.closeSystemPage();
    }

    @FXML
    private void usdf(ActionEvent event) {
    }

    @FXML
    private void nisTextfield(ActionEvent event) {
    }

    @FXML
    private void convertButton(ActionEvent event) {
    }
    
}
