
import Controller.CtrlMenu;
import Recursos.Aleatorio;
import View.frmMenu;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author menab
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        frmMenu frm = new frmMenu();
        frm.setVisible(true);
        CtrlMenu ctrl = new CtrlMenu(frm);
        
    }
    
}
/*
    EL proyecto esta pensado como un MVC, para cada vista hay un controlador
    la idea seria mantenerlo asi

    El funcionamiento basico del Menu esta listo
    cada que se vaya a agregar un ejercicio nuevo seria:
    - Agregar el boton al menu, deberia acomodarse solo
    - Añadir el AcionListener al boton en el contolador con 

        this.frame.[NOMBRE DEL BOTON].addActionListener(this)
    
    Toda la parte logica de datos, calulos, objetos el almacenen informacion 
    va en el paquete de Model
    Aquello que afecte la parte visual va en el paquete de Controller
    En el paquete de View solo deberian haber objetos graficos

    Tranten de mantener el orden para evitar fallos
*/