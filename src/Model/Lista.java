/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author menab
 */
public class Lista {

    private int[] numeros;
    private String[] nombres;

    public boolean agregar() {
        for (int i = 0; i < 30; i++) {
            if (numeros[i] == 0 && "".equals(nombres[i])) {
                numeros[i] = Recursos.Aleatorio.generar(30,1);
                nombres[i] = Recursos.Nombre.generar();
                return true;
            }
        }
        return false;
    }
    
    public boolean borrar() {
        for (int i = 29; i >= 0; i-=1) {
            if (numeros[i] != 0) {
                numeros[i] = 0;
                nombres[i] = "";
                return true;
            }
           
        }
        return false;
    }

    public Lista() {
        numeros = new int[30];
        for (int i = 0; i < 30; i++) {
            numeros[i] = 0;
        }
        nombres = new String[30];
        for (int i = 0; i < 30; i++) {
            nombres[i] = "";
        }
    }

    public void ordenar() {        
        for (int i = 0; i < 30 - 1; i++) {
            for (int j = 0; j < 30 - i - 1; j++){// Orden ascencente. Para descendente en esta línea cambiar > a <
                if (numeros[j] > numeros[j + 1] && numeros[j+1]!=0) {
                    // intercambiar posicione
                    int temp        = numeros[j];
                    String tempSt   = nombres[j];  
                    numeros[j]      = numeros[j + 1];
                    nombres[j]      = nombres[j+1]; 
                    numeros[j + 1]  = temp;
                    nombres[j+1]    = tempSt;
                }
            }
        }
    }
    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }

    public String[] getNombres() {
        return nombres;
    }

    public void setNombres(String[] nombres) {
        this.nombres = nombres;
    }
    public int getNum(int index){
        return numeros[index];
    }
    public String getSt(int index){
        return nombres[index];
    }

    @Override
    public String toString() {
        String rs = "";
        for (int i = 0; i < 30; i++) {
            rs += (i+1)+" || "+numeros[i]+" || "+nombres[i]+"\n";
        }
        return rs;        
    }
    
}


