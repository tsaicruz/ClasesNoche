package ar.org.centro8.curso.java.clase11.entities;

import java.text.DecimalFormat;

public class Persona implements Comparable <Persona> {
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    //Override
    @Override
    public int compareTo(Persona para) {
        // esto tiene un problema que lo vemos abajo, cuando se hace la comapracion de las edades toma a 12 como menor que 9 y hay que completar con 00
        // garcia, ana , 009 
        // garcia, ana , 012 

        // ###,###,###.00 -> dos decimales y separador de miles ----------------VA A HACER FALTA PARA EL PROXIMO TRABAJO PRACTICO.---------------


        DecimalFormat df = new DecimalFormat("000"); // estoy diciendo que quiero 3 ceros
        // podria comprar el to String con el to String del obbjeto que ingresa como parametro.
        String thisPersona = (this.getApellido() + " , " + this.getNombre() + " , " + df.format(this.getEdad())).toLowerCase();
        String paraPersona = (para.getApellido() + " , " + para.getNombre() + " , " + df.format(para.getEdad())).toLowerCase(); // parametro persona.
        return thisPersona.compareTo(paraPersona); // compara los 2 Strings y devuelve 
       // return thisPersona.compareTo(paraPersona);*-1  para hacerlo al reves de menor a mayor.
    }


    @Override
    public String toString() {
        return "Persona [apellido=" + apellido + ", edad=" + edad + ", nombre=" + nombre + "]";
    }

    
// dos objetos con el mismo estado , son considerados el mismo objeto. aunque tengan diferentes espacio de
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
        result = prime * result + edad;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona other = (Persona) obj;
        if (apellido == null) {
            if (other.apellido != null)
                return false;
        } else if (!apellido.equals(other.apellido))
            return false;
        if (edad != other.edad)
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        return true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    
    

}
