package todolist;

import java.time.LocalTime;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;



public class TodoList {
    public static void main(String[] args) {
        ListaTareas lt = new ListaTareas ();
               
        Tarea t1 = new Tarea ();     
        Tarea t2 = new Tarea ("Estudiar EDatos", LocalDate.of (2018,12,31), LocalTime.of(12, 2,55), 'A');
        Tarea t3 = new Tarea ("Asistir Ingles", LocalDate.of (2018,10,31), LocalTime.of(12, 2,55), 'A');
        Tarea t4 = new Tarea ("Ir a la U", LocalDate.of (2018,7,31), LocalTime.of(12, 2,55), 'A');

        lt.adicionar (t1);
        lt.adicionar (t2);
        lt.adicionar (t3);
        lt.adicionar (t4);
        
        
        int pos = lt.buscar (t4);
        System.out.println ("Pos:"+pos);
        
        lt.mostrar ();
        lt.ordenarNombres();
        System.out.println ("---");
        lt.ordenarFechas();
        lt.mostrar();
        System.out.println ("---");

     
        lt.mostrar ();    
    }
    
}

