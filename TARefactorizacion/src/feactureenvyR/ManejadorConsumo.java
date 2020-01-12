/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feactureenvyR;


/**
 *
 * @author nicoleagila
 */
public class ManejadorConsumo {
    private boolean usandose;
    private TarifaContratada tarifa;
    
    public ManejadorConsumo(int minutos){
        usandose=true;
        tarifa.setTiempoContratado(minutos);
    }
    
    public void aumentarTiempoContratado(int minutosMas){
        tarifa.aumentarTiempoContratado(minutosMas);
    }
    
    public void cobro(){
        double valor= tarifa.valorPagar();
        System.out.println("Usted debe pagar un total de: "+Double.toString(valor));
        usandose=false;
    }
    
    
}
