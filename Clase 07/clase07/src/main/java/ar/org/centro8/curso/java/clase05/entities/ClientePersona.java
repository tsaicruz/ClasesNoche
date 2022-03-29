package ar.org.centro8.curso.java.clase05.entities;

public class ClientePersona {
    private int nro;
    private String nombre;
    private int edad;
    private Cuenta cuenta;

    /*
     * Este constructor permite que un cliente pueda ser creado sin tener una
     * cuenta, se le puede agregar
     * despues una cuenta por set(setters)
     */
    //public ClientePersona(int nro, String nombre, int edad) {
    //    this.nro = nro;
    //    this.nombre = nombre;
    //    this.edad = edad;
    //}

    /*
    * Este constructor obliga a crear un cliente con una cuenta.
    * Una cuenta puede pertenecer a varios clientes
    */


    // si quiero que la cuenta sea de un solo cliente y no quiero que la compartam deberiamos quitar el constructor
    // y deberiamos agregar un contrusctor vacio .
    public ClientePersona(int nro, String nombre, int edad, Cuenta cuenta){
        this.nro = nro;
        this.nombre = nombre;
        this.edad = edad;
        this.cuenta = cuenta;
    }

    public ClientePersona(int nro, String nombre, int edad,int nroCuenta){
        this.nro = nro;
        this.nombre = nombre;
        this.edad = edad;
        this.cuenta = new Cuenta(nroCuenta, "arg$");
    };
    // aca arriba le creo la cuenta al cliente para que sea diferente al de arriba.  es propia del cliente
    // y es seguro porque no es un objeto cuenta compartido con otro cliente



    @Override
    public String toString() {
        return "ClientePersona [cuenta=" + cuenta + ", edad=" + edad + ", nombre=" + nombre + ", nro=" + nro + "]";
    }

    public int getNro() {
        return nro;
    }


    public String getNombre() {
        return nombre;
    }


    public int getEdad() {
        return edad;
    }


    public Cuenta getCuenta() {
        return cuenta;
    }
  

}
