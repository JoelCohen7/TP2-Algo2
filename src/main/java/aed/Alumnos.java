package aed;

import java.util.ArrayList;

public class Alumnos {
    
    public ArrayList<String> libretas;
    public int longitud;

    public Alumnos() {
        this.libretas = new ArrayList<>();
        this.longitud = 0;
    }

    public int longitud() {
        return this.longitud;
    }

    public ArrayList<String> libretas() {
        return this.libretas;
    }

    public void agregar_alumno(String libreta) {
        this.libretas.add(libreta);
        this.longitud ++;
    }
}
