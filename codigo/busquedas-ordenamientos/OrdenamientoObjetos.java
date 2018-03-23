
package ordenamientoobjetos;

import java.util.Arrays;

class Fruta implements Comparable<Fruta>{
    public String nombre;
    public int precio;
    
    public Fruta (String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    public String toString () {
        return nombre + ", " + precio;
    }
    
    public int compareTo (Fruta otraFruta){
        int precioOtraFruta = otraFruta.precio;
        String nombreOtraFruta = otraFruta.nombre;
        return nombre.compareTo(nombreOtraFruta);
    }
}
public class OrdenamientoObjetos {   
    public static void main(String[] args) {
        Fruta[] arrFrutas = new Fruta [4];
        Fruta banana  = new Fruta ("banana", 400);
        Fruta pera    = new Fruta ("pera", 300);
        Fruta acai    = new Fruta ("acai", 500);
        Fruta manzana = new Fruta ("manzana", 100);
        
        arrFrutas [0] = banana;
        arrFrutas [1] = pera;
        arrFrutas [2] = acai;
        arrFrutas [3] = manzana;
        
        imprimirArreglo (arrFrutas);
        arrFrutas. (arrFrutas);
        imprimirArreglo (arrFrutas);
    }
     /* A utility function to print datos of size n */
    static void imprimirArreglo(Object arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + "; ");
        }
        System.out.println();
    }
}
