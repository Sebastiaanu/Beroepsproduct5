/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beroepsproduct5.Model;

import java.time.LocalDateTime;

/**
 *
 * @author SebastiaanU
 */
public class OmgevingsTemp {
    LocalDateTime tijd;
    double temp;
    
    public OmgevingsTemp(){
        
    }
//=============== getters and setters===============
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
