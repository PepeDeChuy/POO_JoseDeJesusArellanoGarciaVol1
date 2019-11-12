/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author CRUZLEIJA
 */
public class JFrameCalculadora extends JFrame {
    private double preResultado;
    private String signo = "+";
    
    public JFrameCalculadora() {
        inicializarComponentes();
        
    }

    private void inicializarComponentes() {
        // crear el componente para la parte central
        JPanel panelCentral = new JPanel(new GridLayout(5,4));
        // creamos los botones
        Dimension dim = new Dimension(30,30);
        
        JButtonC btnC = new JButtonC("C", dim, Color.yellow);
        panelCentral.add(btnC);
        
        JButtonC btnCE = new JButtonC("CE", dim, Color.yellow);
        panelCentral.add(btnCE);
        
        JButtonC btnMM = new JButtonC("+/-", dim, Color.ORANGE);
        panelCentral.add(btnMM);
        
        JButtonC btnMulti = new JButtonC("X", dim, Color.LIGHT_GRAY);
        panelCentral.add(btnMulti);
        
        JButtonC btn7 = new JButtonC("7", dim, Color.white);
        panelCentral.add(btn7);
        
        JButtonC btn8 = new JButtonC("8", dim, Color.white);
        panelCentral.add(btn8);
        
        JButtonC btn9 = new JButtonC("9", dim, Color.white);
        panelCentral.add(btn9);
        
        JButtonC btnDiv = new JButtonC("/", dim, Color.LIGHT_GRAY);
        panelCentral.add(btnDiv);
        
        JButtonC btn4 = new JButtonC("4", dim, Color.white);
        panelCentral.add(btn4);
        
        JButtonC btn5 = new JButtonC("5", dim, Color.white);
        panelCentral.add(btn5);
        
        JButtonC btn6 = new JButtonC("6", dim, Color.white);
        panelCentral.add(btn6);
        
        JButtonC btnMenos = new JButtonC("-", dim, Color.LIGHT_GRAY);
        panelCentral.add(btnMenos);
        
        JButtonC btn1 = new JButtonC("1", dim, Color.white);
        panelCentral.add(btn1);
        
        JButtonC btn2 = new JButtonC("2", dim, Color.white);
        panelCentral.add(btn2);
        
        JButtonC btn3 = new JButtonC("3", dim, Color.white);
        panelCentral.add(btn3);
        
        JButtonC btnPlus = new JButtonC("+", dim, Color.LIGHT_GRAY);
        panelCentral.add(btnPlus);
        
        JButtonC btnCero = new JButtonC("0", dim, Color.white);
        panelCentral.add(btnCero);
        
        JButtonC btnPunto = new JButtonC(".", dim, Color.white);
        panelCentral.add(btnPunto);
        
        JButtonC btnIgual = new JButtonC("=", dim, Color.LIGHT_GRAY);
        panelCentral.add(btnIgual);
        
        JButtonC btnAcerca = new JButtonC("?", dim, Color.cyan);
        panelCentral.add(btnAcerca);
        
        setLayout(new BorderLayout());
        add(panelCentral,BorderLayout.CENTER);
        
        JTextField display = new JFormattedTextField();
        Font auxF = display.getFont();
        Font nueva = new Font(auxF.getName(), auxF.getStyle(), 40);
        display.setFont(nueva);
        add(display, BorderLayout.NORTH);
        
        display.setEditable(false);
        
        setSize(500,800);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        
        setLocationRelativeTo(null);
        
        ListenerDigito escuchadorDatos = new ListenerDigito(display);
        ListenerFunciones escuchadorOperaciones = new ListenerFunciones(display);
        
        btn9.addActionListener(escuchadorDatos);
        btn8.addActionListener(escuchadorDatos);
        btn7.addActionListener(escuchadorDatos);
        btn6.addActionListener(escuchadorDatos);
        btn5.addActionListener(escuchadorDatos);
        btn4.addActionListener(escuchadorDatos);
        btn3.addActionListener(escuchadorDatos);
        btn2.addActionListener(escuchadorDatos);
        btn1.addActionListener(escuchadorDatos);
        btnCero.addActionListener(escuchadorDatos);
        btnPunto.addActionListener(escuchadorDatos);
        
        btnPlus.addActionListener(escuchadorOperaciones);
        btnMenos.addActionListener(escuchadorOperaciones);
        btnMulti.addActionListener(escuchadorOperaciones);
        btnDiv.addActionListener(escuchadorOperaciones);
        btnIgual.addActionListener(escuchadorOperaciones);
        
        btnC.addActionListener(escuchadorOperaciones);
        btnCE.addActionListener(escuchadorOperaciones);
        
        btnMM.addActionListener(escuchadorOperaciones);
        btnAcerca.addActionListener(escuchadorOperaciones);
    }

    /**
     * @return the preResultado
     */
    public double getPreResultado() {
        return preResultado;
    }
}
