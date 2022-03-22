public class Empleado {

    // para generar el constructor hay que apretar click derecho y seleecionar el que esta abajo de refactrorizar
    private int norLegajo;
    private String nombre;
    private String apellido;
    private double sueldoBasico;

    public Empleado(int norLegajo, String nombre, String apellido, double sueldoBasico) {
        this.norLegajo = norLegajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBasico = sueldoBasico;
    }


    @Override
    public String toString() {
        return "Empleado [apellido=" + apellido + ", nombre=" + nombre + ", norLegajo=" + norLegajo + ", sueldoBasico="
                + sueldoBasico + "]";
    }


    //Metodo get(y el get devuelve atributo) a sett(permite ingresar atributos y cambiarlo)
    public int getNorLegajo() {
        return norLegajo;
    }

    public void setNorLegajo(int norLegajo) {
        //insert into control(user,ip,fecha,hora,nombre terminal, accion)
        this.norLegajo = norLegajo;
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

    public double getsueldoBasico() {
        return sueldoBasico;
    }

    public void setsueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }
    
    

    
}