/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Nodo2;
import Model.Pila;
import Recursos.Mensaje;
import View.frmPunto2;
import View.FrmPunto5;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JProgressBar;

/**
 *
 * @author Laribel
 */
public class CtrlPunto5 implements ActionListener {
  
    private Pila pila;
    String opcion= "", info= "";
    private FrmPunto5 frame6;
    
    
     public CtrlPunto5( FrmPunto5 frame6) {
        this.frame6 = frame6;     
        this.pila = new Pila();
        this.frame6.btnPush.addActionListener(this);
        this.frame6.btnPop.addActionListener(this);
        this.frame6.setLocationRelativeTo(null);
        this.frame6.setVisible(true);
      
    }
  
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frame6.btnPush) {
                String nombre = frame6.txtNP.getText();
                String apellido = frame6.txtAP.getText();
                pila.push(new Nodo2(nombre,apellido)); 
        
                frame6.txtShow.setText(pila.mostrar());
        }
        
        
        if (e.getSource()== frame6.btnPop){
            
             Nodo2 nodo =pila.pop(); //obtenemos Nodo2
                frame6.txtShow.setText(pila.mostrar());
                     if (nodo!=null){
                         frame6.txtP.setText(nodo.getPunto().getNombre());
                         frame6.txtPa.setText(nodo.getPunto().getApellido());
                         frame6.txtShow.setText(pila.mostrar());
                        }
        }
    }

    
        
    

   
}
