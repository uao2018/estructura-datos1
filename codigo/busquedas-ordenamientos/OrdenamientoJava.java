
package ordenamientojava;

import java.util.*;

public class OrdenamientoJava {
    public static void main(String[] args) {
        // Ordenar un arreglo con Arrays.sort () que usa quicksort
        String[] frutas = new String[] {"Manzana","Pera", "Naranja", "Banano", "Fresa"};
        imprimirArreglo (frutas);
        Arrays.sort (frutas);
        imprimirArreglo (frutas);
        
        // Ordenar un ArrayList usra Collections.sort que usa mergesort
        List<Integer> precios = new ArrayList<Integer>();
        precios.add (500);
        precios.add (100);
        precios.add (200);
        precios.add (400);
        precios.add (300);
        imprimirLista (precios);
        Collections.sort (precios);
        imprimirLista (precios);
    }
    /* A utility function to print datos of size n */
    static void imprimirArreglo(Object arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
        /* A utility function to print datos of size n */
    static void imprimirLista(List lst) {
        int n = lst.size ();
        for (int i = 0; i < n; ++i) {
            System.out.print(lst.get (i) + " ");
        }
        System.out.println();
    }
    
}
