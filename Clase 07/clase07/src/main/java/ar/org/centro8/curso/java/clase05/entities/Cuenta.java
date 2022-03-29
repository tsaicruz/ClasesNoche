package ar.org.centro8.curso.java.clase05.entities;

public final class Cuenta {

    // poner los codigos en privado y sacarle los setters para que no se puedan
    // modificar
    // los getters.
    // para tener controlado y bien hecho las cosas hay que tener (encapsulamiento)
    // atributos privados, contrusctores que exijan un estado minimo, y metodo
    // publicos
    // que permitan acceder al estado de forma controlada.

    private int numero;
    private String moneda;
    private double saldo; // no se ingresa como constructor porque las cuentas bancarias empiezan en 0

    public Cuenta(int numero, String moneda) {
        this.numero = numero;
        this.moneda = moneda;
    }

    // este metodo da integridad a la operacion -- se pide usuario clave
    // direccion, fecha , hora se emite un ticket.
    // todo esto esta dentro de este codigo, dando validez a la operacion.

    public void depositar(double monto) {
        this.saldo += monto;
    }

    public void debitar(double monto) {
        if (this.saldo >= monto) {
            saldo -= monto;
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }

    // Solo los metodos getters porque yo quiero infrormar el valor de los atributos
    // pero no quiero permitir el cambio del estado.

    @Override

    public String toString() {
        return "Cuenta [moneda=" + moneda + ", numero=" + numero + ", saldo=" + saldo + "]";
    }

    public int getNumero() {
        return numero;
    }

    public String getMoneda() {
        return moneda;
    }

    public double getSaldo() {
        return saldo;
    }

}
