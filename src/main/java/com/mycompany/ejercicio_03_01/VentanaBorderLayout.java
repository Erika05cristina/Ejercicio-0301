/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_03_01;

import java.awt.BorderLayout;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author Jonna
 */
public class VentanaBorderLayout extends JFrame {

    public List<JPanel> jPanelList;
    public List<JLabel> jLaeblList;

    public VentanaBorderLayout() {
        this.setSize(500, 500);
        //this.setLocation(600,350);
        this.setTitle("BorderLayout");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        //FlowLayout disposicion = new FlowLayout(FlowLayout.CENTER,80,100);
        //this.setLayout(disposicion);
        //this.setLayout(new FlowLayout( FlowLayout.CENTER,75,100 ));
        iniciarComponentes();
        this.setVisible(true);
    }

    private void iniciarComponentes() {
        iniciarPaneles();
        this.getContentPane().add(jPanelList.get(0));
        colocarEtiquetas();
    }

    private void iniciarPaneles() {
        jPanelList = new ArrayList<>();
        jPanelList.add(new JPanel());
        //Horizontales
        jPanelList.add(new JPanel());
        jPanelList.add(new JPanel());
        jPanelList.add(new JPanel());
        //Verticales 2do panel
        jPanelList.add(new JPanel());
        jPanelList.add(new JPanel());
        jPanelList.add(new JPanel());
        
        



        //panel1.setLayout(new BorderLayout(20,20));

    }

    private void colocarEtiquetas() {
        JLabel etiquetaBoton1 = new JLabel();
        JLabel etiquetaBoton2 = new JLabel();
        JLabel etiquetaBoton3 = new JLabel();
        JLabel etiquetaBoton4 = new JLabel();
        JLabel etiquetaBoton5 = new JLabel();

        etiquetaBoton1.setText("Button 1");
        etiquetaBoton2.setText("2");
        etiquetaBoton3.setText("Button 3");
        etiquetaBoton4.setText("Long-Named Button 4");
        etiquetaBoton5.setText("Button 5");

        
        
        etiquetaBoton1.setOpaque(true);
        etiquetaBoton1.setHorizontalAlignment(SwingConstants.CENTER);

        etiquetaBoton2.setOpaque(true);
        etiquetaBoton2.setHorizontalAlignment(SwingConstants.CENTER);

        etiquetaBoton3.setOpaque(true);
        etiquetaBoton3.setHorizontalAlignment(SwingConstants.CENTER);

        etiquetaBoton4.setOpaque(true);
        etiquetaBoton4.setHorizontalAlignment(SwingConstants.CENTER);

        etiquetaBoton5.setOpaque(true);
        etiquetaBoton5.setHorizontalAlignment(SwingConstants.CENTER);
        
        
        this.jPanelList.get(0).setLayout(new java.awt.GridLayout(3,3));
        
        
        //jPanelList.get(1)
        

        /*
        panel1.add(etiquetaBoton1,BorderLayout.NORTH);
        panel1.add(etiquetaBoton2,BorderLayout.CENTER);
        panel1.add(etiquetaBoton3,BorderLayout.SOUTH);
        panel1.add(etiquetaBoton4,BorderLayout.EAST);
        panel1.add(etiquetaBoton5,BorderLayout.WEST);
        
         */
    }

}
