/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Recursos.Aleatorio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JProgressBar;
import javax.swing.Timer;

/**
 *
 * @author menab
 */
public class TimerCaballo {

    private JProgressBar bar;

    private Timer timer = new Timer(250, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            bar.setValue(bar.getValue() + Aleatorio.generar(5));
        }
    });

    public TimerCaballo(JProgressBar param) {
        this.bar = param;      
    }
    public void iniciar() {
        timer.start();
    }
    public void detener() {
        timer.stop();
    }
    public void reiniciar() {
        timer.restart();
    }
}
