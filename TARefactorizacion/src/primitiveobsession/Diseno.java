/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitiveobsession;

import java.util.ArrayList;

/**
 *
 * @author nicoleagila
 */
public class Diseno {
    ArrayList<Pared> paredes;
    
    public Diseno(){
        paredes = new ArrayList<>();
        paredes.add(new Pared(50,50));
        paredes.add(new Pared(75,50));
    }
    
    public void asignarColorParedes(String c){
        paredes.forEach((p) -> {
            p.setColor(c);
        });
    }    
}
