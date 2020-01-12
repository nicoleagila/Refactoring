/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitiveobsession;

/**
 *
 * @author nicoleagila
 */
public class Pared {
    String color;
    int dimensionX;
    int dimensionY;
    
    public Pared(int dimensionX, int dimensionY){
        this.dimensionX=dimensionX;
        this.dimensionY=dimensionY;
    }
    
    public String getColor() {
        return color;
    }

    public int getDimensionX() {
        return dimensionX;
    }

    public int getDimensionY() {
        return dimensionY;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDimensionX(int dimensionX) {
        this.dimensionX = dimensionX;
    }

    public void setDimensionY(int dimensionY) {
        this.dimensionY = dimensionY;
    }
    
    
    
}
