package ar.org.centro8.curso.java.clase11.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;

import ar.org.centro8.curso.java.clase11.entities.Persona;

public class testReflect {

    public static void main(String[] args)  throws Exception{
        // clase 11
        // Api stream
        // es uno de los puntos mas oscuros porque no esta dentro de otros lenguajes
        // Trabajo de reflexion -> recibe un ojeto y lo investiga en tiempo de ejecucion
        // conocido como meta programacion.
        // se suele hacer para guardar en la base de datos

        Object o = new Persona("Ana", "Salas", 26);

        System.out.println(o.getClass());
        System.out.println(o.getClass().getName());
        System.out.println(o.getClass().getSimpleName()); // se obtiene nombre sin la ruta de paquetes.
        System.out.println(o.getClass().getSuperclass().getName()); // devuelve la java lang object.

        // campos de la clase
        Field[] campos = o.getClass().getDeclaredFields(); // me devuelve un vector con los atributos de la clase
        for (int a = 0; a < campos.length; a++) {
            System.out.println("--------------------");
            System.out.println(campos[a]);
            System.out.println(campos[a].getType().getName());
            System.out.println(campos[a].getModifiers());
            System.out.println(campos[a].getName());
        }

        // campos de a clase + campos heredados
        campos = o.getClass().getFields();
        for (int a = 0; a < campos.length; a++) {
            System.out.println("---------------------------------------------");
            System.out.println(campos[a]);
            System.out.println(campos[a].getType().getName());
            System.out.println(campos[a].getModifiers());
            System.out.println(campos[a].getName());
        }

        // metodos de la clase
        Method[] metodos = o.getClass().getDeclaredMethods(); // un vector con todos los metodos de la clase
        for (int a = 0; a < metodos.length; a++) {
            System.out.println("---------------------------------------------");
            System.out.println(metodos[a]);
            System.out.println(metodos[a].getName());
            System.out.println(metodos[a].getModifiers());
            System.out.println(metodos[a].getReturnType().getName());
            Parameter[] parametros = metodos[a].getParameters();// me devuelve un vector de parametros que tengo que
                                                                // recorrer.
            System.out.println("Parametros de entrada :");
            for (int x = 0; x < parametros.length; x++) {
                System.out.println(parametros[x]);
            }
        }

        // metodos de la clase + metodos heredados
        metodos = o.getClass().getMethods(); // un vector con todos los metodos de la clase
        for (int a = 0; a < metodos.length; a++) {
            System.out.println("---------------------------------------------");
            System.out.println(metodos[a]);
            System.out.println(metodos[a].getName());
            System.out.println(metodos[a].getModifiers());
            System.out.println(metodos[a].getReturnType().getName());
            Parameter[] parametros = metodos[a].getParameters();// me devuelve un vector de parametros que tengo que
                                                                // recorrer.
            System.out.println("Parametros de entrada :");
            for (int x = 0; x < parametros.length; x++) {
                System.out.println(parametros[x]);
            }
        }

        //constructores de la clase
        Constructor[] constructores = o.getClass().getConstructors(); // me devuelve los constructores de la clase
        for(int a=0; a<constructores.length;a++){
            System.out.println(constructores[a]);
        }

        //invocar un metodo de la clase 
        //con el metodo invoke yo puedo ejecutar un metodo o consutrctor y devuelve un resultado
        System.out.println(o
                            .getClass()
                            .getMethod("getNombre")
                            .invoke(o)
                            );


    System.out.println("-------------------------------------------------");

    Arrays.asList(o.getClass().getDeclaredFields()).forEach(System.out::println); // mas elegante mismo recorrido


    }
}
