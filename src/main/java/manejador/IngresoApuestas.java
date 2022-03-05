/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejador;




import javax.swing.JTextArea;
import modelo.Apuesta;
import manejador.VerificadorApuesta;

/**
 *
 * @author ACER
 */
public class IngresoApuestas {
    
    
    public  Apuesta[] ingresarApuestas(JTextArea text) {
        
        VerificadorApuesta verificador = new VerificadorApuesta();
        
        Apuesta[] apuestas = new Apuesta[text.getLineCount()];
        
        
        String[] lineas = text.getText().split("\n");
        
       
        for(int i=0; i<lineas.length; i++){
            String[] campos = separarLinea(lineas[i]);
            Apuesta apuesta = ConstructorDeApuestas.construirApuesta(campos);
            apuesta.setIsCorrecta(verificador.verificarApuesta(apuesta.getPosicionesCaballos()));
            if(apuesta!=null){
                apuestas[i] = apuesta;
            }
        }
            
        return apuestas;
    }
    
    public static String[] separarLinea(String linea){
        String[] campos = linea.split(",");
        return campos;
    }
    
}
