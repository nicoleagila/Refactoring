/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feactureenvyR;

import java.sql.Time;
import java.time.LocalTime;

/**
 *
 * @author nicoleagila
 */
public class TarifaContratada {
    private int tiempoContratado; //tiempo en minutos
    private Time tiempoInicio;
    private Time tiempoFinal;
    private double valorMinimo;
    
    public TarifaContratada(int tiempoContratado){
        this.tiempoContratado=tiempoContratado;
        tiempoInicio=Time.valueOf(LocalTime.now());
        valorMinimo=0.15;
    }

    public void setTiempoContratado(int tiempoContratado) {
        this.tiempoContratado = tiempoContratado;
    }

    public void setTiempoInicio(Time tiempoInicio) {
        this.tiempoInicio = tiempoInicio;
    }

    public void setTiempoFinal(Time tiempoFinal) {
        this.tiempoFinal = tiempoFinal;
    }

    public int getTiempoContratado() {
        return tiempoContratado;
    }

    public Time getTiempoInicio() {
        return tiempoInicio;
    }

    public Time getTiempoFinal() {
        return tiempoFinal;
    }
    
    public int aumentarTiempoContratado(int minutosMas){
        return tiempoContratado+=minutosMas;
    }

    public double getValorMinimo() {
        return valorMinimo;
    }

    public void setValorMinimo(double valorMinimo) {
        this.valorMinimo = valorMinimo;
    } 
    
    public double valorPagar(){
        return valorMinimo+(tiempoContratado-10)*.20;
    }
}
