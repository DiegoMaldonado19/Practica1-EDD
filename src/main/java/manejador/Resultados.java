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
public class Resultados {
    public int[] crearResultado(String texto){
        String[] campos = texto.split(",");
        
        int[] resultado = new int[campos.length];
        
        
        for(int i=0; i<campos.length; i++){
            resultado[i] = Integer.valueOf(campos[i]);
        }
        
        return resultado;
    }
    
    
    public void calculoResultados(Apuesta[] apuestas, int[] resultados){
        for(Apuesta a: apuestas){
            if(a.isIsCorrecta()){
                a.setPuntaje(otorgarPuntaje(a.getPosicionesCaballos(), resultados));
            }
        }
    }
    
    
    public static int otorgarPuntaje(int[] posicionesCaballos, int[] resultados){
       int puntos=10;
       int totalPuntos=0;
       for(int i=0; i<10; i++){
          if(posicionesCaballos[i]==resultados[i]){
              totalPuntos =+ totalPuntos + (puntos-i);
          }
       }
       
       return totalPuntos;
    }
}
