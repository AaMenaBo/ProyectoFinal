/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import javax.swing.JOptionPane;

/**
 *
 * @author Laribel
 */
public class Cola {
    
   
    private Nodo3 inicio;
    private Nodo3 finalcola;
    String cola ="";

    public Cola() {
        this.inicio = null;
        this.finalcola = null;
    }
    
    public boolean colaVacia(){
        if (inicio == null){
            return true;
        }else{
            return false;
        }
    }
    
     public void insertar(int numero){
         
         Nodo3 info = new Nodo3();
         info.numeros = numero; 
         info.siguiente = null; //ultimo de la lista
         
          if(colaVacia()){
             inicio= info;
             finalcola= info;
         }else{
             finalcola.siguiente = info;
             finalcola= info;
         }
         

     }
    
              //extraer la info
         
         public int extraerinfo(){
             
             if(!colaVacia()){
                 int  datos = inicio.numeros;
                 if(inicio== finalcola){
                     inicio= null;
                     finalcola= null;
                 }else{
                     inicio= inicio.siguiente;
                 }
                 return datos;
             }else{
                  return Integer.MAX_VALUE;
             }       
         }
         
         //mostrar los datos
         
         public void mostrarDatos(){
             
             Nodo3 proceso = inicio;
             
             String colainvertida = "";
             
             while(proceso!=null){
                 
                 cola+= proceso.numeros+ " ";
                 proceso= proceso.siguiente;
                 
             }
             
             String cadena[]= cola.split(" "); //invertir cadena
             
             for(int i = cadena.length -1 ; i >= 0; i--){
                 
                 colainvertida += " " + cadena[i]; 
                 
             }
             JOptionPane.showMessageDialog(null, colainvertida);
             cola= "";
         }

}
