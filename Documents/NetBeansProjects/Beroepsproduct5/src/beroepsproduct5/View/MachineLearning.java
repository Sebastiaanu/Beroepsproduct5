/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beroepsproduct5.View;

import javafx.geometry.Insets;
import javafx.scene.chart.LineChart;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

/**
 *
 * @author Jandri
 */
public class MachineLearning extends GridPane{
    
    private Text txtChooseTable;
    private Text txtCurrentTempDrink1;
    private Text txtAverageTemp;
    private Text txtExpectedTemp;
    
    private ComboBox cbChooseTable;
    private LineChart tableLineChart;
            
    public MachineLearning(Pane p){
        	// padding
		setPadding(new Insets(10, 10, 10, 10));
		setVgap(10);
		setHgap(10);
        
    }
    
}