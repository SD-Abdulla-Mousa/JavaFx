package controller;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import view.SystemPage_1;
import view.LoginPage_1;
import java.io.IOException;



/**
 *
 * @author abdmf
 */
public class ViewManager_1 {
    
public static LoginPage_1 login;
public static SystemPage_1 syspage;
//public static Login log;
//public static loginTest test;

private ViewManager_1(){}


   public static void openLoginPage() throws IOException, Exception{
        if (login == null) {
            login = new LoginPage_1();
            login.show();
        } else {
            login.show();
        }
        
    }
    public static void closeLoginPage(){
        if(login != null)
            login.close();
    }

      public static void opensystempage() throws IOException{
        if (syspage == null) {
            syspage = new SystemPage_1();
            syspage.show();
        } else {
            syspage.show();
        }
        
    }
    public static void closesystempage(){
        if(syspage != null)
            syspage.close();
    }
    
}
