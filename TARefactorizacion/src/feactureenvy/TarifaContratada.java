/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feactureenvy;

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
    
    public TarifaContratada(int tiempoContratado){
        this.tiempoContratado=tiempoContratado;
        tiempoInicio=Time.valueOf(LocalTime.now());
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
    
}
