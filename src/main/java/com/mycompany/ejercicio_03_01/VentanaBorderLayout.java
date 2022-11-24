/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_03_01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Jonna
 */
public class VentanaBorderLayout extends JFrame {

     public List<JPanel> jPanelList;
    public List<JPanel> jPanelBorde;

    public List<JLabel> jLaeblList;
    public List<JLabel> jEtiquetaList;

    public VentanaBorderLayout() {
        this.setSize(400, 200);
        this.setTitle("BorderLayout");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        iniciarComponentes();
        this.setVisible(true);
    }

    private void iniciarComponentes() {
        iniciarPaneles();
        this.getContentPane().add(jPanelList.get(0));
        bordes();
        colocarEtiquetas();
    }

    private void iniciarPaneles() {
        jPanelList = new ArrayList<>();
        jPanelList.add(new JPanel());
        //Horizontales
        jPanelList.add(new JPanel());
        jPanelList.add(new JPanel());
        jPanelList.add(new JPanel());
        //Verticales del 2do panel
        jPanelList.add(new JPanel());
        jPanelList.add(new JPanel());
        jPanelList.add(new JPanel());
        

        this.jPanelList.get(0).setLayout(new java.awt.GridLayout(3, 1));
        this.jPanelList.get(2).setLayout(new java.awt.GridLayout(1, 3));

        this.jPanelList.get(0).add(this.jPanelList.get(1), BorderLayout.CENTER);
        this.jPanelList.get(0).add(this.jPanelList.get(2), BorderLayout.CENTER);
        this.jPanelList.get(0).add(this.jPanelList.get(3), BorderLayout.CENTER);
        this.jPanelList.get(2).add(this.jPanelList.get(4), BorderLayout.CENTER);
        this.jPanelList.get(2).add(this.jPanelList.get(5), BorderLayout.CENTER);
        this.jPanelList.get(2).add(this.jPanelList.get(6), BorderLayout.CENTER);

    }

    private void bordes() {

        this.jPanelBorde = new ArrayList<>();

        for (int x = 0; x < 25; x++) {
            this.jPanelBorde.add(new JPanel());
            this.jPanelBorde.get(x).setOpaque(true);
            //this.jPanelBorde.get(x).setLayout(null);
            //this.jPanelBorde.get(x).setSize(300, 400);
            this.jPanelBorde.get(x).setBounds(1, 1, 5, 6);
            this.jPanelBorde.get(x).setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED)));
            this.jPanelBorde.get(x).setBackground(Color.gray);
        }

    }

    private void colocarEtiquetas() {

        JLabel etiquetaBoton1 = new JLabel();
        JLabel etiquetaBoton2 = new JLabel();
        JLabel etiquetaBoton3 = new JLabel();
        JLabel etiquetaBoton4 = new JLabel();
        JLabel etiquetaBoton5 = new JLabel();

        jPanelList.get(1).setLayout(new BorderLayout());
        jPanelList.get(3).setLayout(new BorderLayout());
        jPanelList.get(4).setLayout(new BorderLayout());
        jPanelList.get(5).setLayout(new BorderLayout());
        jPanelList.get(6).setLayout(new BorderLayout());

        etiquetaBoton1.setText("Button 1 ");
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
        
 //Bordes       
        this.jPanelList.get(1).add(etiquetaBoton1, BorderLayout.CENTER);
        this.jPanelList.get(3).add(etiquetaBoton4, BorderLayout.CENTER);
        this.jPanelList.get(4).add(etiquetaBoton3, BorderLayout.CENTER);
        this.jPanelList.get(5).add(etiquetaBoton2, BorderLayout.CENTER);
        this.jPanelList.get(6).add(etiquetaBoton5, BorderLayout.CENTER);
        
        this.jPanelList.get(1).setBorder(  new CompoundBorder(new EtchedBorder(),new LineBorder(Color.DARK_GRAY) ));
        this.jPanelList.get(3).setBorder(  new CompoundBorder(new EtchedBorder(),new LineBorder(Color.DARK_GRAY) ));
        this.jPanelList.get(4).setBorder(  new CompoundBorder(new EtchedBorder(),new LineBorder(Color.DARK_GRAY) ));
        this.jPanelList.get(5).setBorder(  new CompoundBorder(new EtchedBorder(),new LineBorder(Color.DARK_GRAY) ));
        this.jPanelList.get(6).setBorder(  new CompoundBorder(new EtchedBorder(),new LineBorder(Color.DARK_GRAY) ));

        this.jPanelList.get(1).setBackground(Color.LIGHT_GRAY);
        this.jPanelList.get(3).setBackground(Color.LIGHT_GRAY);
        this.jPanelList.get(4).setBackground(Color.LIGHT_GRAY);
        this.jPanelList.get(5).setBackground(Color.LIGHT_GRAY);
        this.jPanelList.get(6).setBackground(Color.LIGHT_GRAY);
        
    }

}
