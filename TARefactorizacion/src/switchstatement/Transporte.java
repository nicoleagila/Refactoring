/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchstatement;

/**
 *
 * @author nicoleagila
 */
public class Transporte {
    private Type tipo;
    
    public enum Type {
        AEREO, TERRESTRE, MARINO;
    }
    
    public Transporte(Type tipo){
        this.tipo=tipo;
    }
    
    public void transportar(){
            switch(tipo){
                case AEREO:
                    System.out.println("Transportando por el aire...");
                    break;
                case TERRESTRE:
                    System.out.println("Transportando en carretera...");
                    break;
                case MARINO:
                    System.out.println("Transportando por el mar...");
                    break;
            }
    }
}
