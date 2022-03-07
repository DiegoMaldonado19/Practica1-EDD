/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejador;




import javax.swing.JTextArea;
import modelo.Apuesta;
import manejador.Verificador;

/**
 *
 * @author ACER
 */
public class IngresoApuestas {
    
    /**
     * Metodo para ingresar las apuestas a nuestro sistema
     * @param text  tomamos el texto del textArea el cual contiene todas las apuestas
     * @return 
     */
    public  Apuesta[] ingresarApuestas(JTextArea text) {
        
        Verificador verificador = new Verificador();
        
        Apuesta[] apuestas = new Apuesta[text.getLineCount()];
        
        
        String[] lineas = text.getText().split("\n");
        
        
        for(int i=0; i<lineas.length; i++){
            String[] campos = separarLinea(lineas[i]);
            Apuesta apuesta = ConstructorDeApuestas.construirApuesta(campos);
            apuesta.setIsCorrecta(verificador.verificarArreglo(apuesta.getPosicionesCaballos()));
            apuestas[i] = apuesta;
        }
            
        return apuestas;
    }
    
    /**
     * Metodo para separar en campos cada linea perteneciente al JTextArea
     * @param linea
     * @return 
     */
    public static String[] separarLinea(String linea){
        String[] campos = linea.split(",");
        return campos;
    }
    
}
