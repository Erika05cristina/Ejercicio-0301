/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_03_01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

/**
 *
 * @author Jonna
 */
public class GridLayout extends JFrame {

    public List<JPanel> jPanelList;
    public List<JLabel> jLabelList;
    public JPanel panelPrincipal;

    public GridLayout() {
        this.setSize(400, 200);
        this.setTitle("Ventana Grid");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocation(40, 30);

        this.setVisible(true);

        iniciarComandos();
    }

    private void iniciarComandos() {
        colocarPaneles();
        colocarEtiquetas();
    }

    private void colocarPaneles() {
        jPanelList = new ArrayList<>();
        panelPrincipal = new JPanel();
        this.getContentPane().add(panelPrincipal);

        panelPrincipal.setLayout(new java.awt.GridLayout(3, 2));

        //Crea paneles
        for (int x = 0; x < 6; x++) {
            jPanelList.add(new JPanel());
            this.jPanelList.get(x).setBackground(Color.gray);
        }

        //Añade los paneles al panel principal
        for (int x = 0; x < 6; x++) {
            panelPrincipal.add(this.jPanelList.get(x));
            this.jPanelList.get(x).setBackground(Color.gray);
            jPanelList.get(x).setLayout(new BorderLayout());

        }

    }

    private void colocarEtiquetas() {
        jLabelList = new ArrayList<>();

        //Creación de ETIQUETAS
        for (int i = 0; i < 6; i++) {
            jLabelList.add(new JLabel());

            jLabelList.get(i).setOpaque(true);
            jLabelList.get(i).setHorizontalAlignment(SwingConstants.CENTER);
            this.jPanelList.get(i).setBorder(new CompoundBorder(new EtchedBorder(), new LineBorder(Color.DARK_GRAY)));
        }

        jLabelList.get(0).setText("Button 1");
        jLabelList.get(1).setText("2");
        jLabelList.get(2).setText("Button 3");
        jLabelList.get(3).setText("Long-Named Button 4");
        jLabelList.get(4).setText("Button 5");
        jLabelList.get(5).setText(" ");

        for (int j = 0; j < 6; j++) {
            jPanelList.get(j).add(jLabelList.get(j), BorderLayout.CENTER);
        }

    }

}
