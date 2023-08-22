/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Laribel
 */
public class Pila {
    
    
    private Nodo2 tope;
    private int total;

    public Pila() {
        this.tope = tope;
        this.total = total;
    }
    
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    public boolean estaVacia(){
        if (tope== null){
            return true;
        }
          return false;
          
    }
    
    public void push(Nodo2 nodo){
        if(!estaVacia()){
           nodo.setSiguente(tope);
        } 
            tope= nodo; 
        
        
    }
    
    public Nodo2 pop(){
        Nodo2 aux= null;
        if(!estaVacia()){
            aux=tope;
          tope= tope.getSiguente();
        } 
         return aux;
              
    }
    
    public String mostrar(){
        String resultado = "";
        Nodo2 aux = tope;
         while(aux!= null){
             resultado = resultado + aux.getPunto().getNombre() + " " + aux.getPunto().getApellido()+ ",";
             aux= aux.getSiguente();
         }
         return resultado;
    }

    
}
