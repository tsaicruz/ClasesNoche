package ar.org.centro8.curso.java.proyecto.utils.file;

public class FileTextTest {
    public static void main(String[] args) {

        // String texto = " "; // La clase String tiene muchos problemas por ejemplo que lo guarda en un vector y lo pone en un byte
        // // el problema es el tiempo que lleva en destruir y crear un vector nuevo -> esto pasa porque lo lee letra por letra y lo tiene que 
        // // poner una letra en un nuevo vector esto lo hace mas lento

        // StringBuilder sb = new StringBuilder();
        // // representa un string que no se almacena en un vector si no lo hace en una lista. 
        // // un string en memoria.

        // for(int a = 0; a <= 100; a++){
        //     //texto += "x"; -> con el ejemplo de arriba 
        //     sb.append("x"); // -> con el sb Stringbuilder
        // }

        String file = "texto.txt"; // esto significa en el raiz del proyexto, porque si le pongo c/ quiere decir que estoy o que todos tienen windows
        I_File fText = new FileText(file);
        System.out.println(fText.getText());          
    
        
    }
}
