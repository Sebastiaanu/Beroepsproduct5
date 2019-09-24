/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beroepsproduct5.View;

import java.awt.Color;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

/**
 *
 * @author Jandri
 */
public class Bestellen extends GridPane{
    private Text lblTafel, lblDrank, lblEten, lblApproved;
    private ComboBox<String> cbxTafel, cbxDrank, cbxEten;
//    private ChoiceBox<String> ;
    private Button btnOpslaan;

    public Bestellen (Pane p){
        	// padding
		setPadding(new Insets(10, 10, 10, 10));
		setVgap(5);
		setHgap(5);
                
                // text
                lblTafel = new Text ("Tafel Nummer");
                lblDrank = new Text ("Drank");
                lblEten = new Text ("Eten");
                lblApproved = new Text("Uw bestelling is gemaakt");

		lblApproved.setVisible(false);
//		lblApproved.setFill(Color.RED);
                
                // Combobox
                cbxTafel = new ComboBox<String>();
                cbxTafel.getItems().addAll();
                cbxDrank = new ComboBox<String>();
                cbxDrank.getItems().addAll();
                cbxEten = new ComboBox<String>();
                cbxEten.getItems().addAll();
                
                // Value van de boxes
		cbxTafel.setValue("Kies Tafel");
                cbxDrank.setValue("Kies Drank");
                cbxEten.setValue("Kies Eten"); 
                        
                
                // button & event
                btnOpslaan = new Button("Opslaan");
        
                // gridpane layout
                add(lblTafel, 0, 0);
                add(cbxTafel,0, 1);
                add(lblDrank,1, 0);
                add(cbxDrank, 1, 1);
                add(lblEten, 0, 2);
                add(cbxEten, 1, 2);
                
                add(btnOpslaan, 1, 8);
		add(lblApproved,0,8);
                
//              vuldeCombo1();
//		vuldeCombo2();

                // mainPane = root
		p.getChildren().add(this);
    }
    //methode om de combobox te vullen
//	public void vuldeCombo1() {
//		DbConnector db = new DbConnector();
//		ResultSet result = null;
//		try {
//			String strSQL = "select * from ....";
//			result = db.getData(strSQL);
//			while (result.next()) {
//				String naam = result.getString("activiteit");
//				cbxDrank.getItems().add(naam);
//			}
//		} catch (Exception e) {
//
//		}
//	}
//	public void vuldeCombo2() {
//		DbConnector db = new DbConnector();
//		ResultSet result = null;
//		try {
//			String strSQL = "select * from ...";
//			result = db.getData(strSQL);
//			while (result.next()) {
//				String naam = result.getString("naam");
//				cbxEten.getItems().add(naam);
//			}
//		} catch (Exception e) {
//
//		}
//	}
}