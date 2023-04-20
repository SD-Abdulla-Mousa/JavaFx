/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.io.IOException;

/**
 *
 * @author abdmf 
 */
public class ViewManager {
    
     public static LoginPage_1 loginPage;
    public static SystemPage_1 systemPage;
    
    
    private ViewManager(){   
    }
    
    public static void openLoginPage() throws IOException{
        if (loginPage == null) {
            loginPage = new LoginPage_1();
            loginPage.show();
        } else {
            loginPage.show();
        }
        
    }
    public static void closeLoginPage(){
        if(loginPage != null)
            loginPage.close();
    }
    
    public static void openSystemPage() throws IOException{
        if (systemPage == null) {
            systemPage = new SystemPage_1();
            systemPage.show();
        } else {
            systemPage.show();
        }
        
    }
    public static void closeSystemPage(){
        if(systemPage != null)
            systemPage.close();
    }
}
