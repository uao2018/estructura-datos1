
package busquedas;

import java.util.*;
import java.util.Arrays;

public class Busquedas {

    public static void main(String[] args) {
        String[] frutas = new String[]{"banano","fresa","pera","kiwi","acai"};
        Arrays.sort (frutas);
        imprimirArreglo (frutas);
        int posicion = Arrays.binarySearch(frutas, "acai");
        System.out.println ("Posicion es: " + posicion);
        
        List <Integer> precios = new ArrayList <> ();
        precios.add (500);
        precios.add (200);
        precios.add (100);
        precios.add (600);
        precios.add (900);

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
