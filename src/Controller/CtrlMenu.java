/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.frmPunto1;
import View.frmMenu;
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
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Si el origen de la accion es btnPunto1
        if (e.getSource() == frame.btnPunto1) {
            frmPunto1 punto1 = new frmPunto1(frame);
            punto1.setLocationRelativeTo(frame);
            punto1.setVisible(true);
            frame.setVisible(false);
            CtrlPunto1 ctrlPunto1 = new CtrlPunto1(punto1);
        }
    }
}
