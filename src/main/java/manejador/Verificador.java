/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejador;

import modelo.Apuesta;

/**
 *
 * @author ACER
 */
public class Verificador {
    public Boolean verificarArreglo(int[] caballos){
        
        boolean correcta=true;
        
        for(int i=0; i<caballos.length-1; i++){
            if(caballos[i]==caballos[i+1]){
                correcta = false;
            }
        }
        return correcta;
    }
}
