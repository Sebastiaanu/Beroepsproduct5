/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beroepsproduct5.Model;

/**
 *
 * @author SebastiaanU
 */
public class Bestelling {
    int nummer;
    int tafelnummer;
    
    public Bestelling(){
        
    }
//=============== getters and setters===============
    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public int getTafelnummer() {
        return tafelnummer;
    }

    public void setTafelnummer(int tafelnummer) {
        this.tafelnummer = tafelnummer;
    }
    
}
