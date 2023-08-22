/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Recursos.Mensaje;
import View.frmPunto2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JProgressBar;
import javax.swing.Timer;

/**
 *
 * @author menab
 */
public class CtrlPunto2 implements ActionListener {

    private frmPunto2 frame;
    private ArrayList<TimerCaballo> hilos;
    protected ArrayList<JProgressBar> barras;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frame.btnIniciar) {
            for (TimerCaballo timer : hilos) {
                timer.iniciar();
            }
            verificar.start();
            frame.btnIniciar.setEnabled(false);
        }
    }
    private Timer verificar = new Timer(10, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < barras.size(); i++) {
                if (barras.get(i).getValue() >= 100) {
                    for (int f = 0; f < hilos.size(); f++) {
                        hilos.get(f).detener();
                    }
                    fin(i);
                    ReinicioPunto2 r = new ReinicioPunto2(barras);
                    r.start();
                    break;
                }
            }
        }
    });

    public CtrlPunto2(frmPunto2 param) {
        frame = param;
        hilos = new ArrayList<>();
        barras = new ArrayList<>();

        frame.btnIniciar.addActionListener(this);
        barras.add(frame.pbCab1);
        barras.add(frame.pbCab2);
        barras.add(frame.pbCab3);
        barras.add(frame.pbCab4);

        for (JProgressBar bar : barras) {
            hilos.add(new TimerCaballo(bar));
        }
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void fin(int winner) {
        Mensaje.Informativo("El ganador es caballo " + (winner+1));
        frame.btnIniciar.setEnabled(true);
    }
}
