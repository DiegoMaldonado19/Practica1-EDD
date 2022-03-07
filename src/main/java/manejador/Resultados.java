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
    
    /**
     * Metodo con el cual creamos un resultado
     * @param texto texto tomado de un textArea donde ingresamos las posiciones de los caballos
     * @return 
     */
    public int[] crearResultado(String texto){
        String[] campos = texto.split(",");
        
        int[] resultado = new int[campos.length];
        
        
        for(int i=0; i<campos.length; i++){
            resultado[i] = Integer.valueOf(campos[i]);
        }
        
        return resultado;
    }
    
    /**
     * Con este metodo enviamos los arreglos de posiciones de cada apuesta para calcular el puntaje del apostador
     * @param apuestas
     * @param resultados 
     */
    public void calculoResultados(Apuesta[] apuestas, int[] resultados){
        for(Apuesta a: apuestas){
            if(a.isIsCorrecta()){
                a.setPuntaje(otorgarPuntaje(a.getPosicionesCaballos(), resultados));
            }
        }
    }
    
    /**
     * Metodo para otorgar puntaje a cada apostador dependiendo de su arreglo de posiciones de caballos
     * @param posicionesCaballos
     * @param resultados
     * @return 
     */
    public static int otorgarPuntaje(int[] posicionesCaballos, int[] resultados){
       int puntos=10;
       int totalPuntos=0;
       for(int i=0; i<10; i++){
          if(posicionesCaballos[i]==resultados[i]){
              totalPuntos = totalPuntos + (puntos-i);
          }
       }
       
       return totalPuntos;
    }
}
