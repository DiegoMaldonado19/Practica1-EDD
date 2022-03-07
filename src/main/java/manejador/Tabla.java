/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejador;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class Tabla {
    public static void llenarTabla(JTable table, long tiempoPromedio, int promedioPasos, int mayorCantidadPasos, int menorCantidadPasos) {
        DefaultTableModel modelo = new DefaultTableModel();
        table.setModel(modelo);
        //Anadir columnas
        modelo.addColumn("Tiempo Promedio de Proceso de Apuestas, milisegundos");
        modelo.addColumn("Promedio de pasos");
        modelo.addColumn("Mayor cantidad de pasos");
        modelo.addColumn("Menor cantidad de pasos");
        
        modelo.addRow(new Object[]{tiempoPromedio, promedioPasos, mayorCantidadPasos, menorCantidadPasos});
    }
}
