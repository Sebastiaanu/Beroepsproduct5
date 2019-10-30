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
public class Leverancier {
    int id;
    String naam;
    
    public Leverancier(){
        
    }
//=============== getters and setters===============
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
    
}
