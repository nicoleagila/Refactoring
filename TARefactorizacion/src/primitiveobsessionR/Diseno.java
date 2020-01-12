/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitiveobsessionR;


import java.util.ArrayList;
import javafx.scene.paint.Color;

/**
 *
 * @author nicoleagila
 */
public class Diseno {
    ArrayList<Pared> paredes;
    
    public Diseno(){
        paredes = new ArrayList<>();
        paredes.add(new Pared(new Dimension(50,50)));
        paredes.add(new Pared(new Dimension(75,75)));
    }
    
    public void asignarColorParedes(Color c){
        for(Pared p: paredes){
            p.setColor(c);
        }
    }    
}
