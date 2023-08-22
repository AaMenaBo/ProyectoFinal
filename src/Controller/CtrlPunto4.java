/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import View.frmPunto4;

/**
 *
 * @author menab
 */
public class CtrlPunto4 implements ActionListener{
    private frmPunto4 frame;
        
    @Override
    public void actionPerformed(ActionEvent e) {
        Fibonacci ite = new Fibonacci(frame.txtIterativo, true);
        Fibonacci rec = new Fibonacci(frame.txtRecursivo, true);
        ite.start();
        rec.start();
    }
    
    public CtrlPunto4(frmPunto4 param){
        frame = param;
        frame.setLocationRelativeTo(null);
        frame.btnInicio.addActionListener(this);
        
        
        frame.setVisible(true);
    }
    
}
