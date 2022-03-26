package ar.org.centro8.curso.java.clase05.entities;

import java.util.ArrayList;

public class ClienteEmpresa {
    private int nro;
    private String razonSocial;
    private String direccion;
    //private Cuenta[] cuentas; // tiene un vector porque tiene muchas cuentas, pero se hace con colecciones.
    private ArrayList<Cuenta> cuentas; // estoy diciendo que tengo una lista vector de cuentas.

    public ClienteEmpresa(int nro, String razonSocial, String direccion){
        this.nro=nro;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.cuentas = new ArrayList();
    }

    

    @Override
    public String toString() {
        return "ClienteEmpresa [cuentas=" + cuentas + ", direccion=" + direccion + ", nro=" + nro + ", razonSocial="
                + razonSocial + "]";
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }




}