/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package archivos;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.Apuesta;

/**
 *
 * @author ACER
 */
public class EscritorDeArchivos{
    
    /**
     * Metodo para escribir archivos de texto y asi exportar las apuestas que se hayan ingresado
     * @param framePapa ventana Jframe la envio para poder mostrar mensajes al usuario
     * @param apuestas  arreglo que contiene todas las apuestas ingresadas
     */
    public void escribirArchivo(JFrame framePapa,Apuesta[] apuestas){
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        
 
        File fichero = null;
        PrintWriter pw = null;
       
            try {
                fichero = new File("Files/ApuestaExportada.txt");
                pw = new PrintWriter(fichero);
                
                pw.println("Archivo de Apuestas Exportado con fecha: "+dtf.format(LocalDateTime.now()));
                
                for(Apuesta apuesta: apuestas){
                    pw.println(apuesta.toString());
                }

                JOptionPane.showMessageDialog(framePapa, "Archivo generado con exito");
            } 
            catch (Exception ex) {
                    JOptionPane.showMessageDialog(framePapa, "Error al escribir el archivo");
                    try{
                        if(null != fichero){
                            pw.close();
                        }
                    }
                    catch(Exception e2){
                        JOptionPane.showMessageDialog(framePapa, "Ha ocurrido un error mientras se exportaba el archivo");
                    }
            }
    }
}


