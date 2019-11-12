/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toString;

import TiposJOptionPane.JFrameJOptionPane;

/**
 *
 * @author peper
 */
public class MainToString {
    public static void main(String[] args) {
        AnimalTerrestre AT = new AnimalTerrestre();
        System.out.println(AT.toString());
        
        AnimalAcuatico AO = new AnimalAcuatico();
        System.out.println(AO.toString());
    }   
    
}
