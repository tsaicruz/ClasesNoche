package ar.org.centro8.curso.java.clase11.test;

import java.util.ArrayList;
import java.util.List;

import ar.org.centro8.curso.java.clase11.entities.Persona;

public class testApiStream {
    public static void main(String[] args) {
        // API STREAM -> la motivacion de api es manejar flujos de datos sin importar la
        // procedencia de la informacion( o fuente de datos ) no importa
        // si viene de una sql , de una servicio en internet o un archivo.

        List<Persona> list = new ArrayList();

        list.add(new Persona("Juan", "Morales", 23));
        list.add(new Persona("Victor", "Morales", 23));
        list.add(new Persona("Ana", "Morales", 23));
        list.add(new Persona("Beatriz", "Morales", 23));
        list.add(new Persona("Carlos", "Morales", 23));
        list.add(new Persona("Carlos", "Morales", 9));
        list.add(new Persona("Juan", "Morales", 23));
        list.add(new Persona("Gabriel", "Bando", 45));
        list.add(new Persona("Fernando", "Tigo", 39));
        list.add(new Persona("Javier", "Costa", 34));
        list.add(new Persona("Lorena", "Gomez", 38));
        list.add(new Persona("Horacio", "Mendez", 29));
        list.add(new Persona("Eliana", "Correa", 39));
        list.add(new Persona("Laura", "Correa", 34));
        list.add(new Persona("Laura", "Sosa", 38));
        list.add(new Persona("Laura", "Perez", 29));
        list.add(new Persona("Lautaro", "Correa", 39));
        list.add(new Persona("Laureano", "Correa", 39));
        list.add(new Persona("laura", "Cachalate", 39));
        list.add(new Persona("LAURA", "Mandiga", 39));
        list.add(new Persona("Mirta", "Mandiga", 39));
        list.add(new Persona("Marta", "Mandiga", 39));
        list.add(new Persona("Marcela", "Mandiga", 39));
        list.add(new Persona("Marcelo", "Mandiga", 39));
        list.add(new Persona("Armando", "Mandiga", 39));

        // select * from personas -> esto es en my SQL
        System.out.println("***************USANDO APISTREAM****************");
        list.stream().forEach(System.out::println); // siempre que tenemos .stream no importa que tengamos adelante,sea
                                                    // servicio, string, etc.

        System.out.println("**********************************************");
        // select * from personas = "Laura";
        // list.stream().filter(p->p.getNombre().equals("Laura")).forEach(System.out::println);

        // select * from personas = "laura o Laura o LAURA" con el ignorecase busca
        // todas las lauras
        list.stream().filter(p -> p.getNombre().equalsIgnoreCase("Laura")).forEach(System.out::println);

        // sin el api stream
        // for(Persona p:list){
        // if(p.getNombre().equals("Laura")){
        // System.out.println(p);
        // }
        // }

        System.out.println("********************************************");
        // select * from personas nombre like 'lau%'; -> todo lo que empiece con lau
        list.stream().filter(p -> p.getNombre().toLowerCase().startsWith("lau")).forEach(System.out::println);

        System.out.println("********************************************");
        // select * from personas nombre like "%a"; -> todo lo que termine en a
        list.stream().filter(p -> p.getNombre().toLowerCase().endsWith("a")).forEach(System.out::println);

        System.out.println("********************************************");
        // select * from personas nombre like "%ar%"; -> todo lo que contenga ar en el
        // medio
        list.stream().filter(p -> p.getNombre().toLowerCase().contains("ar")).forEach(System.out::println);

        System.out.println("********************************************");
        // select * from personas nombre like "____" -> tiene 4 letras.
        list.stream().filter(p -> p.getNombre().length() == 4).forEach(System.out::println);

        System.out.println("********************************************");
        // select * from personas like "____%" -> tiene 4 o mas letras
        list.stream().filter(p -> p.getNombre().length() >= 4).forEach(System.out::println);

        System.out.println("********************************************");
        // select count(*) form personas nombre = "laura"; -> agrupamiento cuenta cuantas personas se llaman laura
        System.out.println( // lo imprimimos para que se vea porque devuelve un long.
        list.stream().filter(p-> p.getNombre().equalsIgnoreCase("laura")).count()
        );
        
        System.out.println("********************************************");
        // select count(*) from personas nombre = laura and edad >=30;
        System.out.println(
            list.stream().filter(p-> p.getNombre().equalsIgnoreCase("laura")&& p.getEdad()>=30).count()
        );

        System.out.println("********************************************");
        // select count(*) from personas nombre = laura and edad >=30;
        System.out.println(
            list.stream().filter(p-> p.getNombre().equalsIgnoreCase("laura")).filter(p->p.getEdad()>=30).count()
        );

      //pendeintes}
      //order by
      // min max
      //
        
    }

}
