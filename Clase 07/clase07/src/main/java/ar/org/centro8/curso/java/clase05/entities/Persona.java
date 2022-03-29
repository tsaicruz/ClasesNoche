package ar.org.centro8.curso.java.clase05.entities;


// un clase abstracta es una clase que no se puede instanciar, no se puede generar objetos de la clase persona
// para probar esta clase habria que sacarle el abstract para verificar en un test.
public abstract class Persona {
    private String nombre;
    private int edad;
    private Direccion direccion; // aca hereda la direccion Que hicimos en la clase anterior.


    // Este contrusctor dice que toda persona tiene una direccion si o si.
    public Persona(String nombre, int edad, Direccion direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    
    // cuando un metodo es void es porque no devuelve nada.
    // public void saludar(){
    //   System.out.println("Hola! Soy una persona!");
    // }

    public abstract void saludar(); // un metodo abstracto no tiene codigo/cuerpo



    @Override
    public String toString() {
        return "Persona [direccion=" + direccion + ", edad=" + edad + ", nombre=" + nombre + "]";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

}
