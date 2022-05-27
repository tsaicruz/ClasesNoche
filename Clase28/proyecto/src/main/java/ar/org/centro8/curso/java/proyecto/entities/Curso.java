package ar.org.centro8.curso.java.proyecto.entities;

import ar.org.centro8.curso.java.proyecto.enums.Dia;
import ar.org.centro8.curso.java.proyecto.enums.Turno;

public class Curso {
    private int id;
    private String titulo;
    private String profesor;
    private Dia dia;
    private Turno turno;

    public Curso() {
    }

    public Curso(String titulo, String profesor, Dia dia, Turno turno) {
        this.titulo = titulo;
        this.profesor = profesor;
        this.dia = dia;
        this.turno = turno;
    }

    public Curso(int id, String titulo, String profesor, Dia dia, Turno turno) {
        this.id = id;
        this.titulo = titulo;
        this.profesor = profesor;
        this.dia = dia;
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Curso [dia=" + dia + ", id=" + id + ", profesor=" + profesor + ", titulo=" + titulo + ", turno=" + turno
                + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public Dia getDia() {
        return dia;
    }

    public void setDia(Dia dia) {
        this.dia = dia;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    
    
}
