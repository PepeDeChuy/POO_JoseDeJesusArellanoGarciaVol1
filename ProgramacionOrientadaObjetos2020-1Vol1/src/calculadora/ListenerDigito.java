/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Alumno
 */
public class ListenerDigito implements ActionListener{

    private JTextField display;

    public ListenerDigito(JTextField display) {
        this.display = display;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand() != ".")
        {
            display.setText(display.getText() + e.getActionCommand());
        }
        else
        {
            if(display.getText().contains(".") == false)
            {
                display.setText(display.getText() + ".");
            }
        }
    }
    
}
