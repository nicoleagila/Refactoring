/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feactureenvy;

/**
 *
 * @author nicoleagila
 */
public class ManejadorConsumo {
    private boolean usandose;
    private TarifaContratada tarifa;
    private double valor;
    
    public ManejadorConsumo(int minutos){
        usandose=true;
        tarifa.setTiempoContratado(minutos);
        valor=0.15;
    }
    
    public void aumentarTiempoContratado(int minutosMas){
        tarifa.setTiempoContratado(tarifa.getTiempoContratado()+minutosMas);
    }
    
    public double valorPagar(){
        valor+=(tarifa.getTiempoContratado()-10)*.20;
        return valor;
    }
    
    
}
