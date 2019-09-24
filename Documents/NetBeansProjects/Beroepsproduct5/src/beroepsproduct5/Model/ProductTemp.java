/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beroepsproduct5.Model;

import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 *
 * @author SebastiaanU
 */
public class ProductTemp {
    int id;
    int prodInBestelId;
    LocalDateTime tijd;
    double temp;
    
    public ProductTemp(){
        
    }
//=============== getters and setters===============
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProdInBestelId() {
        return prodInBestelId;
    }

    public void setProdInBestelId(int prodInBestelId) {
        this.prodInBestelId = prodInBestelId;
    }

    public LocalDateTime getTijd() {
        return tijd;
    }

    public void setTijd(LocalDateTime tijd) {
        this.tijd = tijd;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }
    
}
