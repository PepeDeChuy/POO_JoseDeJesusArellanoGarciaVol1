/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.JTextField;

/**
 *
 * @author peper
 */
public class Display extends JTextField{

    public Display() {
        
    }
    public void concatenar(String val){
        setText(getText()+val);
    }
}
