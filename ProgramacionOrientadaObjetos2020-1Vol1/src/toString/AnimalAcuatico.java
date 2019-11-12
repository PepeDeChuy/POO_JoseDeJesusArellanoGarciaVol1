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
public class AnimalAcuatico extends Animal 
{
    private double profuncidad;
    private int numAletas;
    private boolean oceano;

    public AnimalAcuatico() {
    }

    public AnimalAcuatico(double profuncidad, int numAletas, boolean oceano, int numOjos, String familia, double peso, String nombre, int esperanzaDeVida, String alimentacion) {
        super(numOjos, familia, peso, nombre, esperanzaDeVida, alimentacion);
        this.profuncidad = profuncidad;
        this.numAletas = numAletas;
        this.oceano = oceano;
    }

    /**
     * @return the profuncidad
     */
    public double getProfuncidad() {
        return profuncidad;
    }

    /**
     * @param profuncidad the profuncidad to set
     */
    public void setProfuncidad(double profuncidad) {
        this.profuncidad = profuncidad;
    }

    /**
     * @return the numAletas
     */
    public int getNumAletas() {
        return numAletas;
    }

    /**
     * @param numAletas the numAletas to set
     */
    public void setNumAletas(int numAletas) {
        this.numAletas = numAletas;
    }

    /**
     * @return the oceano
     */
    public boolean isOceano() {
        return oceano;
    }

    /**
     * @param oceano the oceano to set
     */
    public void setOceano(boolean oceano) {
        this.oceano = oceano;
    }
    
    @Override
    public String toString(){
        String mensaje;
        mensaje = super.toString()+" y un animal acuatico";
        return mensaje;
    }
}
