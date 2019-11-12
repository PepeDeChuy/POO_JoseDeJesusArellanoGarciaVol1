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
public class Animal extends SerVivo
{
    private int numOjos;
    private String familia;
    private double peso;

    public Animal() {
    }

    public Animal(int numOjos, String familia, double peso, String nombre, int esperanzaDeVida, String alimentacion) {
        super(nombre, esperanzaDeVida, alimentacion);
        this.numOjos = numOjos;
        this.familia = familia;
        this.peso = peso;
    }

    /**
     * @return the numOjos
     */
    public int getNumOjos() {
        return numOjos;
    }

    /**
     * @param numOjos the numOjos to set
     */
    public void setNumOjos(int numOjos) {
        this.numOjos = numOjos;
    }

    /**
     * @return the familia
     */
    public String getFamilia() {
        return familia;
    }

    /**
     * @param familia the familia to set
     */
    public void setFamilia(String familia) {
        this.familia = familia;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    @Override
    public String toString(){
        String mensaje;
        mensaje =super.toString()+ " y un aminal";
        return mensaje;
    }
}
