package ar.org.centro8.curso.java.test;

import java.io.File;
import java.io.FileReader;

public class testException {
    public static void main (String[] args) {
        //System.out.println(10/0); // no se puede divir por 0 entonces el programa se detiene y no se ejecuta lo que sigue 
        //System.out.println("Esta linea no se ejecuta");

        /*
         Estructura Try Catch Finally

         try{

            * el try. ES OBLIGATORIO
            * Ubicar en este bloque, todas las sentencias que pueden arrojar una exception
            * es decir que puedan arrojar un error, como la comunicacion de datos o la divison en 0
            * tener en cuenta que estas sentencias tienen un costo mayor de Hardware , se ejecutan mas lentos 
            * si pueden ejecutarse bien se ejecutan si no, lanzan una exception, no detiene el programa , que es lo que nos interesa. 

            

         } catch(Exception e){

            * el catch ES OBLIGATORIO
            * Este bloque se ejecuta en caso de ocurrir una exception en try 
            * se recibe como parametro un objeto del tipo exception tendra atributos , mensaje de error y el tipo de exception
            * no necesariamente se lo muestro al usuario y se guardaria en un log
            * Ej - Print ocurrio un error.

            
         } finally {

            * finally ES OPCIONAL 
            * Este bloque se ejecuta siempre ocurra una exception o no 
            * suponemos que el try se ejecuto bien y va a finally
            * suponemos que try tuvo un error va a catch y luego a finally 
            * Las variables declaradas en Try o Catch estan fuera de scope(Alcance)

         }
            ///  * El programa termina normalmente
        
    
      
        // Con el finally
        try {
            System.out.println(10/1);
            System.out.println("Esta linea no se ejecuta");
        } catch (Exception e) {
            System.out.println("Ocurrio un Error! ");
            System.out.println(e); // no se lo muestra a un usuario. 
        } finally {
            System.out.println("El programa termina normalmente!");
        }


        // Sin el finally.
        try {
            System.out.println(10/1);
            System.out.println("Esta linea no se ejecuta");
        } catch (Exception e) {
            System.out.println("Ocurrio un Error! ");
            System.out.println(e); // no se lo muestra a un usuario. 
        } 

        System.out.println("El programa termina normalmente!");
        */

        // FileReader in = new FileReader("texto.txt"); 

        try {
            // son excepciones uncheked , me detienen el programa. la ultima es una cheked es una finlenotfoundexception ( estoy obligado a controlarla )
            // GeneradorException.generar();  
            // GeneradorException.generar(true);   // aritmetc exception si es true, y funciona si es false   
            // GeneradorException.generar("26v"); // con el v noo funciona con el 26 solo si
            // GeneradorException.generar(null, 3); // se encontro con un nullo entonces pointer exception
            // GeneradorException.generar("hola", -2); // una exception de String fuera de rango
            FileReader in = new FileReader("texto.txt"); 
            System.out.println("*********");    
        } catch (Exception e) {
            e.printStackTrace();} // imprime el trace de errores 

   // captura personalizada de exceptions   

    try {
       // GeneradorExceptions.generar();
        // GeneradorExcepcions.generar(true);
        //GeneradorExceptions.generar("29x");
        //GeneradorExceptions.generar(null, 2);
        // GeneradorExecpetions.generar("hola", 20);
        //    FileReader in = new FileReader("texto.txt"); -> Error no esperado.
                
    } catch (ArithmeticException e)             { System.out.println("División / 0");
    } catch (ArrayIndexOutOfBoundsException e)  { System.out.println("Indice Fuera de Rango");
    } catch (NumberFormatException e)           { System.out.println("Formato de número incorrecto!");
    } catch (NullPointerException e)            { System.out.println("Puntero Nulo");
    } catch (StringIndexOutOfBoundsException e) { System.out.println("Indice Fuera de Rango");
    } catch (Exception e)                       { System.out.println("Error no esperado!"); }
    
    }   
}


