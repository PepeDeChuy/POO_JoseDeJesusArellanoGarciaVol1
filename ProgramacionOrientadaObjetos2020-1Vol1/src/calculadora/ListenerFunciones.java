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
 * @author peper
 */
public class ListenerFunciones implements ActionListener {

    private JTextField display;
    private String signo = "+";
    private double preResultado;

    public ListenerFunciones(JTextField display) {
        this.display = display;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        switch (e.getActionCommand())
                {
                    case "+":
                    {
                        obtenerPreresultado(display);
                        signo = "+";
                        display.setText("");
                        break;
                    }
                    case "-":
                    {
                        obtenerPreresultado(display);
                        signo = "-";
                        display.setText("");
                        break;
                    }
                    case "X":
                    {
                        obtenerPreresultado(display);
                        signo = "X";
                        display.setText("");
                        break;
                    }
                    case "/":
                    {
                        obtenerPreresultado(display);
                        signo = "/";
                        display.setText("");
                        break;
                    }
                    case "C":
                    {
                        display.setText("");
                        break;
                    }
                    case "CE":
                    {
                        display.setText("");
                        preResultado = 0;
                        break;
                    }
                    case "+/-":
                    {
                        if(display.getText().contains("-") == true)
                        {
                            display.setText(display.getText().substring(1, display.getText().length()));
                        }
                        else
                        {
                            display.setText("-" + display.getText());
                        }
                        break;
                    }
                    case "=":
                    {
                        obtenerPreresultado(display);
                        signo = "+";
                        display.setText(String.valueOf(getPreResultado()));
                        preResultado =0;
                        break;
                    }
                    case "?":
                    {
                        JOptionPane.showMessageDialog(null, "Calculadora creada por Jose de Jesus Arallno Garcia");
                        break;
                    }
                }
    }
    
     public void obtenerPreresultado(JTextField display)
    {
        switch (signo)
        {
            case "+":
            {
                preResultado = preResultado + Double.parseDouble(display.getText());        
                break;
            }
            case "-":
            {
                preResultado = preResultado - Double.parseDouble(display.getText());
                break;
            }
            case "X":
            {
                preResultado = preResultado * Double.parseDouble(display.getText());
                 break;
            }
            case "/":
            {
                preResultado = preResultado / Double.parseDouble(display.getText());        
                break;
            }
        }
    }

    /**
     * @return the preResultado
     */
    public double getPreResultado() {
        return preResultado;
    }
}
