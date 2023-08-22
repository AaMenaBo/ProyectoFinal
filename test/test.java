
import Model.Lista;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author menab
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(fibonacci(10));
        System.out.println("\n----------------------------\n");
//        for (int i = 0; i <= 10; i++) {
            System.out.print(fibonacciRecursivo(10)+ ", ");
//        }
    }

    public static int fibonacci(int posicion) {
        int siguiente = 1, actual = 0, temporal = 0;
        for (int x = 1; x <= posicion; x++) {
            System.out.print(actual + ", ");
            temporal = actual;
            actual = siguiente;
            siguiente = siguiente + temporal;
        }
        return actual;
    }

    public static int fibonacciRecursivo(int posicion) {
        if (posicion < 2) {
            return posicion;
        }
        return fibonacciRecursivo(posicion - 1) + fibonacciRecursivo(posicion - 2);
    }

}
