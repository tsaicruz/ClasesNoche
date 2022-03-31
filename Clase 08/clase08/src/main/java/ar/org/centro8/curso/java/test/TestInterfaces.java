package ar.org.centro8.curso.java.test;
import java.util.Scanner;
import ar.org.centro8.curso.java.interfaces.I_File;
import ar.org.centro8.curso.java.utils.FileBinary;
import ar.org.centro8.curso.java.utils.FileText;

public class TestInterfaces {
    public static void main(String[] args) throws Exception {
        System.out.println("Test Interfaces");
        
        I_File file = null; // creo un objeto de I_FIle , no esta inicializada.

        // file = new FileText();  // esto es un objeto de la clase hija. Lo inicializo como archivo de texto.

        // file = new FileBinary(); // Lo inicializo como un archivo de binario.

        System.out.println("Ingrese 'FileText' o 'FileBinary' ");
        String in = new Scanner(System.in).nextLine();


        // aca abajo pedimos que el usuario elija si es un filetext o un filebinary.
        // if(in.equalsIgnoreCase("FileText")) file = new FileText();
        // if(in.equalsIgnoreCase("FileBinary")) file = new FileBinary();

        // con lo de abajo obtengo la clase de algo con el class.forname(in) y me crea un objeto
        // file = (I_File) Class.forName("ar.org.centro8.curso.java.utils." + in)
        //                    .newInstance(); 


        file=(I_File)Class.forName("ar.org.centro8.curso.java.utils." + in)
                            .getConstructor()
                            .newInstance();

        // Esto es una aplicacion.
        file.setText("Hola");
        System.out.println(file.getText());
        file.info(); //.info es un metodo defualt.


    }
    
}
