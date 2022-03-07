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
    
    /**
     * Metodo que sirve para saber que tipo de ordenamiento solicita el usuario
     * @param apuestas  arreglo de apuestas
     * @param alfabeticamente   booleana que nos sirve para saber si es un orden alfabetico o por puntaje
     * @return 
     */
    public static Apuesta[] ordenarApuesta(Apuesta[] apuestas, boolean alfabeticamente){
            if(alfabeticamente){
                quickSortAlfabetico(apuestas, 0, apuestas.length-1);
                return apuestas;
            }
            
            quickSortPuntaje(apuestas, 0, apuestas.length-1);
            return apuestas;     
    }
    
    /**
     * Metodo quicksort que fue el elegido como metodo de ordenamiento 
     * @param array arreglo de apuestas
     * @param inicio   valor entero del indice principal en este caso siempre cero
     * @param fin   valor entero del indicie final que seria el tamaño del arreglo menos uno
     */
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
    
    /**
     * Metodo quicksort para ordenar por punteos
     * @param array arreglo de apuestas
     * @param inicio    valor entero que es el inicio de nuestro arreglo siempre sera cero
     * @param fin   valor entero que el indice final de nuestro arreglo 
     */
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
    
    
    /**
     * Metodo para agilizar el cambio de elementos dentro del arreglo
     * @param array arreglo de apuestas
     * @param i iterador i
     * @param j iterador j
     */
    private static void cambio(Apuesta[] array, int i, int j){
        Apuesta temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
