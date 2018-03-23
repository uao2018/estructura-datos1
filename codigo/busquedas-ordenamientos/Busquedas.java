// Uso de las funciones de busqueda de la librería de Java
package busquedas;

import java.util.*;
import java.util.Arrays;

public class Busquedas {

    public static void main(String[] args) {
		// Busqueda en Arreglos
        String[] frutas = new String[]{"banano","fresa","pera","kiwi","acai"};
        Arrays.sort (frutas);
        imprimirArreglo (frutas);
        int posicion = Arrays.binarySearch(frutas, "acai");
        System.out.println ("Posicion es: " + posicion);
        
		// Busqueda en listas
        List <Integer> precios = new ArrayList <> ();
        precios.add (500);
        precios.add (200);
        precios.add (100);
        precios.add (600);
        precios.add (900);

		// Iterativo
        int posicion1 = precios.indexOf(precios, 600);
        System.out.println ("Posicion es: " + posicion);

		// Binaria
        Collections.sort(precios);
        posicion = Collections.binarySearch(precios, 600);
        System.out.println ("Posicion es: " + posicion);
    }
    static void imprimirArreglo (String [] datos) {
        for (int  i=0; i < datos.length; i++) {
            System.out.print (datos [i]+ ", ");
        }
    }
    
}
