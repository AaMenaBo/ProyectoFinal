/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author menab
 * @param <V>
 */
public class Nodo<V> {
 
    private V value;
    private Nodo<V> izq;
    private Nodo<V> der;
     /**
      * Crea un nuevo nodo
      * @param value Valor que contendra
      * @param izq  Puntero hacia nodo izquierdo
      * @param der Puntero hacia nodo derecho
      */
    public Nodo(V value, Nodo<V> izq, Nodo<V> der) {
        super();
        this.value = value;
        this.izq = izq;
        this.der = der;
    }
 
    public V getValue() {
        return value;
    }
 
    public void setValue(V value) {
        this.value = value;
    }
 
    public Nodo<V> getIzq() {
        return izq;
    }
 
    public void setIzq(Nodo<V> izq) {
        this.izq = izq;
    }
 
    public Nodo<V> getDer() {
        return der;
    }
 
    public void setDer(Nodo<V> der) {
        this.der = der;
    }
}
