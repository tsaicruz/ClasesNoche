 /**
  * -Clase principal de proyecyo
  */

 public class Clase02 
 {

    /**
     * Punto de entrada 
     * @param args
     */


    //para hacer el main se usa main + tab y para sout sout + tab
    public static void main(String[] args)
     {

        System.out.println("Clase 02");
        System.out.println(System.getProperty("java.version")); 
        // sout y system para ver la version del java

        //tema pendiente String args  es un vector con argumentos que ingresan de la consola
        //El vector args puede tener cualquier nombre.

        System.out.println("Longitud args: " + args.length);

        // Aca hacemos un recorrido por args para ver el lenght
        for(int a=0; a<args.length; a++){
            System.out.println(args[a]);
         



            //Uso de varargs JDK 5 o superior.
            String[] vector={"primavera", "Verano", "otoño", "invierno"};
            metodo1(vector);
            metodo2("primavera", "Verano", "otoño", "invierno"); //Error no recibe varargs como parametro

            metodo2(vector);
            metodo2("primavera", "Verano", "otoño", "invierno");
        }


        }

        


            //Linea de comentarios
            //Linea de comentarios
            /* bloque de comentarios /*

            /**
              Comentario JavaDOc
              Sale por fuera de lo binario y lo puede ver 
              Este comentario puede verse desde fuera del acrchivo binario
              debe colocarse este comentario delante de una declaracion de clase o 
              declaracion de metodo.
             */
            

            /**
             * Metodo que ingresa un array como argumento
             */
            public static void metodo1(String[] argumentos){
                for(int a=0; a<argumentos.length; a++){
                    System.out.println(argumentos[a]);
                }
            }

                /** 
                 * Metodo que ingresa como un varargs como argumento
                 */
                public static void metodo2(String... argumentos) {
                    for(int a=0; a<argumentos.length; a++){
                    System.out.println(argumentos[a]);
                }   
                
                                    
                    //Comando para generar un JavaDoc Desde la terminal.
                    //javadoc -d docs/ -version -author - use *.java}
                    //el javadoc tiene la posibilidad de crear un diagrama de clases


                    //Tarea instalar el openJDK Redhat



                    //tipo de datos primitivos
                    // Lenguaje tipado fuerte: Java, C++. C#, Visual Basic
                    // Se declara una variable y hay que declarar el tipo de datos y respetarlos
                    // Lenguaje de tipado debil JavaScript, Python, PHP
                    // No se respetan nada , son faciles de aprender , y son faciles de pasar la seguridad.


                    // Tipo de datos enteros

                    // tipo de datos boolean
                    // Utiliza 1byte porque guarda un 0 o un 1, false = 0 True = 1
                    // boolean bo= true --> 1
                    // System.out.println(bo);


                    //  bo = false;    --> 0
                    //  System.out.println(bo);  


                    // Tipo de datos byte            1 byte          -128 el numero mas chico  127 mas grande
                    // byte by = 100;
                    // System.out.println(by);


                    // Tipo de datos short       son     2 bytes      65.000 negativos 650000 positivos.
                    // short sh = 1000;
                    // System.out.println(sh);


                    // Tipo de datos int         son        4 bytes      2mil millones de numeros negativos y 2milmillones positivos
                    // int in = 200000000;
                    // System.out.println(in);


                    // Tipo de datos long        son         8 bytes     equivalen
                    // long lo = 100000000;
                    // long lo = 3000000000L; Hay que ponerle la L para que sea Long si no no funciona.
                    // System.out.println(lo);


                    // Tipo de datos char       son         2 bytes     todos positivos. Almacena numeros pero representa caracteres UNICODE.
                    // char  ch = 120; --> Equivale a x porque es del metodo anscii
                    // System.out.println(ch);
                    // ch='a';
                    // System.out.println(ch);
                    // ch-=32;  --> Equivale a A mayuscula.
                    // System.out.println(ch);


                    // Tipo de datos de punto flotante. (Son asi porque pueden moverse dentro de los numeros)
                    // tipo de datos float de 32 bits
                    //float fl = 4.38f;    --> Lo toma como una literal y cree que es un double

                    // tipo de datos double de 64 bits
                    // Double dl = 4.38;

                    // fl= 10
                    // dl = 10

                    // System.out.println(fl/3);
                    // System.out.println(dl/3); // es mucho mas preciso que el float 


                    
                    // fl= 100
                    // dl = 100

                    // System.out.println(fl/3);
                    // System.out.println(dl/3);

                    // En caso de no alcanzar los 64 bits de un long 
                    // usamos bigdecimal nos permite asignarle un numero , tiene logica decimal no binaria, es un poco mas lento de procesar p}
                    // pero se puede deinfir un numero entero con el decimal que yo quiera
                    // BigDecimal 


                    // Clase String -->  Es un objeto, una clase.
                    // String st = "Esto es una cadena de texto!";
                    // System.out.println(st);
                    // para reinciar el visual studio code shift contorl p y pones reload.


                    // String t = "hola";
                    // System.out.println(t);

                    /*
                      HAsta  JDK 9 -> en la clase String el atributo Value era private final Char[] value; // 8 bytes
                      En JDK 10 o Sup ->                                       private final byte[] value; // Consume 5 bytes

                    */



                    // Tipo de datos var            No existe en JDK 8 Es en JDK 9 o Superior.
                    // var  var1 = 2000;   Es una literal entera -> int no se puede modificar despues.
                    // var1 = 20;
                    // var1 = 3.26 -- > no se puede hacer porque es un double y ya puse anteriormente que era una variable entera.     
                    
                    
                    // var var2 = true;         -> solo se puede asignar booleans
                    // var var3 = 3.23          -> solo se puede asignar doubles
                    // var var4 = 3.23d         -> tambien es un double
                    // var var5 = 3.23f         -> es un float
                    // var var6 = 'a'           -> es un character
                    // var var7 = "A"           -> Es un String
                    // var var8 = 2L            -- Es un Long

                    // Object object = var4;
                    // System.out.println(Object.getClass().getSimpleName());  -> Esto es para saber uqe tipo de dato es en este caso es un double.


                    // Programacion estrucutrada If, for while, do while etc
                    // recorrer el String st
                    // System.out.println(st);
                    /* for(int a=0; a>st.length();a++){
                        System.out.print(st.charAt(a));
                    }
                    System.out.println();

                    // temas pendiente
                    // Imprimier en minusculas
                    // Imprimir en mayusculas 
                    // Operador ternario
                    


                    */
        
    }     

 }



