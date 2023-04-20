/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author abdmf
 */
public class SystemPage_1 extends Stage{
     private Scene SystemPageScene;
    
    
    public SystemPage_1() throws IOException{
        
         FXMLLoader systempage = new FXMLLoader(getClass().getResource("Fxml/systempage.fxml"));
        Parent systemloader = systempage.load();     
       SystemPageScene =new Scene(systemloader);
        
        this.setScene(SystemPageScene);
        this.setTitle("System page");
        this.show();
    }
    
    public void openSystemPage(){
        this.setScene(SystemPageScene);
    }
    
    
}
