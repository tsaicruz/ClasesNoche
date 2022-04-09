package ar.org.centro8.curso.java.clase11.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

import ar.org.centro8.curso.java.clase11.entities.Persona;

public class testColletion {
    public static void main(String[] args) {
        /*
         * colecciones
         * 
         * el primer problema de un vector es la estaticidad
         * se crea un vector de grado 4 y solo pueden aceptarse 4 objetos, son estaticos
         * y no dinamicos.
         * lo estatico se puede arreglar dentro de java (Creando un vector auxiliar)
         * -----------------------------------------------------------------------------
         * la coleccion representa un vector hereda de collection metodos como borrar
         * ordenar agregar etc.
         * 
         */
        Persona[] personas = new Persona[4];
        personas[0] = new Persona("Carla", "Peterson", 45);
        personas[1] = new Persona("Juan", "Caceres", 32);
        personas[2] = new Persona("Nuri", "Veccio", 28);
        personas[3] = new Persona("Shia", "Labeouff", 40);

        /*
         * Recorremos el vector
         * for(int a=0; a<personas.length;a++){
         * System.out.println(personas[a]);
         * }
         */

        // recorrido forEach - por cada elemento -> por cada elemento sale una pastilla
        // halls. el mismo for es el foreach
        // for (Persona persona : personas)
        // System.out.println(persona);
        // se lee de atras para adelante, de la lista personas por cada elemento tengo
        // una varaible que voy a llamar persona que es del tipo persona y la imprimo
        // hay que pensar la listas y vectores sin los indices

        Arrays.asList(personas).forEach(System.out::println); // lo recorre de la misma manera que arriba, personas es
                                                              // un vector y lo trasnformo en arraylist

        // interface list
        // representa una lista tipo vector con indices, es dinamica y se pueden agregar
        // todos los elementos que se quiera.
        // ante la duda siempre se usa ArrayList, Vector es vieja, pero hay que ver cual
        // es la diferencia.
        // arraylist es mas rapido para agregar o borrar elementos
        // linkelist no es mas rapido qeu array pero es mas rapido para alistar los
        // elementos.

        List list;
        list = new ArrayList(); // Es una lista dinamica, si le ponemos un numero entre parentesis significa que
                                // guarda en un espacio reservado dentro de la memoria (pero no lo usamos)

        // polimorfismo ->
        // list= new LinkedList();

        // list = new Vector<>() por mas que sea obsoleto funciona pero mas lento

        list.add(new Persona("Gabriela", "Banda", 45)); // indice 0
        list.add(new Persona("Juan", "Carlo", 18)); // indice 1 -> pasa a 2
        list.add("hola"); // indice 2 -> pasa a 3
        list.add(22); // indice 3 -> pasa a 4
        list.add("Chau"); // indice 4 -> pasa 5
        // el metodo add me agrega un metodo al final.
        list.add(1, "Miercoles"); // aca pongo que en el indice 1 voy agregar Miercoles y pasa a ser indice 1 y el
                                  // 1 pasa al 2 y asi sucesivamente.
        list.remove(5); // remuevo el indice 5 que en este caso es el "Chau"

        System.out.println("----------------------------------------------------------");

        // Recorrido de indices con for (viejito)
        // for(int a=0; a<list.size(); a++){
        // listo size me devuelve la longitud
        // System.out.println(list.get(a));
        // }

        // recorrido foreach
        // for (Object o : list) System.out.println(o);

        // metodo forEach() JDK 8 o superior
        // Java 8 dice que no hay que usar estructras para reccorer una lista, ni for ni
        // while ni do while, etc
        // la estructura debe dar un metodo para autorecorrerse
        // list.forEach(o->System.out.println(o)); // lo tengo como metodo no como
        // estructura, metodo de la lista. hay que escribir una expresion lamdba dentro
        // de los parentesis

        /*
         * list.forEach(o->{
         * System.out.println(o); o es parametro de println
         * }); // para poner mas sentencias.
         */

        list.forEach(System.out::println); // la variable esta de forma implicita, con el operador :: digo que o es
                                           // parametro del metodo println como el de arriba

        // Uso de generics <> JDK 5 o sup, apartir de java 5 se puede decir que tipo de
        // dato es la lista
        // la definicion diamante indico el tipo de datos de la lista , la lista es del
        // tipo persona, no es object. dentro del array list new ArrayList<Persona>();
        // ahora ya no se hace falta y se saca
        List<Persona> list2 = new ArrayList<>();

        // cuando pongo list2. add te pide un objeto de persona
        list2.add(new Persona("Carlos", "Maria", 56));

        // quiero poner el primer elemesssnto de list entonces hago lo de abajo
        // hay que castearlo por que como sabemos que es una persona, es un contendor
        // mas grande y no puede ocuparlo en espacio. Persona p1 = list.get(1); esto
        // aqui no.
        Persona p1 = (Persona) list.get(0);
        // en p2 quiero poner el primer elemnto de la lista2
        // como tiene una seguridad de que devuelve una persona no hace falta que lo
        // casteemos.
        Persona p2 = list2.get(0);

        // copiar las personas del vector personas a list2
        // for(Persona p : personas) list2.add(p); // lo recorremos con un for
        // el addall me permite poner una coleccion de personas pero como personas es un
        // vector tengo que hacer array.adslist
        list2.addAll(Arrays.asList(personas));

        // copiar las personas de list a list2
        // list es del tipo object y contiene cualquier tipo de objetos, hay que
        // reccorrer el vector y preguntar si es del tipo persona
        // entonces hariamos lo de abajo
        // recorro y tengo una variable y pregunto si es instancia de persona
        list.forEach(o -> {
            if (o instanceof Persona)
                list2.add((Persona) o);
        });

        System.out.println("-----------------------------------------------------------------------");
        list2.forEach(System.out::println);

        // Set -> representan una lista como los list pero la diferencia es que no tiene
        // indice , un vector tiene un indice y valor el set
        // no, guarda los elementos sin indices, el mismo valor guardado es el mismo
        // indice, y como no se puede repetir la consecuencia es que
        // no hay valores duplicados. Si se trata de guardar un elemento igual no se
        // termina guardando.

        // interface Set
        Set<String> set;

        // implementacion HashSet: Almacena y recupera elementos de la forma mas veloz
        // posible, no garantiza el orden de los elementos
        // no tiene duplicados ni indices y se recupera en cualquier orden , sacar los // de abajo
        //set = new HashSet();

        // implementacion LinkedHashSet : Almacena elementos en una lista enlazadas por orrden de ingreso 
        // set = new LinkedHashSet();

        // implementacion TreeSet : almacena elementos en un arbol por orden natural, alfabeticamente y luego se puede preescribir
        set = new TreeSet();

        // abajo es un testeo de las cosas que tenemos arriba 

        set.add("Lunes");
        set.add("Martes");
        set.add("Miercoles");
        set.add("Sabado");
        set.add("Domingo");
        set.add("Lunes");
        set.add("Lunes");        
        set.add("Jueves");
        set.add("Domingo");
        // no puedo agregar ni borrar ni un indice porque no se trabaja con indices no tiene duplicados pero el orden es cualquier cosa
        set.forEach(System.out::println); 

        // cree un set de personas 
        Set<Persona> setPersonas;

        // agrego todas las personas de la lista a personas.
        // setPersonas = new LinkedHashSet<>();
        setPersonas = new TreeSet(); // para que el treeset pueda funcionar debe implementar la interface comparable 
        setPersonas.addAll(list2);
        setPersonas.add(new Persona("Nuri", "Veccio", 28));
        setPersonas.add(new Persona("Victor", "Morales", 28));
        setPersonas.add(new Persona("Beatriz", "Morales", 28));
        setPersonas.add(new Persona("Carlos", "Morales", 28));
        setPersonas.add(new Persona("Carlos", "Morales", 23));
        setPersonas.add(new Persona("Wahavi", "Morales", 28));
        
        // recorro 
        // setPersonas.forEach(System.out::println);
        // el set no deberia permitir el mismo objeto pero si no generamos los equals 
        // tengo que generar un equals and hashcode
        setPersonas.forEach(p->System.out.println(p+ " " +p.hashCode()));



        //interface Comparable   public class Persona implements Comparable <Persona> agregamos el implements comparable

        //pilas colas
        /*
                Pilas LIFO Last in First Out -> ultimo elemento entrar va a ser el primero en salir4
                Las clases Stack representa las pilas

                Colas FIFO -> First in First Out -> primero elemento en entrar es el primero en salir 

                En java tenemos las colas interface Queue 



        */




    }

}
