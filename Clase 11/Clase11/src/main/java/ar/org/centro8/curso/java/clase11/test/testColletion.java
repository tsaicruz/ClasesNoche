package ar.org.centro8.curso.java.clase11.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import ar.org.centro8.curso.java.clase11.entities.Persona;

public class testColletion {
    public static void main(String[] args) {
        /*colecciones

         el primer problema de un vector es la estaticidad 
         se crea un vector de grado 4 y solo pueden aceptarse 4 objetos, son estaticos y no dinamicos.
         * lo estatico se puede arreglar dentro de java (Creando un vector auxiliar)
         * -----------------------------------------------------------------------------
         * la coleccion representa un vector hereda de collection  metodos como borrar ordenar agregar etc.
         * 
        */        
        Persona [] personas = new Persona[4];
        personas[0] = new Persona("Carla", "Peterson", 45);
        personas[1] = new Persona("Juan", "Caceres", 32);
        personas[2] = new Persona("Nuri", "Veccio", 28);
        personas[3] = new Persona("Shia", "Labeouff", 40);

        
        /* Recorremos el vector 
        for(int a=0; a<personas.length;a++){
            System.out.println(personas[a]);
        }
        */

        //recorrido forEach - por cada elemento -> por cada elemento sale una pastilla halls. el mismo for es el foreach
        //for (Persona persona : personas)
         //    System.out.println(persona);
        //se lee de atras para adelante, de la lista personas por cada elemento tengo una varaible que voy a llamar persona que es del tipo persona y la imprimo
        // hay que pensar la listas y vectores sin los indices

        Arrays.asList(personas).forEach(System.out::println); // lo recorre de la misma manera que arriba, personas es un vector y lo trasnformo en arraylist


        // interfaz list 
        // representa una lista tipo vector con indices, es dinamica y se pueden agregar todos los elementos que se quiera.
        // ante la duda siempre se usa ArrayList, Vector es vieja, pero hay que ver cual es la diferencia.
        // arraylist es mas rapido para agregar o borrar elementos
        // linkelist no es mas rapido qeu array pero es mas rapido para alistar los elementos.

        List list;
        list=new ArrayList();   //Es una lista dinamica, si le ponemos un numero entre parentesis significa que guarda en un espacio reservado dentro de la memoria (pero no lo usamos)
        
        //polimorfismo -> 
        // list= new LinkedList();

        // list = new Vector<>() por mas que sea obsoleto funciona pero mas lento


        list.add(new Persona("Gabriela", "Banda", 45)); //indice 0 
        list.add(new Persona("Juan", "Carlo", 18));     // indice 1 -> pasa a 2
        list.add("hola");                                    //indice 2 -> pasa a 3
        list.add(22);                                           //indice 3 -> pasa a 4
        list.add("Chau");                   //indice 3      -> pasa 5
        // el metodo add me agrega un metodo al final.
        list.add(1, "Miercoles"); // aca pongo que en el indice 1 voy agregar Miercoles y pasa a ser indice 1 y el 1 pasa al 2 y asi sucesivamente.
        list.remove(5); // remuevo el indice 5 que en este caso es el "Chau"
        
        System.out.println("----------------------------------------------------------");

        //Recorrido de indices con for (viejito)
       //    for(int a=0; a<list.size(); a++){
       //     listo size me devuelve la longitud 
       //   System.out.println(list.get(a));
       //     }

        // recorrido foreach
        // for (Object o : list) System.out.println(o);

 
        // metodo forEach() JDK 8 o superior
        //Java 8 dice que no hay que usar estructras para reccorer una lista, ni for ni while ni do while, etc
        //la estructura debe dar un metodo para autorecorrerse
        // list.forEach(o->System.out.println(o));     // lo tengo como metodo no como estructura, metodo de la lista. hay que escribir una expresion lamdba dentro de los parentesis
       
        /*list.forEach(o->{
            System.out.println(o);                              o es parametro de println
        });         // para poner mas sentencias.*/


        list.forEach(System.out::println); // la variable esta de forma implicita, con el operador :: digo que o es parametro del metodo println como el de arriba

    }
    
}
