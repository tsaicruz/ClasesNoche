package ar.org.centro8.curso.java.proyecto.utils.file;

import java.io.File;
import java.io.FileReader;
import java.util.List;

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
        StringBuilder sb = new StringBuilder();     
           //cuando abro un archivo aca, si abro un archivo y no existe
            // tengo una excepcion de archivo no encontrado  
        String text=" ";
        int car; // creo una variable para que lea caracteres
            try(FileReader in = new FileReader(file)) { 
            while((car=in.read())!=1){
                text += (char)car;
                // al texto le anexo las letras que tiene el archivo. se las da a text
                sb.append((char)car);
            }          
        } catch (Exception e) {
            System.out.println(e);          
        }
        return sb.toString();
    }

 

    @Override
    public void setText(String text) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void append(String text) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<String> getAll() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
