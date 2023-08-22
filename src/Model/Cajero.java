/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author menab
 */
public class Cajero {
    private double value;

    public double getValue() {
        return value;
    }
    
    public void deposito(double cant) throws OperacionInvalidaException{
        if (cant <= 0) {
            throw new OperacionInvalidaException("Esta haciendo deposito con valor negativo");
        }else{
            value += cant;
        }
    }

    public void retiro(double cant) throws OperacionInvalidaException{
        if (value-cant < 0) {
            throw new OperacionInvalidaException("Esta retirando mas del saldo desponible");
        }else{
            value -= cant;
        }
    }
    
    public Cajero(){
        value = 0;   
    }
    public Cajero(double value){
        this.value = value;
    }
      
    
    
}
