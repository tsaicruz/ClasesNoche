package ar.org.centro8.curso.java.clase05.test;

import java.util.ArrayList;

import ar.org.centro8.curso.java.clase05.entities.Auto;
import ar.org.centro8.curso.java.clase05.entities.ClienteEmpresa;
import ar.org.centro8.curso.java.clase05.entities.ClientePersona;
import ar.org.centro8.curso.java.clase05.entities.Cuenta;
import ar.org.centro8.curso.java.clase05.entities.Gerente;
import ar.org.centro8.curso.java.clase05.entities.Peon;
import ar.org.centro8.curso.java.clase05.entities.Representante;


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

        Cuenta cuentaCliente = clientePersona1.getCuenta(); 
        // de cuenta cliente 1 le pido la cuenta y luego le deposito.   
        // creo una variable del tipo cuenta que la llamo cliente y le asigno el apuntador a la cuenta
        // del cliente
        cuentaCliente.depositar(30000);


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

        // cada vez que pongo un new dato quiere decir que estoy creando un nuevo espacio de memoria
        // en el caso del ejemplo de arriba ambos tienen el mismo estado por eso comparten el mismo
        // espacio de memoria. ( tipo de datos referenciados. )


        //TIPO DE DATOS PRIMITIVOS -> MIRAR LA FOTO
        /*
        INT NRO 1= 2 -> SE CREA UN LUGAR DE MEMORIA QUE VALE 2
        INT NRO 2 = NRO 1 -> SE CREA UNA COPIA DE LA VARIABLE QUE TIENE EL MISMO VALOR.
        INT NRO 2 = 4  -> MODIFICA EL NUMERO 2 Y MODIFICA EL VALOR A 4.
        PRINT(NRO1); -> ESTO IMPRIME 2.
        

        //TIPOS DE RELACIONES

        - Tipo de relacion

        - Asociación simple
        Un peon usa momentaneamente un auto ( no es de el, es momentaneo, no lo  tiene asignado para el)
        El peor no tiene un atributo del tipo auto es decir no depende del auto
        el peon se crea o nace sin auto 

        */
        Auto auto1 = new Auto("WV", "gol", "Blanco");
        Auto auto2 = new Auto("Citroen", "C4" , "Verde");

        Peon p1 = new Peon(1,"Mariana");
        Peon p2 = new Peon(2, "Javier");

        p1.usar(auto1);
        p2.usar(auto2);
        p1.usar(auto2);
        p2.usar(auto1);



        //Relacion de agregacion
        // Representate de ventas puede tener un aot
        // y ese auto puede ser compartido o cambiado
        // el auto puede existir en la empresa y puede romperse 
        // sin que deje de vivir el representante


        Representante r1 = new Representante(1, "Daniela");
        r1.cambiarAuto("ford", "Fiesta", "Negro");
        

        Representante r2 = new Representante(2, "Lorena", "Fiat", "Idea" , "Gris");
        // se crea ya con un auto y no puede pertencer a otra persona, pero si puede cambiar el auto
        r2.cambiarAuto("Reno", "Kangoo","Negro");
        // la relacion de agregacion es mas fuerte que la simple, ya tiene un atributo, y es mas duradera
        


        // Relacion de composición (no es deseada) Es de alto acomplamiento
        // - Ata el ciclo de vida - Alumno -> celular no esta atado
        // Ej. Si la persona tiene cabeza esta atado -> ej si se muere la cabeza MUERE EL ALUMNO.
        

        // el gerente tiene una limosina 
        // el gerente esta compuesto por una limosina
        // cuando ingresa un gerente nuevo, se le compra una limosina.
        // Cuando el gerente se da de baja,  se vende la limosina o se destruye.(no va a ser usada por nadie mas)
        Gerente g1 = new Gerente(1, "Jhon" , "Liclon", "Continental");


        System.out.println("--- ClienteEmpresa1 --- ");

        ClienteEmpresa clienteEmpresa1 = new ClienteEmpresa(1, "Todo Limpio srl", "Lima 22"); // aca se crea el clienteempresa1
        ArrayList<Cuenta> cuentas = clienteEmpresa1.getCuentas(); // no se crea un nuevo cliente.
        cuentas.add(new Cuenta(10 , "arg$"));        // indice 0
        cuentas.add(new Cuenta(11, "Reales"));       // indice 1
        cuentas.add(new Cuenta(12, "U$S"));          // indice 2


        cuentas.get(0).depositar(45000);
        cuentas.get(0).depositar(120000);
        cuentas.get(0).debitar(25000);
        cuentas.get(1).depositar(50000);
        cuentas.get(2).depositar(12000);
      
        System.out.println(clienteEmpresa1);
        for(int a=0; a<cuentas.size(); a++) System.out.println(cuentas.get(a));


        //VER DIAGRAMA DE HERENCIA EN LA FOTO
        /*
        UNA CLASE PADRE QUE EN ESTE CASO ES PERSONA, TRATA DE GENERALIZAR LO MAS POSIBLE LO QUE VAYA A TENER 
        SUS CLASES HIJAS(VENDEDOR Y CLIENTE) TODOS LOS VENDEDORES Y TODOS LOS CLIENTES SON PERSONAS QUE CONTIENEN
        TODOS LOS ATRIBUTOS DE LA CLASE PERSON

        LA HERENCIA NO HAY QUE FORZARLA , SE ENTRELAZA CON LA PALABRA "UN" UN AUTO ES UN VEHICULO UNA MOTO ES UN
        VEHICULO


        UN OBJETO DE UNA SUPER CLASE O CLASE PADRE NO TIENE VISIBILIDAD DEL MIEMRBO DE SUS CLASES HIJAS

        EL VENDEDOR RECIBE POR HERENCIA LA CLASE PERSONA( NOMBRE EDAD Y DIRECCION) Y ENCIMA AGREGA
        NRO LEGAJO , SUELDO BASICO Y PUEDE O NO PUEDE USAR SALUDAR Y TIENE VISIBILIDAD

        EXISTEN LAS HERENCIAS MULTIPLES QUE EN JAVA NO EXISTE. ES PROBLEMATICO
        HAY QUE TRASNFORMAR TODO EN RELACIONES SIMPLES EJEMPLO CLIENTE DARLE UNA RELACION SIMPLE CON PERSONA
        CLIENTE HEREDA PERSONA DATOS PERSONALES DE PERSONA.

        


        */

        

    }
}
