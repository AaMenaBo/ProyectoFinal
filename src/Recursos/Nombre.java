/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursos;

/**
 *
 * @author menab
 */
public class Nombre {

    private static final String[] nombres = new String[]{"John", "Michael", "William", "David", "James", "Benjamin", "Christopher", "Daniel", "Matthew", "Joseph", "Samuel", "Andrew", "Robert", "Nicholas", "Anthony", "Emily", "Emma", "Olivia", "Sophia", "Isabella", "Mia", "Charlotte", "Amelia", "Harper", "Evelyn", "Abigail", "Elizabeth", "Grace", "Natalie", "Victoria"};
    private static final String[] apellidos = new String[]{"Sabo","Sachtjen","Sack","Sacket","Sackett","Sader","Sadler","Sagan","Smith","Johnson","Williams","Brown","Jones","Garcia","Miller","Davis","Roberts","Zimmerman","Hernandez","Lopez","Sanchez","Torres","Adams","Clark","Lewis","Lee","Hall","Allen","Young"};
    
    public static String generar(){
        return nombres[Aleatorio.generar(nombres.length-1)]+" "+ apellidos[Aleatorio.generar(apellidos.length-1)]+" "+apellidos[Aleatorio.generar(apellidos.length-1)];
    }
}
