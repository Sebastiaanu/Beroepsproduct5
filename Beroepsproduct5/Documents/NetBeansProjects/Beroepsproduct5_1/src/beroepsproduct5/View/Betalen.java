/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beroepsproduct5.View;

import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

/**
 *
 * @author Jandri
 */
public class Betalen extends GridPane{
    
    public Betalen(Pane p){
        	// padding
		setPadding(new Insets(10, 10, 10, 10));
		setVgap(5);
		setHgap(5);
        
    }
    
}