/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursos;

import java.util.Random;

/**
 *
 * @author menab
 */
public class Aleatorio {
    private static Random rand = new Random();
    
    public static int generar(int max, int min){
        return rand.nextInt(max-min+1)+min;
    }
    public static int generar(int max){
        return rand.nextInt(++max);
    }
}
