/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javafxApplication;

import javafx.application.Application;
import javafx.stage.Stage;
import view.ViewManager;

/**
 *
 * @author abdmf
 */
public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        ViewManager.openLoginPage();

    }


    public static void main(String[] args) {
        launch(args);
    }

}
