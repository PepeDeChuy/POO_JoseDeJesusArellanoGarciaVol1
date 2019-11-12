/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teclado;

import calculadora.JButtonC;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author peper
 */
public class JFrameTeclado extends JFrame {
    
    public JFrameTeclado() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        
        setSize(500,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel(new GridLayout(2,10));
        Dimension dim = new Dimension(30,30);
        
        JButtonC btnQ = new JButtonC("Q", dim, Color.GRAY);
        panel.add(btnQ);
        
        JButtonC btnW = new JButtonC("W", dim, Color.GRAY);
        panel.add(btnW);
        
        JButtonC btnE = new JButtonC("E", dim, Color.GRAY);
        panel.add(btnE);
        
        JButtonC btnR = new JButtonC("R", dim, Color.GRAY);
        panel.add(btnR);
        
        JButtonC btnT = new JButtonC("T", dim, Color.GRAY);
        panel.add(btnT);
        
        JButtonC btnY = new JButtonC("Y", dim, Color.GRAY);
        panel.add(btnY);
        
        JButtonC btnU = new JButtonC("U", dim, Color.GRAY);
        panel.add(btnU);
        
        JButtonC btnI = new JButtonC("I", dim, Color.GRAY);
        panel.add(btnI);
        
        JButtonC btnO = new JButtonC("O", dim, Color.GRAY);
        panel.add(btnO);
        
        JButtonC btnP = new JButtonC("P", dim, Color.GRAY);
        panel.add(btnP);
        
        JButtonC btn7 = new JButtonC("7", dim, Color.GRAY);
        panel.add(btn7);
        
        JButtonC btn8 = new JButtonC("8", dim, Color.GRAY);
        panel.add(btn8);
        
        JButtonC btn9 = new JButtonC("9", dim, Color.GRAY);
        panel.add(btn9);
        
        JButtonC btnA = new JButtonC("A", dim, Color.GRAY);
        panel.add(btnA);
        
        JButtonC btnS = new JButtonC("S", dim, Color.GRAY);
        panel.add(btnS);
        
        setLayout(new BorderLayout());
        add(panel,BorderLayout.CENTER);
        
        KeyListenerTeclado escuchador = new KeyListenerTeclado();
        addKeyListener(escuchador);
        
        setVisible(true);
    }
}
