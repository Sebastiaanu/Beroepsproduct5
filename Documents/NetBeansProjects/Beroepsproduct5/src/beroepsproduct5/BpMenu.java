/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beroepsproduct5;

import Beroepsproduct5.View.Overzicht;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;



/**
 *
 * @author SebastiaanU
 */
public class BpMenu extends MenuBar{
    Menu overzicht = new Menu("Overzicht");
    MenuItem overzichtItem = new MenuItem("Overzicht");
    
    public BpMenu (Pane p){
        
        overzichtItem.setOnAction(e ->{
            p.getChildren().clear();
            try {
                new Overzicht(p);
            } catch (SQLException ex) {
                Logger.getLogger(BpMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        overzicht.getItems().addAll(overzichtItem);
        this.getMenus().addAll(overzicht);
        p.getChildren().addAll(this);
    }
}
