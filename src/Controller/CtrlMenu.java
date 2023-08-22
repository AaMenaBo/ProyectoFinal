/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author menab
 */
public class CtrlMenu implements ActionListener {

    private frmMenu frame;

    //Constructor Controlador
    public CtrlMenu(frmMenu frame) {
        //Guardar Frame en Variable
        this.frame = frame;

        //Agregar ActionListener a los Botones
        this.frame.btnPunto1.addActionListener(this);
        this.frame.btnPunto2.addActionListener(this);
        this.frame.btnPunto3.addActionListener(this);
        this.frame.btnPunto5.addActionListener(this);
        this.frame.btnPunto7.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Si el origen de la accion es btnPunto1
        if (e.getSource() == frame.btnPunto1) {
            frmPunto1 punto1 = new frmPunto1(frame);
            CtrlPunto1 ctrlPunto1 = new CtrlPunto1(punto1);
            frame.setVisible(false);
        }else if(e.getSource() == frame.btnPunto2){
            frmPunto2 punto2 = new frmPunto2(frame);
            CtrlPunto2 Ctrl = new CtrlPunto2(punto2);
            frame.setVisible(false);   
        }else if(e.getSource() == frame.btnPunto3){
            frmPunto3 punto3 = new frmPunto3(frame);
            CtrlPunto3 Ctrl = new CtrlPunto3(punto3);
            frame.setVisible(false);   
        }else if (e.getSource() == frame.btnPunto5) {
            FrmPunto5 punto5 = new FrmPunto5(frame);
            CtrlPunto5 Ctrl = new CtrlPunto5(punto5);
            frame.setVisible(false);          
        }else if(e.getSource() == frame.btnPunto7){
            frmPunto7 punto7 = new frmPunto7(frame);
            CtrlPunto7 Ctrl = new CtrlPunto7(punto7);
            frame.setVisible(false); 
         }   
    }
}