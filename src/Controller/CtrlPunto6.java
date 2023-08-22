/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Cola;
import View.FrmPunto6;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Laribel
 */
public class CtrlPunto6 implements ActionListener {
    
   private FrmPunto6 frame5;
    
   Cola cola = new Cola();
   int colaNum=0;
    
     public CtrlPunto6( FrmPunto6 frame5) {
        this.frame5 = frame5;     
        this.frame5.btnAdd.addActionListener(this);
        this.frame5.btnAdd1.addActionListener(this);
        this.frame5.btnAdd2.addActionListener(this);
        this.frame5.setLocationRelativeTo(null);
        this.frame5.setVisible(true);
      
    }
  
    public void actionPerformed(ActionEvent e) {
        
          if (e.getSource() == frame5.btnAdd) {
              
              colaNum = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero"));
              cola.insertar(colaNum);
        }
        
          if (e.getSource() == frame5.btnAdd1 ) {
              
              if(!cola.colaVacia()){
                  JOptionPane.showMessageDialog(null,"Se extrajo el número "+ cola.extraerinfo());
              }else{
                            JOptionPane.showMessageDialog(null, "La cola esta vacÃ­a");

              }
                 
        }
          
          if (e.getSource() == frame5.btnAdd2 ) {
              
              cola.mostrarDatos();
        }
        
    }
      
}
