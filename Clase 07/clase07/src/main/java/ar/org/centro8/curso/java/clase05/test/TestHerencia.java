package ar.org.centro8.curso.java.clase05.test;

import ar.org.centro8.curso.java.clase05.entities.Cliente;
import ar.org.centro8.curso.java.clase05.entities.Cuenta;
import ar.org.centro8.curso.java.clase05.entities.Direccion;
import ar.org.centro8.curso.java.clase05.entities.Persona;
import ar.org.centro8.curso.java.clase05.entities.Vendedor;

public class TestHerencia {

    public static void main(String[] args) {
        System.out.println("---- dir1 -- ");
        Direccion dir1 = new Direccion("Medrano", 161, "1", "a","Moron");
        System.out.println(dir1);

        System.out.println("--- dir2 ----");
        Direccion dir2 = new Direccion("Lima", 200 , "2", "B");     
        System.out.println(dir2);   

        /*
        Clases abstractcas :  un clase abstracta es una clase que no se puede instanciar
        no se puede generar objetos de la clase persona, si de clases hijas.
        
        Clase final : Es una clase que no puede tener clases hijas. Si se pueden crear objetos de la clase final

        Metodos Abstractos : Son metodos que no tienen cuerpo, es decir que no tienen codigo, solo pueden
        existir en clases abstractas, las clases que heredan deben implementar los metodos abstractos (son las clases
        que heredan las que deben ponerle codigo.) Un meotodo abstracto solo puede estar en una clase abstracta.
        
        */

        // de error porque es una clase abstracta y no se puede crear objetos de una clase persona.
        /*System.out.println("---- Persona 1 -----");
        Persona p1 = new Persona("Karina", 38, dir1);
        System.out.println(p1); 
        p1.saludar();

        System.out.println("---- Persona 2 --- ");
        Persona p2 = new Persona("Laura", 26, p1.getDireccion()); // aca pongo la misma casa que karina
        System.out.println(p2);
        p2.saludar();
        */

        System.out.println("--- Vendedor 1 ---- ");

        Vendedor v1 = new Vendedor("Nuria", 30, dir2, 1, 90000);
        System.out.println(v1);
        v1.saludar();

        System.out.println("---- Vendedor 2 ----- ");
        Vendedor v2 = new Vendedor("Mauro", 35, new Direccion("Lima", 22, "1", "a"), 2, 150000);
        System.out.println(v2);
        v2.saludar();

        //no se ve la direccion ni nada porque en el ToString hay que ponerle los atributos de persona, tengo que cambiar el private, a protected.
        //hay que ponerle el super.toString y hereda todos los atributos.
        

        System.out.println( "-- cuenta 1 --- ");
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



        // creamos cliente1 y cliente 2

        System.out.println("--- cliente 1 --- ");

        Cliente cliente1 = new Cliente("joaquin", 38, dir1, 1, cuenta1);
        System.out.println(cliente1);
        cliente1.saludar();

        System.out.println("-- cliente 2 ---- ");
        Cliente cliente2 = new Cliente("sergio", 38, dir2, 2, cuenta2);
        System.out.println(cliente2);
        cliente2.saludar();


        System.out.println(cliente1.getClass());// pido el objeto clase para saber de que clase es.
        System.out.println(cliente1.getClass().getName()); 
        System.out.println(cliente1.getClass().getSimpleName()); // nombre sencillo sin tener la ruta del paquete
        System.out.println(cliente1.getClass().getSuperclass().getSimpleName()); // Pido la superclase o la clase padre de cliente1 es Persona
        System.out.println(cliente1
                                .getClass()
                                .getSuperclass()
                                .getSuperclass()
                                .getName()); // la clase padre de Persona es object
        System.out.println(cliente1.getClass().getSuperclass().getSuperclass().getSuperclass()); // es null porque no tiene clase padre.
        System.out.println("".getClass().getName()); // para saber el padre de String
        System.out.println("".getClass().getSuperclass().getName()); // La clase de padre de String es Object

        Object obj = 2;
        obj="hola";
        obj=cliente1;
        //Object es un contenedor global.
      




        // polimorfismo  o poliformismo
        // en una variable de clase padre tener distintos tipos y que se comporten de difernete manera
        Persona p1 = new Vendedor("Diego", 2 , dir2, 4, 50000);         // no puedo crear objetos de la clase persona el bloqueo o la falta de visibilidad es hacia el constructor.
        Persona p2 = new Cliente("Maria", 22, dir1, 4, cuenta2);        // pero puedo usar  las clases hijas, 

        p1.saludar(); // saluda como vendedor
        p2.saludar(); // saluda como cliente   
        // ambos tienen comportamientos diferentes


        // p1 esta en un contenedor mas grande entonces no puede ser asignado, debo sacar la base de Vendedorp1 y debemos hacer
        // un Operador de casteo
        // El casteo es peligroso porque lo hace el programador, hay que entender las cosas para ponerlas en su orden.    
        Vendedor vx = (Vendedor)p1;
        // Operador ternario lo de abajo.
        Vendedor vy = (p1 instanceof Vendedor)?(Vendedor)p1:null;  // SI v1 es igual a vendedor trae true o false.

        // temas pendientes para la clase 7
        // 1er Trabajo practico (abrir planilla y fecha de entrega)
        // Interfaces 
        // polimorfismo con interfaces
        // Class.Forname y meta programacion
        // ApiReflect
        
        

        


    }
    
}
