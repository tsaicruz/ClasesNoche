package ar.org.centro8.curso.java.proyecto.utils.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.sql.rowset.serial.SerialArray;

public class FileText implements I_File {

    private File file; // no puedo decir file = "texto.txt" porque creo una clase que solo trabaja con ese archivo.
    // creo un constructor , y el usuario decide con que archivo trabajar.
    // una interface no puede tener atributos ni constructores puede tener 
    // solo estaticos o constantes. por eso es que no esta en la clase padre.
 
    

   public FileText(File file) {
        this.file = file;
    } // nombrar un archivo aca no quiere decir que exista. de no existir no hay excepcion
    
    // escribo una sobrecarga del constructor

    public FileText(String file){
        this.file = new File(file); // tengo un constructor que recibe un String
    }



    @Override
    public String getText() {       
        StringBuilder sb = new StringBuilder();     // el string builder almacena todo
           //cuando abro un archivo aca, si abro un archivo y no existe
            // tengo una excepcion de archivo no encontrado  
        String text=" ";
        int car; // creo una variable para que lea caracteres
            try(FileReader in = new FileReader(file)) { 
            while((car=in.read())!=-1){ // IMPORTANTE PONER -1
                //text += (char)car;
                // al texto le anexo las letras que tiene el archivo. se las da a text
                sb.append((char)car);
            }          
        } catch (Exception e) {
            System.out.println(e);          
        }
        return sb.toString();
    }

 

    // file writer tiene un conjunto de reglas que no lo dice java pero lo dice el fileSistem del sistema.Op.
    // las reglas es que mientras otro programador trata de abrir un archivo y escribirlo no puede escibirilo otro programador
    // no al menos hasta que el primer programador cierre el archivo.
    // usamos el paquete de java I.O input output. que es el que usamos.
    // existe el paquete de arhivos nio -> que permite abrir un archivo de una forma mas avanzada viene de New input output
    // tiene un conjunto de clases que con java puede permitir usar una parte del archivo denominado canal -> no lo vamos a usar. y es usado raramente laboralmente
    
    @Override
    public void setText(String text) {
        try (FileWriter out = new FileWriter(file)) {
            out.write(text);
            // abro un escritor de archivos -> sobreescribir lo que exista de un archivo             
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

    @Override
    public void appendText(String text) {
        try (FileWriter out = new FileWriter(file, true)) {
            out.write(text);
                
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

    // 
    @Override
    public List<String> getAll() {
        

        List<String>list = new ArrayList<>();
        String line;


        // try (BufferedReader in = new BufferedReader(new FileReader(file))) {
        //     // creo un buffered reader que lo que hace es leer en linea por linea y no caracter por caracter
        //     while((line = in.readLine()) != null){//-> leo de a una linea entera lo cual me permite trabajar registro por registro si devuelve null es porque ya no hay nada mas que leer
        //          list.add(line);
        //     }; 
            
        // } catch (Exception e) {
        //     System.out.println(e);
        // }

        // return list;




        // forma mejorada abajo        
        try (BufferedReader in = new BufferedReader(new FileReader(file))) {
            //list= in.lines().toList();          //-> Java 17 es inmutable quiere decir que no se puede tocar
            list=in.lines().collect(Collectors.toList());   
        } catch (Exception e) {
            System.out.println(e);
        }

        return list;
    }
    
}
