package ar.org.centro8.curso.java.test;

public class TestVarios {
    public static void main(String[] args) {
            /*
         todas estas clases se encuentran en Java.lang
        
        Clase java.lang.Object 
                               Es la clase padre o superclases de todas las clases que existen en java.
                               Es un contenedor global( todos los objetos pueden ser contenidos adentro de un object) 
                               En el interior de la clase Object se define un comportamiento que es heredado a todos los objetos.
        */
        Object obj = new Object();

        // Clase internta (Inner clase) Solo existe en la ejecucion de este metodo y luego se destruye.
        class Dato{
            int dato;

            public Dato(int dato) {
                this.dato = dato;
            }
            
        }


        Dato d1 = new Dato(2);
        Dato d2 = d1; // son el mismo  objeto.
        Dato d3 = new Dato(d1.dato); // es un objeto distinto en memoria. No es ni d1 ni d2, pero tiene el mismo estado de dato
        Dato d4 = new Dato(4); // Tiene otro dato distinto
        String d5 = "2"; // es una clase distinta pero tiene un estado parecido.

        // metodo hashcode()
        System.out.println("d1.hashCode() = " + d1.hashCode());
        System.out.println("d2.hashCode() = " + d2.hashCode());
        System.out.println("d3.hashCode() = " + d3.hashCode());
        System.out.println("d4.hashCode() = " + d4.hashCode());
        System.out.println("d5.hashCode() = " + d5.hashCode());
        // cuando pido el metodo hash pido un id que java utiliza para idetnificarlo
        // si dos objetos tienen el mismo id, tienen el mismo lugar de memoria ejemplo d1 y d2 te devuelven el mismo hashcode.
        // el metodo hashcode devuelve int
        // el problema es que con un entero identifico a

        



        /*




         Clase java.lang.System




        
        Clase java.lang.String

*/



        
    }
    
}
