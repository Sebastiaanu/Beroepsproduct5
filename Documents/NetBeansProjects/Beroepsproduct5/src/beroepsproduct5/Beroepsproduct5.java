/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beroepsproduct5;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author SebastiaanU
 */
public class Beroepsproduct5 extends Application{
 public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
       Pane mainPane = new Pane();
       BpMenu menuBar = new BpMenu(mainPane);
       VBox root = new VBox(menuBar,mainPane);
       Scene scene = new Scene (root,1000,700);
       
      
       
       primaryStage.setScene(scene);
       primaryStage.setTitle("Overzicht");
       primaryStage.show();
    }
    
    
    
}
