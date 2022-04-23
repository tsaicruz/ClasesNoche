package ar.org.centro8.curso.java.test;

import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class testException {
    public static void main(String[] args) {
        // System.out.println(10/0); // no se puede divir por 0 entonces el programa se
        // detiene y no se ejecuta lo que sigue
        // System.out.println("Esta linea no se ejecuta");
        // LOS EXCPETIONS SE USA PARA QUE SIGA FUNCIONANDO EL PRGROGRAMA. TRATAR QUE NO
        // SE CUELGUE Y DARLE UN ERROR A ALGUIEN PARA QUE PUEDA SOLUCIONARLO

        /*
         * Estructura Try Catch Finally
         * 
         * try{
         * 
         * el try. ES OBLIGATORIO
         * Ubicar en este bloque, todas las sentencias que pueden arrojar una exception
         * es decir que puedan arrojar un error, como la comunicacion de datos o la
         * divison en 0
         * tener en cuenta que estas sentencias tienen un costo mayor de Hardware , se
         * ejecutan mas lentos
         * si pueden ejecutarse bien se ejecutan si no, lanzan una exception, no detiene
         * el programa , que es lo que nos interesa.
         * 
         * 
         * 
         * } catch(Exception e){
         * 
         * el catch ES OBLIGATORIO
         * Este bloque se ejecuta en caso de ocurrir una exception en try
         * se recibe como parametro un objeto del tipo exception tendra atributos ,
         * mensaje de error y el tipo de exception
         * no necesariamente se lo muestro al usuario y se guardaria en un log
         * Ej - Print ocurrio un error.
         * 
         * 
         * } finally {
         * 
         * finally ES OPCIONAL
         * Este bloque se ejecuta siempre ocurra una exception o no
         * suponemos que el try se ejecuto bien y va a finally
         * suponemos que try tuvo un error va a catch y luego a finally
         * Las variables declaradas en Try o Catch estan fuera de scope(Alcance)
         * 
         * }
         * /// * El programa termina normalmente
         * 
         * 
         * 
         * // Con el finally
         * try {
         * System.out.println(10/1);
         * System.out.println("Esta linea no se ejecuta");
         * } catch (Exception e) {
         * System.out.println("Ocurrio un Error! ");
         * System.out.println(e); // no se lo muestra a un usuario.
         * } finally {
         * System.out.println("El programa termina normalmente!");
         * }
         * 
         * 
         * // Sin el finally.
         * try {
         * System.out.println(10/1);
         * System.out.println("Esta linea no se ejecuta");
         * } catch (Exception e) {
         * System.out.println("Ocurrio un Error! ");
         * System.out.println(e); // no se lo muestra a un usuario.
         * }
         * 
         * System.out.println("El programa termina normalmente!");
         */

        // FileReader in = new FileReader("texto.txt");

        try {
            // son excepciones uncheked , me detienen el programa. la ultima es una cheked
            // es una finlenotfoundexception ( estoy obligado a controlarla )
            // GeneradorException.generar();
            // GeneradorException.generar(true); // aritmetc exception si es true, y
            // funciona si es false
            // GeneradorException.generar("26v"); // con el v noo funciona con el 26 solo si
            // GeneradorException.generar(null, 3); // se encontro con un nullo entonces
            // pointer exception
            // GeneradorException.generar("hola", -2); // una exception de String fuera de
            // rango
            FileReader in = new FileReader("texto.txt");
            System.out.println("************************************");
        } catch (Exception e) {
            e.printStackTrace();
        } // imprime el trace de errores

        // captura personalizada de exceptions

        try {
            // GeneradorException.generar() -> Clase padre
            // GeneradorException.generar(); -> Division 0
            // GeneradorException.generar(true); //-> Indice fuera de rango
            // GeneradorException.generar("29x"); -> Formato de numero incorrecto
            // GeneradorException.generar(null, 2); -> Puntero nulo
            // GeneradorExecpetion.generar("hola", 20); -> Indice fuera de rango
            // FileReader in = new FileReader("texto.txt"); // -> Error no esperado. failt
            // not found exception

        } catch (ArithmeticException e) {
            System.out.println("División / 0");
            // } catch (ArrayIndexOutOfBoundsException e) { System.out.println("Indice Fuera
            // de Rango");
        } catch (NumberFormatException e) {
            System.out.println("Formato de número incorrecto!");
        } catch (NullPointerException e) {
            System.out.println("Puntero Nulo");
            // } catch (StringIndexOutOfBoundsException e) { System.out.println("Indice
            // Fuera de Rango");
            // } catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e)
            // {
            // System.out.println("Indice fuera de rango");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Indice Fuera de Rango!");
            // } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
            // } catch (IOException e) {
            System.out.println("Error IO");
        } catch (Exception e) {
            System.out.println("Error no esperado!");
        }

        // Imaginar la situacion en que un lugar de ventas de pasaje sobrepase las
        // ventas, intentamos generar una exception para que devuelva un metodo void .
        // VAMOS A APRENDER A USAR LAS EXCPECIONES PARA CREAR UNA REGLA DE NEGOCIO
        // MEJOR.

        // PENDIENTE USO DE VALIDACIONES PARA REGLAS DE NEGOCIO
        // creamos dos vuelos de 100 pasajes
        Vuelo v1 = new Vuelo("AER111", 100);
        Vuelo v2 = new Vuelo("LAT123", 100);

        try {
            v1.venderPasajes(40);
            v2.venderPasajes(20);
            v1.venderPasajes(40);
            v2.venderPasajes(30);
            v1.venderPasajes(30); // lanza una exception
            v2.venderPasajes(10); // esta venta no se realiza porque le antereior lanza una exception
        } catch (NoHayMasPasajesException e) {
            System.out.println(e); // tiene el mensaje de usuario el toString o el GetMessage
        }

        // tema pendiente Try with resources
        // tenemos la clase lector que intenta leer un archivo, y todos sus metodos
        // lanzan una excepcion

        // LO DE ABAJO NO HAY QUE HACERLO
        /*

        try {
            Lector lector = new Lector("texto.txt");
            try {

                System.out.println(lector.leer()); // lee un caracter del archivo
                // lector.close(); // se cierra el archivo
                // el problema es que alguno de los dos pueden lanzar una excepcion y no cierra
                // el archivo

            } catch (Exception e) {
                // lector.close();
            } finally {
                try {
                    lector.close();
                } catch (Exception e) {
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        */

        // try with resources
        // dentro del parentisis definimos objetos de la clase closeable como por ejemplo lector.
        // todo lo que sea conexion, java se encarga de cerrar solo el archivo. con esta forma 
        try (Lector lector = new Lector("text.txt")) {
            System.out.println(lector.leer());
            throw new Exception();            
        } catch (Exception e) {
            System.out.println(e);
        }



    }

}
