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
        this.frame.btnPunto4.addActionListener(this);
        this.frame.btnPunto5.addActionListener(this);
        this.frame.btnPunto6.addActionListener(this);
        this.frame.btnPunto7.addActionListener(this);
        this.frame.btnIntegrantes.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Si el origen de la accion es btnPunto1
        if (e.getSource() == frame.btnPunto1) {
            frmPunto1 punto1 = new frmPunto1(frame);
            CtrlPunto1 ctrl = new CtrlPunto1(punto1);
            frame.setVisible(false);
        } else if (e.getSource() == frame.btnPunto2) {
            frmPunto2 punto2 = new frmPunto2(frame);
            CtrlPunto2 Ctrl = new CtrlPunto2(punto2);
            frame.setVisible(false);
        } else if (e.getSource() == frame.btnPunto3) {
            frmPunto3 punto3 = new frmPunto3(frame);
            CtrlPunto3 Ctrl = new CtrlPunto3(punto3);
            frame.setVisible(false);
        } else if (e.getSource() == frame.btnPunto4) {
            frmPunto4 punto4 = new frmPunto4(frame);
            CtrlPunto4 Ctrl = new CtrlPunto4(punto4);
            frame.setVisible(false);
        } else if (e.getSource() == frame.btnPunto5) {
            FrmPunto5 punto5 = new FrmPunto5(frame);
            CtrlPunto5 Ctrl = new CtrlPunto5(punto5);
            frame.setVisible(false);
        } else if (e.getSource() == frame.btnPunto6) {
            FrmPunto6 punto6 = new FrmPunto6(frame);
            CtrlPunto6 Ctrl = new CtrlPunto6(punto6);
            frame.setVisible(false);
        } else if (e.getSource() == frame.btnPunto7) {
            frmPunto7 punto7 = new frmPunto7(frame);
            CtrlPunto7 Ctrl = new CtrlPunto7(punto7);
            frame.setVisible(false);
        }else if (e.getSource() == frame.btnIntegrantes) {
            diaIntegrantes frm = new diaIntegrantes(this.frame, true);
            frm.setLocationRelativeTo(null);
            frm.setVisible(true);
        }
    }
}
