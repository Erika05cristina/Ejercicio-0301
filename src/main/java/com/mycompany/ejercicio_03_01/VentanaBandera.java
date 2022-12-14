/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_03_01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Kristina
 */
public class VentanaBandera extends JFrame {

    public List<JPanel> jPanelList;
    public List<JPanel> jPanelBorde;
    public List<JPanel> jPanelBandera;
    public List<JLabel> jLaeblList;
    public List<JLabel> jEtiquetaList;

    public VentanaBandera() {
        this.setSize(400, 200);
        this.setTitle("BorderLayout");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocation(45, 35);

        iniciarComponentes();
        this.setVisible(true);
    }

    private void iniciarComponentes() {
        iniciarPaneles();
        this.getContentPane().add(jPanelList.get(0));
        bordes();
        colocarEtiquetas();
        bandera();
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
        //this.jPanelList.get(5).add(etiquetaBoton2, BorderLayout.CENTER);
        this.jPanelList.get(6).add(etiquetaBoton5, BorderLayout.CENTER);

        this.jPanelList.get(1).setBorder(new CompoundBorder(new EtchedBorder(), new LineBorder(Color.DARK_GRAY)));
        this.jPanelList.get(3).setBorder(new CompoundBorder(new EtchedBorder(), new LineBorder(Color.DARK_GRAY)));
        this.jPanelList.get(4).setBorder(new CompoundBorder(new EtchedBorder(), new LineBorder(Color.DARK_GRAY)));
        //  this.jPanelList.get(5).setBorder(new CompoundBorder(new EtchedBorder(), new LineBorder(Color.DARK_GRAY)));
        this.jPanelList.get(6).setBorder(new CompoundBorder(new EtchedBorder(), new LineBorder(Color.DARK_GRAY)));

        this.jPanelList.get(1).setBackground(Color.LIGHT_GRAY);
        this.jPanelList.get(3).setBackground(Color.LIGHT_GRAY);
        this.jPanelList.get(4).setBackground(Color.LIGHT_GRAY);
        // this.jPanelList.get(5).setBackground(Color.LIGHT_GRAY);
        this.jPanelList.get(6).setBackground(Color.LIGHT_GRAY);

    }

    private void bandera() {

        this.jPanelBandera = new ArrayList<>();
        this.jPanelList.get(5).setLayout(new java.awt.GridLayout(8, 17));

        for (int x = 0; x < 128; x++) {
            this.jPanelBandera.add(new JPanel());
            this.jPanelList.get(5).add(jPanelBandera.get(x));
        }

        int y;

        for (y = 0; y < 5; y++) {
            this.jPanelBandera.get(y).setBackground(Color.red);
        }
        this.jPanelBandera.get(5).setBackground(Color.white);
        this.jPanelBandera.get(6).setBackground(Color.blue);
        this.jPanelBandera.get(7).setBackground(Color.blue);
        this.jPanelBandera.get(8).setBackground(Color.white);
        for (y = 9; y < 21; y++) {
            this.jPanelBandera.get(y).setBackground(Color.red);
        }
        this.jPanelBandera.get(21).setBackground(Color.white);
        this.jPanelBandera.get(22).setBackground(Color.blue);
        this.jPanelBandera.get(23).setBackground(Color.blue);
        this.jPanelBandera.get(24).setBackground(Color.white);

        for (y = 25; y < 35; y++) {
            this.jPanelBandera.get(y).setBackground(Color.red);
        }
        for (y = 32; y < 37; y++) {
            this.jPanelBandera.get(y).setBackground(Color.white);
        }

        this.jPanelBandera.get(37).setBackground(Color.white);
        this.jPanelBandera.get(38).setBackground(Color.blue);
        this.jPanelBandera.get(39).setBackground(Color.blue);
        this.jPanelBandera.get(40).setBackground(Color.white);

        for (y = 41; y < 48; y++) {
            this.jPanelBandera.get(y).setBackground(Color.white);
        }
        for (y = 48; y < 80; y++) {
            this.jPanelBandera.get(y).setBackground(Color.blue);
        }
        for (y = 80; y < 86; y++) {
            this.jPanelBandera.get(y).setBackground(Color.white);
        }
        this.jPanelBandera.get(86).setBackground(Color.blue);
        this.jPanelBandera.get(87).setBackground(Color.blue);
        for (y = 88; y < 96; y++) {
            this.jPanelBandera.get(y).setBackground(Color.white);
        }
        for (y = 96; y < 101; y++) {
            this.jPanelBandera.get(y).setBackground(Color.red);

        }
        this.jPanelBandera.get(101).setBackground(Color.white);
        this.jPanelBandera.get(102).setBackground(Color.blue);
        this.jPanelBandera.get(103).setBackground(Color.blue);
        this.jPanelBandera.get(104).setBackground(Color.white);
        for (y = 105; y < 117; y++) {
            this.jPanelBandera.get(y).setBackground(Color.red);
        }
        this.jPanelBandera.get(117).setBackground(Color.white);
        this.jPanelBandera.get(118).setBackground(Color.blue);
        this.jPanelBandera.get(119).setBackground(Color.blue);
        this.jPanelBandera.get(120).setBackground(Color.white);
        for (y = 121; y < 128; y++) {
            this.jPanelBandera.get(y).setBackground(Color.red);
        }

    }

}
