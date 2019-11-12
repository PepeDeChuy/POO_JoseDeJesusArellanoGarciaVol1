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
public class AnimalTerrestre extends Animal
{
    private int numcaminar;
    private boolean mascota;
    private boolean volador;

    public AnimalTerrestre() {
    }

    public AnimalTerrestre(int numcaminar, boolean mascota, boolean volador, int numOjos, String familia, double peso, String nombre, int esperanzaDeVida, String alimentacion) {
        super(numOjos, familia, peso, nombre, esperanzaDeVida, alimentacion);
        this.numcaminar = numcaminar;
        this.mascota = mascota;
        this.volador = volador;
    }

    /**
     * @return the numcaminar
     */
    public int getNumcaminar() {
        return numcaminar;
    }

    /**
     * @param numcaminar the numcaminar to set
     */
    public void setNumcaminar(int numcaminar) {
        this.numcaminar = numcaminar;
    }

    /**
     * @return the mascota
     */
    public boolean isMascota() {
        return mascota;
    }

    /**
     * @param mascota the mascota to set
     */
    public void setMascota(boolean mascota) {
        this.mascota = mascota;
    }

    /**
     * @return the volador
     */
    public boolean isVolador() {
        return volador;
    }

    /**
     * @param volador the volador to set
     */
    public void setVolador(boolean volador) {
        this.volador = volador;
    }
    
    @Override
    public String toString(){
        String mensaje;
        mensaje = super.toString()+" y un animal terreste";
        return mensaje;
    }
}
