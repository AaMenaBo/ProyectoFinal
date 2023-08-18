/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursos;

import javax.swing.JOptionPane;

/**
 *
 * @author menab
 */
public class Mensaje {
    
    public static void Informativo(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, "Tarea Completada", JOptionPane.INFORMATION_MESSAGE);
    }
    public static void Error(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
}
