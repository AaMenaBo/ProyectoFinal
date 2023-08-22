/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Laribel
 */
public class Nodo2 {
 
    private Alumno punto;
    private Nodo2 siguente;


    
    public Nodo2(Alumno punto) {
        this.punto = punto;
    }

    public Nodo2() {
    }
   
      
    public Nodo2(String nombre, String apellido) {
        this.punto = new Alumno(nombre, apellido);
    }
    public Alumno getPunto() {
        return punto;
    }

    public void setPunto(Alumno punto) {
        this.punto = punto;
    }

    public Nodo2 getSiguente() {
        return siguente;
    }

    public void setSiguente(Nodo2 siguente) {
        this.siguente = siguente;
    }

}
