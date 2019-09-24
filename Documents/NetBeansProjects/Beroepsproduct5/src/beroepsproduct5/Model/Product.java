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
public class Product {
    int id;
    String naam;
    int leveancierId;
    
    public Product(){
        
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

    public int getLeveancierId() {
        return leveancierId;
    }

    public void setLeveancierId(int leveancierId) {
        this.leveancierId = leveancierId;
    }
    
}
