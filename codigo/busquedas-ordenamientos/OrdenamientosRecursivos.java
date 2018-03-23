/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

/**
 *
 * @author lg
 */
public class OrdenamientosRecursivos {
    static int particionar (int arr[], int ini, int fin)     {
        int pivote = arr[fin]; 
        int i = (ini-1); // index of smaller element
        for (int j=ini; j<fin; j++)
        {
            // If current element is smaller than or
            // equal to pivote
            if (arr[j] <= pivote)
            {
                i++;
 
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
 
        // swap arr[i+1] and arr[fin] (or pivote)
        int temp = arr[i+1];
        arr[i+1] = arr[fin];
        arr[fin] = temp;
 
        return i+1;
    }
    static void quickSort(int datos[], int ini, int fin)
    {
        if (ini < fin)
        {
            /* pi is particionaring index, arr[pi] is 
              now at right place */
            int pi = particionar(datos, ini, fin);
 
            // Recursively sort elements before
            // particionar and after particionar
            quickSort(datos, ini, pi-1);
            quickSort(datos, pi+1, fin);
        }
    }

    static void mergeSort(int[] datos, int ini, int fin) {
        if (ini < fin) {
            int mitad = (ini + fin) / 2;
            mergeSort(datos, ini, mitad);
            mergeSort(datos, mitad + 1, fin);
            mezclar (datos, ini, mitad, fin);
        }
    }

    static void mezclar(int[] datos, int ini, int mitad, int fin) {
        int[] temporal = new int[datos.length];
        for (int i = ini; i <= fin; i++) {
            temporal[i] = datos[i];
        }

        int temporalIzquierda = ini;
        int temporalDerecha = mitad + 1;
        int actual = ini;

        while (temporalIzquierda <= mitad && temporalDerecha <= fin) {
            if (temporal[temporalIzquierda] <= temporal[temporalDerecha]) {
                datos[actual] = temporal[temporalIzquierda];
                temporalIzquierda++;

            } else {
                datos[actual] = temporal[temporalDerecha];
                temporalDerecha++;
            }
            actual++;
        }

        int resto = mitad - temporalIzquierda;
        for (int i = 0; i <= resto; i++) {
            datos[actual + i] = temporal[temporalIzquierda + i];
        }
    }

    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        imprimirArreglo(arr);
        int n = arr.length;

        quickSort(arr, 0, n-1);
        imprimirArreglo(arr);

    }

    /* A utility function to print datos of size n */
    static void imprimirArreglo(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
