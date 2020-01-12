/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchstatementR;

/**
 *
 * @author nicoleagila
 */
public class TTerrestre implements Transporte{

    public TTerrestre() {
    }
    

    @Override
    public void transportar() {
        System.out.println("Transportando en carretera...");
    }
    
}
