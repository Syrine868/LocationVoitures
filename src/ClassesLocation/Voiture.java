/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesLocation;

/**
 *
 * @author Cyrine
 */
public class Voiture {
    
    public String mat;
    public String marque;
    public float  prix;

    public Voiture(String mat, String marque, float prix) {
        this.mat = mat;
        this.marque = marque;
        this.prix = prix;
    }

    public Voiture() {
    }

    @Override
    public String toString() {
        return "Voiture{" + "mat=" + mat + ", marque=" + marque + ", prix=" + prix + '}';
    }
    
    
    public String getMat() {
        return mat;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }
   
    
}
