package ar.org.centro8.curso.java.test;

import java.io.Closeable;
import java.io.FileReader;
import java.io.IOException;

public class Lector implements Closeable {
    private FileReader file; // es closeable eso quiere decir que implementa el metodo close.

    public Lector(String file) throws Exception {
        this.file = new FileReader(file);
    }

    public int leer() throws Exception {
        return file.read();
    }

    @Override
    public void close() throws IOException {
        file.close();
        System.out.println("Se cerro el archivo");

    }

}
