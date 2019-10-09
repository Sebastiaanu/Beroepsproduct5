/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beroepsproduct5.View;

import javafx.geometry.Insets;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
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
    private Text txtCurrentTempDrinks;
    private Text txtDrink1;
    private Text txtDrink2;
    private Text txtDrink3;
    private Text txtDrink4;
    private Text txtAverageTemp;
    private Text txtExpectedTemp;
    
    private int drink1;
    private int drink2;
    private int drink3;
    private int drink4;
    
    private ComboBox cbChooseTable;
    private LineChart<Number,Number> tableLineChart;
            
    public MachineLearning(Pane p){
        txtChooseTable = new Text("Selecteer tafel");
        txtCurrentTempDrinks = new Text("Huidige temperaturen");
            txtDrink1 = new Text ("Drank 1: " + drink1 +" °C");
            txtDrink2 = new Text("Drank 2: "+ drink2 +" °C");
            txtDrink3 = new Text("Drank 3: "+ drink3 +" °C");
            txtDrink4 = new Text("Drank 4: "+drink4+ " °C");
//      txtAverageTemp = new Text("Gemiddelde temperatuur: ");

        cbChooseTable = new ComboBox();
       initiateNewTable();
        
        
        

        add(txtChooseTable,0,1);
        add(cbChooseTable,1,1);
        add(txtCurrentTempDrinks,0,2);
        add(txtDrink1,1,2);
        add(txtDrink2,1,3);
        add(txtDrink3,1,4);
        add(txtDrink4,1,5);
        add(tableLineChart,2,6);
        
        p.getChildren().addAll(this);
        
            
        
        
        
        
        
        
        
        
        
		setPadding(new Insets(10, 10, 10, 10));
		setVgap(10);
		setHgap(10);
        
    }

    private void initiateNewTable() {
         
        final NumberAxis xAxis = new NumberAxis();
        xAxis.setLabel("Tijd in minuten");
        final NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Temperatuur in C°");
        tableLineChart = new LineChart<Number,Number>(xAxis,yAxis);
        
        tableLineChart.setTitle("Overzicht temperatuurverhoudeningen");
        XYChart.Series drank1 = new XYChart.Series();
        drank1.setName("Drank 1");
        drank1.getData().add(new XYChart.Data(1,80));
        drank1.getData().add(new XYChart.Data(1, 23));
        drank1.getData().add(new XYChart.Data(2, 14));
        drank1.getData().add(new XYChart.Data(3, 15));
        drank1.getData().add(new XYChart.Data(4, 24));
        drank1.getData().add(new XYChart.Data(5, 34));
        drank1.getData().add(new XYChart.Data(6, 36));
        drank1.getData().add(new XYChart.Data(7, 22));
        drank1.getData().add(new XYChart.Data(8, 45));
        drank1.getData().add(new XYChart.Data(9, 43));
        drank1.getData().add(new XYChart.Data(10, 17));
        drank1.getData().add(new XYChart.Data(11, 29));
        drank1.getData().add(new XYChart.Data(12, 25));
        
        XYChart.Series drank2 = new XYChart.Series();
        drank2.setName("Drank 2");
        drank2.getData().add(new XYChart.Data(1, 95));
        drank2.getData().add(new XYChart.Data(2, 92));
        drank2.getData().add(new XYChart.Data(3, 87));
        drank2.getData().add(new XYChart.Data(4, 80));
        drank2.getData().add(new XYChart.Data(5, 75));
        drank2.getData().add(new XYChart.Data(6, 72));
        drank2.getData().add(new XYChart.Data(7, 70));
        drank2.getData().add(new XYChart.Data(8, 65));
        drank2.getData().add(new XYChart.Data(9, 60));
        drank2.getData().add(new XYChart.Data(10, 58));
        drank2.getData().add(new XYChart.Data(11, 55));
        drank2.getData().add(new XYChart.Data(12, 42));
        drank2.getData().add(new XYChart.Data(13,35));
        drank2.getData().add(new XYChart.Data(14,28));
        drank2.getData().add(new XYChart.Data(15,22));
        
        XYChart.Series drank3 = new XYChart.Series();
        drank3.setName("Drank 3");
        drank3.getData().add(new XYChart.Data(0,100));
        drank3.getData().add(new XYChart.Data(1,100));
        drank3.getData().add(new XYChart.Data(2,100));
        drank3.getData().add(new XYChart.Data(3,99));
        drank3.getData().add(new XYChart.Data(4,98));
        drank3.getData().add(new XYChart.Data(5,97));
        drank3.getData().add(new XYChart.Data(6,96));
        drank3.getData().add(new XYChart.Data(7,95));
        drank3.getData().add(new XYChart.Data(8,94));
        drank3.getData().add(new XYChart.Data(9,90));
        drank3.getData().add(new XYChart.Data(10,88));
        drank3.getData().add(new XYChart.Data(11,82));
        drank3.getData().add(new XYChart.Data(12,75));
        drank3.getData().add(new XYChart.Data(13,65));
        drank3.getData().add(new XYChart.Data(14,50));
        drank3.getData().add(new XYChart.Data(15,45));
        drank3.getData().add(new XYChart.Data(16,22));
        
        
        
        tableLineChart.getData().add(drank1);
        tableLineChart.getData().add(drank2);
        tableLineChart.getData().add(drank3);
    }
    
}