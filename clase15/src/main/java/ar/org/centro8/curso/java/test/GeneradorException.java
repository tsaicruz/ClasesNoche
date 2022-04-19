package ar.org.centro8.curso.java.test;

public class GeneradorException {
    public static void generar(){

        int[] vector = new int[5];
        vector[10] = 20; // arroja una array index o un index exception 
    }

    public static void generar(boolean x){
        if(x) System.out.println(10/0);
    }

    public static void generar(String nro){ //me ingresa un string con el numero 38 y me lo convierte en el entero 
                                            // pero si me ingresa 38x no es parsaeable y me tira un error porque no puede convertirse en un String
        int numero = Integer.parseInt(nro);
    }

    public static void generar(String text, int index){  // suponemos que el texto es hola y el indice es 2 te imprime la l , pero si el texto fuera null 
                            // cuando tengo un null, tengo una null pointer exception o si pido un indice -2 no existe, es otra exception
      // if( text == null || index < 0 || index>=text.length()) return; esto arregla el problema pero lo vamos a ver con exceptions
        System.out.println(text.charAt(index));

    }
}
