/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toString;

import Herencia.*;

/**
 *
 * @author peper
 */
public class SerVivo 
{
    private String nombre;
    private int esperanzaDeVida;
    private String alimentacion;

    public SerVivo() {
    }

    public SerVivo(String nombre, int esperanzaDeVida, String alimentacion) {
        this.nombre = nombre;
        this.esperanzaDeVida = esperanzaDeVida;
        this.alimentacion = alimentacion;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the esperanzaDeVida
     */
    public int getEsperanzaDeVida() {
        return esperanzaDeVida;
    }

    /**
     * @param esperanzaDeVida the esperanzaDeVida to set
     */
    public void setEsperanzaDeVida(int esperanzaDeVida) {
        this.esperanzaDeVida = esperanzaDeVida;
    }

    /**
     * @return the alimentacion
     */
    public String getAlimentacion() {
        return alimentacion;
    }

    /**
     * @param alimentacion the alimentacion to set
     */
    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }
    
    @Override
    public String toString(){
        String mensaje;
        mensaje = "Soy un ser vivo";
        return mensaje;
    }
}
