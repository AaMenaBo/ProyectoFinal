/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.frmPunto2;
import java.util.ArrayList;
import javax.swing.JProgressBar;

/**
 *
 * @author menab
 */
public class ReinicioPunto2 extends Thread{
    private ArrayList<JProgressBar> frame;
    
    public void run(){
       
    }
    public ReinicioPunto2(ArrayList<JProgressBar> frame){
        for(JProgressBar bar: frame){
            bar.setValue(0);
        }
    }
}
