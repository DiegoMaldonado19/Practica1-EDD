/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamiento;

import modelo.Apuesta;

/**
 *
 * @author ACER
 */
public class Ordenamiento {
    
    public static Apuesta[] ordenarApuesta(Apuesta[] apuestas, boolean alfabeticamente){
            if(alfabeticamente){
                quickSortAlfabetico(apuestas, 0, apuestas.length-1);
                return apuestas;
            }
            
            quickSortPuntaje(apuestas, 0, apuestas.length-1);
            return apuestas;     
    }
    
    public static void quickSortAlfabetico(Apuesta[] array, int inicio, int fin){
        
        int i = inicio;
       
        int j = fin;

        
        if (j - i >= 1)
        {
           
            String pivote = array[i].getNombreApostador();
           
            while (j > i)
            {
                
                while (array[i].getNombreApostador().compareTo(pivote) <= 0 && i < fin && j > i){
                    i++;
                }
                
                while (array[j].getNombreApostador().compareTo(pivote) >= 0 && j > inicio && j >= i){
                    j--;
                }
                
                if (j > i)
                    cambio(array, i, j);
            }
            
            cambio(array, inicio, j);
          
            quickSortAlfabetico(array, inicio, j - 1);
            
            quickSortAlfabetico(array, j + 1, fin);
        }
    }
    
    public static void quickSortPuntaje(Apuesta[] array, int inicio, int fin){
        
        int i = inicio;
       
        int j = fin;

        
        if (j - i >= 1)
        {
           
            int pivote = array[i].getPuntaje();
           
            while (j > i)
            {
                
                while (array[i].getPuntaje() >= pivote && i < fin && j > i){
                    i++;
                }
                
                while (array[j].getPuntaje() <= pivote && j > inicio && j >= i){
                    j--;
                }
                
                if (j > i)
                    cambio(array, i, j);
            }
            
            cambio(array, inicio, j);
          
            quickSortPuntaje(array, inicio, j - 1);
            
            quickSortPuntaje(array, j + 1, fin);
        }
    }
    
    
    private static void cambio(Apuesta[] array, int i, int j){
        Apuesta temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
