/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Lista;
import View.frmPunto7;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author menab
 */
class CtrlPunto7 implements ActionListener {

    private frmPunto7 frame;
    private Lista list;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frame.btnAgregar) {
            list.agregar();
        } else if (e.getSource() == frame.btnOrdenar) {
            list.ordenar();
        } else if (e.getSource() == frame.btnBorrar) {
            list.borrar();
        }
        CargarTabla ct = new CargarTabla(frame.Table, list);
        ct.start();
    }

    public CtrlPunto7(frmPunto7 param) {
        frame = param;
        list = new Lista();
        frame.setLocationRelativeTo(null);
        frame.Table.getColumnModel().getColumn(0).setPreferredWidth(50);
        frame.Table.getColumnModel().getColumn(1).setPreferredWidth(50);
        frame.Table.getColumnModel().getColumn(2).setPreferredWidth(250);

        CargarTabla ct = new CargarTabla(frame.Table, list);
        ct.start();

        frame.btnAgregar.addActionListener(this);
        frame.btnBorrar.addActionListener(this);
        frame.btnOrdenar.addActionListener(this);

        frame.setVisible(true);
    }

}
