package ar.org.centro8.curso.java.utils;

import ar.org.centro8.curso.java.interfaces.I_File;

public class FileBinary implements I_File{

    // se implementar metodos abstractos 

    @Override
    public String getText() {    
        return "Archivo Binario";
    }

    @Override
    public void setText(String text) {
        System.out.println("Escriendo Archivo Binario");        
    }
    
}
