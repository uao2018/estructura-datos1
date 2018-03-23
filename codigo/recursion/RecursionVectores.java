
import java.util.*;

public class RecursionVectores {

    public static int suma(List<Integer> datos) {
        if (datos.size() == 0) {
            return 0;
        } else {
            int cabeza = datos.get(0);
            List cola = datos.subList(1, datos.size());
            return cabeza + suma(cola);
        }
    }

    public static boolean buscar(List<Integer> datos, int elemento) {
        if (datos.size() == 0) {
            return false;
        } else {
            int cabeza = datos.get(0);
            List cola = datos.subList(1, datos.size());

            if (cabeza == elemento) {
                return true;
            } else {
                return buscar(cola, elemento);
            }
        }
    }

    public static int buscarMayor(List<Integer> datos) {
        if (datos.size() == 1) {
            return -1;
        } else {
            if (datos.size() == 1) {
                return datos.get(0);
            } else {
                int cabeza = datos.get(0);
                List cola = datos.subList(1, datos.size());

                int mayorCola = buscarMayor(cola);
                if (cabeza > mayorCola) {
                    return cabeza;
                } else {
                    return mayorCola;
                }
            }
        }
    }

    public static List invertirLista(List<Integer> datos) {
        if (datos.size() == 0) {
            return datos;
        } else {
            int cabeza = datos.remove(0);
            invertirLista(datos);
            datos.add(cabeza);
            return datos;
        }
    }
    
    public static boolean busquedaBin (List <Integer> datos, int elemento) {
        if (datos.size () == 0)
            return false;
        else {
            int posMitad = datos.size()/2;
            int elementoMitad = datos.get (posMitad);
            if (elementoMitad == elemento)
                return true;
            else{
                if (elemento > elementoMitad) {  
                    List mitadArriba = datos.subList (posMitad+1, datos.size());
                    return busquedaBin (mitadArriba, elemento);
                }else {
                    List mitadAbajo = datos.subList (0, posMitad-1);
                    return busquedaBin (mitadAbajo, elemento);
                }
            }
        }
    }


    public static void main(String[] args) {
        List<Integer> datos = new ArrayList<Integer>(Arrays.asList(7, 5, 2, 9, 1, 15, 6, 3));

        int res = suma(datos);
        System.out.println("Suma: " + res);

        boolean resBuscar = buscar(datos, 1);
        System.out.println("Buscar: " + resBuscar);

        int resBuscarMayor = buscarMayor(datos);
        System.out.println("BuscarMayor: " + resBuscarMayor);

        List listaInversa = invertirLista(datos);
        System.out.println("Inverir lista: " + listaInversa);

        List<Integer> datos2 = new ArrayList<Integer>(Arrays.asList(1, 4, 7, 9, 15, 25, 27, 50));
         System.out.println("Datos2: " + datos2);
      
        boolean resBusBin = busquedaBin (datos2, 15);
        System.out.println("BuscarBin: " + resBusBin);


 
        // TODO code application logic here
    }

}
