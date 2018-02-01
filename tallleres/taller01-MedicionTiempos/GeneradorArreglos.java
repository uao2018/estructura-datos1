package principalordenamientos;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class GeneradorArreglos {
    // Genera un arreglo de numeros aleatorios con "max" elementos
    public int[] generar(int max ) {
        int[] arreglo = new int[max];
        ArrayList<Integer> array = new ArrayList<>();
        
        for (int i = 0; i < max; i++) {
            array.add (i);
        }
        Collections.shuffle(array);
        int i=0;
        for (Integer n : array) {
            arreglo [i++] = n;
        }
        return arreglo;
    }
}
