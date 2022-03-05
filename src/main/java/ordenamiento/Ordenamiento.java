/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamiento;

/**
 *
 * @author ACER
 */
public class Ordenamiento {
    
    public static void quickSort(String[] array, int inicio, int fin){
        // index for the "left-to-right scan"
        int i = inicio;
       
        int j = fin;

        // only examine arrays of 2 or more elements.
        if (j - i >= 1)
        {
            // The pivot point of the sort method is arbitrarily set to the first element int the array.
            String pivote = array[i];
            // only scan between the two indexes, until they meet.
            while (j > i)
            {
                // from the left, if the current element is lexicographically less than the (original)
                // first element in the String array, move on. Stop advancing the counter when we reach
                // the right or an element that is lexicographically greater than the pivot String.
                while (array[i].compareTo(pivote) <= 0 && i < fin && j > i){
                    i++;
                }
                // from the right, if the current element is lexicographically greater than the (original)
                // first element in the String array, move on. Stop advancing the counter when we reach
                // the left or an element that is lexicographically less than the pivot String.
                while (array[j].compareTo(pivote) >= 0 && j > inicio && j >= i){
                    j--;
                }
                // check the two elements in the center, the last comparison before the scans cross.
                if (j > i)
                    cambio(array, i, j);
            }
            // At this point, the two scans have crossed each other in the center of the array and stop.
            // The left partition and right partition contain the right groups of numbers but are not
            // sorted themselves. The following recursive code sorts the left and right partitions.

            // Swap the pivot point with the last element of the left partition.
            cambio(array, inicio, j);
            // sort left partition
            quickSort(array, inicio, j - 1);
            // sort right partition
            quickSort(array, j + 1, fin);
        }
    }
    
    /**
     * This method facilitates the quickSort method's need to swap two elements, Towers of Hanoi style.
     */
    private static void cambio(String[] array, int i, int j){
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
