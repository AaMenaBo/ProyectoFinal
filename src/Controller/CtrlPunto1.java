/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.ArbolBinarioBusqueda;
import View.frmPunto1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author menab
 */
public class CtrlPunto1 implements ActionListener {

    private frmPunto1 frame;
    private int[] elementos = new int[]{15, 9, 20, 6, 14, 13, 17, 64, 72, 26, -1, -94};

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frame.btnIniciar) {
            //Creamos el Arbol binario de Busqueda
            ArbolBinarioBusqueda abb = new ArbolBinarioBusqueda();

            for (int i = 0; i < elementos.length; i++) {
                abb.insertarElemento(elementos[i]);
                sout("Insertando elemento " + elementos[i]);
            }

            sout("Número de elementos: " + abb.size());

            ArrayList<Integer> numerosOrdenadosAscedentemente = abb.obtenerElementosOrdenadosAscendentemente();
            sout("Lista de números ordenados ascendentemente: [ ");

            for (Integer numero : numerosOrdenadosAscedentemente) {
                sout(numero + " ");
            }
            sout("]\n");

            //Obtenemos los números ordenados descendentemente
            ArrayList<Integer> numerosOrdenadosDescedentemente = abb.obtenerElementosOrdenadosDescendentemente();
            sout("Lista de números ordenados descendentemente: [ ");

            for (Integer numero : numerosOrdenadosDescedentemente) {
                sout(numero + " ");
            }
            sout("]\n");

            sout("Realizamos diferentes búsquedas");
            if (abb.buscarElemento(20) != null) {
                sout("Elemento " + 20 + " encontrado ");
            } else {
                sout("Elemento " + 20 + " no encontrado");
            }

            if (abb.buscarElemento(72) != null) {
                sout("Elemento " + 72 + " encontrado");
            } else {
                sout("Elemento " + 72 + " no encontrado");
            }

            if (abb.buscarElemento(56) != null) {
                sout("Elemento " + 56 + " encontrado");
            } else {
                sout("Elemento " + 56 + " no encontrado");
            }

            if (abb.buscarElemento(6) != null) {
                sout("Elemento " + 6 + " encontrado");
            } else {
                sout("Elemento " + 6 + " no encontrado");
            }

            if (abb.buscarElemento(9) != null) {
                sout("Elemento " + 9 + " encontrado");
            } else {
                sout("Elemento " + 9 + " no encontrado");
            }

            //imprimimos estadisticas
            sout("Numero de iteraciones en la última búsqueda: " + abb.getNumeroIteracionesUltimaBusqueda());
            sout("Numero de iteraciones medio en las búsquedas: " + abb.getNumeroIteracionesMedioEnBusquedas());

            sout("Eliminamos nodos");
            sout("Eliminamos la raiz");
            abb.eliminarElemento(15);
            sout("Eliminamos nodos");
            abb.eliminarElemento(13);
            abb.eliminarElemento(14);
            abb.eliminarElemento(64);

            sout("Buscamos los elementos eliminado");
            if (abb.buscarElemento(15) != null) {
                sout("Elemento " + 15 + " encontrado");
            } else {
                sout("Elemento " + 15 + " no encontrado");
            }

            if (abb.buscarElemento(13) != null) {
                sout("Elemento " + 13 + " encontrado");
            } else {
                sout("Elemento " + 13 + " no encontrado");
            }

            if (abb.buscarElemento(14) != null) {
                sout("Elemento " + 14 + " encontrado");
            } else {
                sout("Elemento " + 14 + " no encontrado");
            }

            if (abb.buscarElemento(64) != null) {
                sout("Elemento " + 64 + " encontrado");
            } else {
                sout("Elemento " + 64 + " no encontrado");
            }

            numerosOrdenadosAscedentemente = abb.obtenerElementosOrdenadosAscendentemente();
            sout("Lista de números ordenados ascendentemente: [ ");

            for (Integer numero : numerosOrdenadosAscedentemente) {
                sout(numero + " ");
            }
            sout("]\n");

            numerosOrdenadosDescedentemente = abb.obtenerElementosOrdenadosDescendentemente();
            sout("Lista de números ordenados descendentemente: [ ");

            for (Integer numero : numerosOrdenadosDescedentemente) {
                sout(numero + " ");
            }
            sout("]\n");

            //Imprimimos el número de elementos que tenemos:
            sout("Número de elementos: " + abb.size());

        } else if (e.getSource() == frame.btnMostrar) {
            JOptionPane.showMessageDialog(frame, listaElementos(), "Lista de Elementos", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == frame.btnBorrar) {
            this.borrarDisplay();
        }
    }

    public CtrlPunto1(frmPunto1 param) {
        frame = param;
        frame.setLocationRelativeTo(frame);
        frame.setVisible(true);

        frame.btnIniciar.addActionListener(this);
        frame.btnMostrar.addActionListener(this);
        frame.btnBorrar.addActionListener(this);
    }

    private void sout(String line) {
        frame.display.setText(frame.display.getText() + "\n" + line);

    }

    private void borrarDisplay() {
        frame.display.setText("");
    }

    private String listaElementos() {
        String r = new String();

        for (int i = 0; i < elementos.length; i++) {
            r += String.valueOf(elementos[i]);
            if (i % 2 == 0) {
                r += "    ||    ";
            }
            if (i % 2 != 0 && i != 0) {
                r += "\n";
            }
        }
        return r;
    }
}
