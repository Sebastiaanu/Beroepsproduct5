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
public class ProductInBestel {
    int id;
    int bestelId;
    int productId;
    int plek;
    LocalDateTime tijd;
    
    public ProductInBestel(){
        
    }
//=============== getters and setters===============
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBestelId() {
        return bestelId;
    }

    public void setBestelId(int bestelId) {
        this.bestelId = bestelId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getPlek() {
        return plek;
    }

    public void setPlek(int plek) {
        this.plek = plek;
    }

    public LocalDateTime getTijd() {
        return tijd;
    }

    public void setTijd(LocalDateTime tijd) {
        this.tijd = tijd;
    }
    
}
