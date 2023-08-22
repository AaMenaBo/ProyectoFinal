/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Cajero;
import Model.OperacionInvalidaException;
import Recursos.Mensaje;
import View.frmPunto3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author menab
 */
public class CtrlPunto3 implements ActionListener{
    private frmPunto3 frame;
    private Cajero cuenta;
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frame.btnDeposito) {
            try {
                cuenta.deposito((double)frame.spValue.getValue());
                newLine("Deposito de "+frame.spValue.getValue()+" extitoso");
                frame.spValue.setValue((double)100.0);
            } catch (OperacionInvalidaException ex) {
                Mensaje.Error("Por favor evite usar coma o numeros negativos");
                newLine("Error en deposito");
            }
        }else if(e.getSource() == frame.btnRetiro){
            try {
                cuenta.retiro((double)frame.spValue.getValue());
                newLine("Retiro de "+frame.spValue.getValue()+ "exitoso");
            } catch (OperacionInvalidaException ex) {
                Mensaje.Error("Ësta intentado retirar mas del fondo disponible");
            }
        }else if (e.getSource() == frame.btnSaldo) {
            newLine("Saldo actual: "+cuenta.getValue());
        }
    }
    public CtrlPunto3(frmPunto3 param){
        frame = param;
        frame.setLocationRelativeTo(null);
        
        cuenta = new Cajero(100);
        
        frame.btnDeposito.addActionListener(this);
        frame.btnRetiro.addActionListener(this);
        frame.btnSaldo.addActionListener(this);
        
        newLine("Saldo actual: "+cuenta.getValue());
        
        frame.setVisible(true);
    }
    private void newLine(String line){
        frame.consola.setText(frame.consola.getText()+"\n"+line);
    }
    private void limpiarConsola(){
        frame.consola.setText("");
    }
    
}
