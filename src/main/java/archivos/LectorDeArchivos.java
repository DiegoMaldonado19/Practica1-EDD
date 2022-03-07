/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JTextArea;

/**
 *
 * @author ACER
 */
public class LectorDeArchivos {
    
    /**
     * Metodo para poder leer un archivo de texto
     * @param archivo   archivo previamente seleccionado
     * @param text  area de texto a donde agregamos los datos leidos de este archivo
     * @throws FileNotFoundException
     * @throws IOException 
     */
     public void leerFichero(File archivo, JTextArea text) throws FileNotFoundException, IOException {
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
   
        String linea;
    
        while((linea = br.readLine()) != null){
            text.append(linea+"\n");
        }
        fr.close();
    }

}
