package todolist;

import java.io.Serializable;
import java.time.LocalTime;
import java.time.LocalDate;
import java.util.Comparator;

public class Tarea implements Comparable<Tarea>{
        
    String nombre;
    LocalDate fecha;
    LocalTime hora;
    char prioridad;
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public LocalTime getHora() {
        return hora;
    }
    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
    public char getPrioridad() {
        return prioridad;
    }
    public void setPrioridad(char prioridad) {
        this.prioridad = prioridad;
    }
    
    @Override
    public int compareTo (Tarea otraTarea){
        return nombre.compareTo (otraTarea.getNombre());
    }

    public Tarea () {
        nombre = "Sin Nombre";
        fecha  = LocalDate.now();
        hora   = LocalTime.now();
        prioridad = 'C';
    }
    public Tarea (String nNombre, LocalDate nFecha, LocalTime nHora, char nPrioridad) {
        nombre = nNombre;
        fecha = nFecha;
        hora  = nHora;
        prioridad = nPrioridad;
    }
    public void mostrar () {
        String valores = nombre + ", "+fecha+", "+hora+", "+prioridad;
        System.out.println (valores);
    }
    public String toString (){
        String valores = nombre + ", "+fecha+", "+hora+", "+prioridad;
        return valores;
    }
    
    
}

