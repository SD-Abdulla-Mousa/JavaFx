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
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import view.ViewManager;

/**
 * FXML Controller class
 *
 * @author abdmf
 */
public class LoginPageController implements Initializable {

    @FXML
    private TextField usernamefield;
    private TextField passwordfield;
    @FXML
    private Button button_id;
    @FXML
    private Label hiddenlabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void usernameTf(ActionEvent event) {
    }


    @FXML
    private void LoginButton(ActionEvent event) throws IOException {
        if(usernamefield.getText().equalsIgnoreCase("user")
                && passwordfield.getText().equalsIgnoreCase("user123")
                ){
            
            ViewManager.closeLoginPage();
            ViewManager.openSystemPage();
            
        }else 
            hiddenlabel.setText("Error in  password or username ");
        hiddenlabel.setAlignment(Pos.CENTER);
    }
    
}
