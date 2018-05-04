package todolist;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

public class ListaTareas {

    // Atributos
    public List<Tarea> lista;

    public ListaTareas() {
        lista = new <Tarea> LinkedList();
    }

    int longitud() {
        return lista.size();
    }

    void adicionar(Tarea t) {
        lista.add(t);
    }

    void eliminar(int pos) {
        lista.remove(pos);
    }

    Tarea obtener(int pos) {
        return lista.get(pos);
    }

    int buscar(Tarea x) {
        int i = 0;
        for (Tarea t : lista) {
            if (t.compareTo(x) == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    void mostrar() {
        for (Tarea t : lista) {
            t.mostrar();
        }
    }

    void ordenarNombres() {
        Collections.sort(lista);

    }

    void ordenarFechas() {
        Collections.sort(lista, new CompararPorFechas());
    }
}

class CompararPorFechas implements Comparator<Tarea> {

    public int compare(Tarea t1, Tarea t2) {
        return t1.fecha.compareTo(t2.fecha);
    }
}

