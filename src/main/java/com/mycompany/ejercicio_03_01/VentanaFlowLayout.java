/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_03_01;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
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
/**
 *
 * @author Jonna
 */
public class VentanaFlowLayout extends JFrame {

public List<JPanel> jPanelList;
   // public List<JPanel> jPanelList;
    public List<JLabel> jLabelList;
    public JPanel panelPrincipal;
//panelNuevo.setLayout(new FlowLayout(FlowLayout.CENTER,75,100));
    
    public VentanaFlowLayout() {
        this.setSize(500, 100);
        this.setTitle("Ventana Grid");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocation(40,10 );
        this.setVisible(true);

        iniciarComandos();
    }
    
    private void iniciarComandos() {
        colocarPaneles();
        colocarEtiquetas();
    }
    
    private void colocarPaneles(){     
        jPanelList = new ArrayList<>();
        panelPrincipal = new JPanel();
        this.getContentPane().add(panelPrincipal);
        panelPrincipal.setLayout(new FlowLayout(FlowLayout.CENTER,10,20));
        
         //Crea paneles
        for (int x = 0; x < 5; x++) {
            jPanelList.add(new JPanel());
            this.jPanelList.get(x).setBackground(Color.gray);
        }
        
        //Añade los paneles al panel principal
        for (int x = 0; x < 5; x++) {
            panelPrincipal.add(this.jPanelList.get(x));
            this.jPanelList.get(x).setBackground(Color.gray);
            jPanelList.get(x).setLayout(new BorderLayout());

        }
        
    }
    
    private void colocarEtiquetas(){
        jLabelList = new ArrayList<>();
        //Creación de ETIQUETAS
        for (int i = 0; i < 5; i++) {
            jLabelList.add(new JLabel());

            jLabelList.get(i).setOpaque(true);
            jLabelList.get(i).setLayout(null);
            jLabelList.get(i).setSize(20,30);
            jLabelList.get(i).setHorizontalAlignment(SwingConstants.CENTER);
            this.jPanelList.get(i).setBorder(new CompoundBorder(new EtchedBorder(), new LineBorder(Color.DARK_GRAY)));
        }
        
        jLabelList.get(0).setText(" Button 1 ");
        jLabelList.get(1).setText("     2    ");
        jLabelList.get(2).setText(" Button 3 ");
        jLabelList.get(3).setText(" Long-Named Button 4 ");
        jLabelList.get(4).setText(" Button 5 ");
        
        for (int j = 0; j < 6; j++) {
            jPanelList.get(j).add(jLabelList.get(j));
        }
        
        
    }

}
