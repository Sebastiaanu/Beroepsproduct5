/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beroepsproduct5.View;

import beroepsproduct5.DbConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

/**
 *
 * @author SebastiaanU
 */
public class Overzicht extends GridPane{
    
    
    public Overzicht(Pane p) throws SQLException{
        getLeveranciers();
        
    }

    public void getLeveranciers() throws SQLException{
        DbConnector db = new DbConnector();
        String strSQL = "select * from tafels";
        ResultSet result = db.getData(strSQL);
        String value = "";
        while (result.next()){
            value = result.getString(1);
            System.out.println(value);
        }
    }
}
