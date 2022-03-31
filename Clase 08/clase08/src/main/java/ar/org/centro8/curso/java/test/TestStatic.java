package ar.org.centro8.curso.java.test;

import ar.org.centro8.curso.java.entities.Auto;

public class TestStatic {
    public static void main(String[] args) {
        /*
            Modificador static:
            Los miemrbos estaticos(atributos o metodos) pertenecen a la clase y no a los objetos de la misma. // pueden ser usados sin crear un objeto de la clase 
            Los miembros estaticos pueden ser llamados sin crear un objeto de la clase.
            Los atributos estaticos q ue sean llamados desde un método. Requiere que el método sea estatic.

            CUIDADO... NO ABUSAR DEL STATIC PORQUE NO ES PROGRAMACION ORIENTADA A OBJETOS!!!!!!!!!!!!!!!!!!!!!
            FINAL ES QUE NUNCA PUEDE CAMBIAR.
            Si yo lo declaro Static quiere decir que todo queda de la misma manera, ejemplo -> autos de color azul todos son azules.
            Tienen un valor en clase pero no en cada objeto que hagamos difernetes.


        */


        System.out.println("Hola");

    /*
        System.out.println("--auto1--");

        Auto auto1 = new Auto("Fiat", "Idea","Verde");
        auto1.acelerar(20);
        System.out.println(auto1 + " " + auto1.getVelocidad());

        // el problema de que la clase sea estatica es que cuando acelero el auto 1, y acelero el auto 2, acelero todos los objetos que se crean
        // por eso en el auto 2, va a dar 40, porque ya en el primer objeto lo inicie en 20 y luego se suma los 20 del auto 2, la velocidad
        // pertenece a la clase

        System.out.println("--Auto2--");
        Auto auto2 = new Auto("WV", "Gol", "Blanco");
        auto2.acelerar(20);
        System.out.println(auto2 + " " + Auto.getVelocidad());

        */


        Auto.acelerar(10);
        
        System.out.println("--auto1--");

        Auto auto1 = new Auto("Fiat", "Idea","Verde");
        Auto.acelerar(20);
        System.out.println(auto1 + " " + Auto.getVelocidad());

        System.out.println("--Auto2--");
        Auto auto2 = new Auto("WV", "Gol", "Blanco");
        Auto.acelerar(20);
        System.out.println(auto2 + " " + Auto.getVelocidad());

        /* ventajas
        - Se guardan en un lugar de memoria en donde se pueden usar mas rapido y consume menos memoria.
        - Se pueden usar los miembros estaticos sin llamar a la clase

        // desventajas
        - En la vida real no es aplicable - ej, clase persona con dos personas, si alguno viene con dos brazos no es aplicable.
        - Siempre hay una excepcion en las reglas
           
        */
    }

}
