/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejador;

import javax.swing.JOptionPane;
import modelo.Apuesta;

/**
 *
 * @author ACER
 */
public class ConstructorDeApuestas {
    
    /**
     * Metodo estatico para construir una apuesta en el cual casteamos los campos enviados
     * @param campos    arreglo de campos pertenecientes a una linea
     * @return 
     */
    public static Apuesta  construirApuesta(String[] campos){
        Apuesta apuesta = null;
        
        apuesta = new Apuesta(campos[0], Integer.valueOf(campos[1]), arregloToInt(campos));
        
        return apuesta;
    }
    
    /**
     * Metodo para castear un arreglo de tipo string a uno de tipo int
     * @param campos
     * @return 
     */
    public static int[]  arregloToInt(String[] campos){
             
        int[] intArray = new int[campos.length-2];
        
        for (int i = 2; i < campos.length; i++) {
            try {
                intArray[i-2] = Integer.parseInt(campos[i]);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No ha sido posible convertir de string a int: " + e.getMessage());
            }
        }
        return intArray;
    }
}

