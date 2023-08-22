
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
        Lista list = new Lista();
        for (int i = 0; i <= 30; i++) {
            if (!list.agregar()) {
                System.out.println("ERROR");
            }
        }
        
        
        System.out.println(list);
    }

}
