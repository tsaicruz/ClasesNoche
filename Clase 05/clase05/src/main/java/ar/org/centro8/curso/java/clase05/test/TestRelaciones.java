package ar.org.centro8.curso.java.clase05.test;

import ar.org.centro8.curso.java.clase05.entities.ClientePersona;
import ar.org.centro8.curso.java.clase05.entities.Cuenta;
import ch.qos.logback.core.net.server.ClientVisitor;


public class TestRelaciones {
    public static void main(String[] args) {
        /*
            Objetos MOCKS (En ingles es una sigla que singifica simulaciones)
            Testeo con objetos simulados.

            Tenemos visibilidad por defecto a clases del mismo paquete 
            y clases del paquete java.lang.

        */

        System.out.println("---cuenta1---");


        //Es importante ponerle al constrcutor un estado minimo, si no te crea un objeto sin estado.
        Cuenta cuenta1 = new Cuenta(1, "Arg$");

        cuenta1.depositar(50000);    
        cuenta1.depositar(80000);
        cuenta1.debitar(20000);
        System.out.println(cuenta1);


        System.out.println("-- cuenta2 --- ");

        Cuenta cuenta2 = new Cuenta(2, "ARg$");
        cuenta2.depositar(100000);
        cuenta2.debitar(50000);
        System.out.println(cuenta2);

        System.out.println("--- ClientePersona1---");
        ClientePersona clientePersona1 = new ClientePersona(1, "David", 26, new Cuenta(3,"Arg$"));
        clientePersona1.getCuenta().depositar(30000);
        // al cliente le pido la cuenta y luego deposito ej: .getCuenta().depositar
        System.out.println(clientePersona1); 

        System.out.println("-- ClientePersona2 -- ");
        // Esta persona es la conyuje de la persona una, por eso le asigno la misma cuenta
        // abajo justo donde dice clientePersona1.getCuenta apunto a la misma cuenta que clientepersona1.
        ClientePersona clientePersona2 = new ClientePersona(2, "Ana", 24, clientePersona1.getCuenta());
        clientePersona2.getCuenta().debitar(10000);
        System.out.println(clientePersona2);
        System.out.println(clientePersona1);
        

        //Temas pendientes.
        //Falta terminar constructores
        //tipo de datos referenciados
        //tipo de datos primivitos
    }
}
