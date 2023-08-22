/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

/**
 *
 * @author menab
 */
public class Fibonacci extends Thread{
    private JTextArea text;
    private boolean  mode;
    private static final int TEMPO = 300 ;
    
    public void run(){
        if (mode) {
            for (int i = 0; i <= 10; i++) {
                newLine(String.valueOf(fibonacci(i)));
                try {
                    Thread.sleep(TEMPO);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Fibonacci.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }else{
            for (int i = 0; i <= 10; i++) {
                newLine(String.valueOf(fibonacciRecursivo(i)));
                try {
                    Thread.sleep(TEMPO);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Fibonacci.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    // True  = Iterativo
    // false = Recursivo
    public Fibonacci(JTextArea param, boolean mode){
        text = param;
        this.mode = mode;
    } 
    private void newLine(String line){
        text.setText(text.getText()+"\n"+line);
    }
    
    private int fibonacci(int posicion) {
        int siguiente = 1, actual = 0, temporal = 0;
        for (int x = 1; x <= posicion; x++) {
            System.out.print(actual + ", ");
            temporal = actual;
            actual = siguiente;
            siguiente = siguiente + temporal;
        }
        return actual;
    }

    private int fibonacciRecursivo(int posicion) {
        if (posicion < 2) {
            return posicion;
        }
        return fibonacciRecursivo(posicion - 1) + fibonacciRecursivo(posicion - 2);
    }
}
