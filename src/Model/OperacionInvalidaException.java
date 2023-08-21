/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author menab
 */
public class OperacionInvalidaException extends Exception {
  public OperacionInvalidaException() {}
  
  public OperacionInvalidaException(String mensaje) {
    super(mensaje);
  }
}
