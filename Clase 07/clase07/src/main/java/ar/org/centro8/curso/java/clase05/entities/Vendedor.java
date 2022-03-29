package ar.org.centro8.curso.java.clase05.entities;

public class Vendedor extends Persona {
    // cuando pongo extendes esta diciendo que hereda todos los atributos de Persona --> ( clase hija )
    // como hereda de persona, estoy obligado a usar saludar() solo si es abstracto.
    private int nroLegajo;
    private double sueldoBasico;

    public Vendedor(String nombre, int edad, Direccion direccion, int nroLegajo, double sueldoBasico) {
        super(nombre, edad, direccion); // super -> llama al constructor de la clase padre y envia los parametros.
        this.nroLegajo = nroLegajo;
        this.sueldoBasico = sueldoBasico;
    }


    //Override  -> tiene una anotacion override porque es una sobreescritura
    // TODO tree para saber las cosas que debemos hacer. 

    @Override
    public void saludar() {
        // TODO Auto-generated method stub
        System.out.println("Hola, Soy un vendedor");        
    }


    @Override
    public String toString() {
        return super.toString() + "Vendedor [nroLegajo=" + nroLegajo + ", sueldoBasico=" + sueldoBasico + "]";
    }
    //poniendo el super.toString trae los atributos del padre nombre,direccion etc.


    public int getNroLegajo() {
        return nroLegajo;
    }


    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }


    public double getSueldoBasico() {
        return sueldoBasico;
    }


    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }


        
}
