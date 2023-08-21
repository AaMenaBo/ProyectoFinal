/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Lista;
import javax.swing.JTable;

/**
 *
 * @author menab
 */
public class CargarTabla extends Thread{
    private JTable table;
    private Lista list;
    
    public void run(){
        for (int i = 0; i < 30; i++) {
            table.setValueAt(i+1, i, 0);
            table.setValueAt(list.getNum(i), i, 1);
            table.setValueAt(list.getSt(i), i, 2);
        }
    }
    
    public CargarTabla(JTable paramTable, Lista paramLista){
        table = paramTable;
        list = paramLista;
    }
}
