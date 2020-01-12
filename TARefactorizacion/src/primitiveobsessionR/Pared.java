/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitiveobsessionR;

import javafx.scene.paint.Color;



/**
 *
 * @author nicoleagila
 */
public class Pared {
    Color color;
    Dimension dimensiones;
    
    public Pared(Dimension dimension){
        this.dimensiones=dimension;
    }
    
    public Pared(){
    }

    public Color getColor() {
        return color;
    }


    public void setColor(Color color) {
        this.color = color;
    }

    public Dimension getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(Dimension dimensiones) {
        this.dimensiones = dimensiones;
    }

    
    
    
}
