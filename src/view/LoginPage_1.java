package view;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author abdmf
 */
public class LoginPage_1 extends Stage{
    
    private  Scene LoginPageScene;
   
    
   
    public  LoginPage_1() throws IOException{
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Fxml/loginpage.fxml"));
        Parent loginloader = loader.load();     
       LoginPageScene=new Scene(loginloader);
        
        
        
        this.setScene(LoginPageScene);
        this.setTitle("Login Page");
        this.show();
    }
    
    
    
       public void openLoginPage(){
        this.setScene(LoginPageScene);
    }

    
    
    
}
