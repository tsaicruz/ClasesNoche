package ar.org.centro8.curso.java.proyecto.utils.file;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Interface para el manejo de Archivos
 *
 * @author carlos
 */

public interface I_File {

    /**
     * Imprime el contenido del archivo en consola.
     */
    default void print() {System.out.println(getText());}



    /**
     * Retorna el contenido de un archivo.
     *
     * @return retorna el contenido del archivo.
     */
    String getText();





    /**
     * Escribe un texto al archivo.
     *
     * @param text Texto a escribir en el archivo.
     */
    void setText(String text);





    /**
     * Apendiza texto a un archivo.
     *
     * @param text Apendiza el texto al archivo.
     */
    void appendText(String text);





    /**
     * Agrega una linea al archivo.
     *
     * @param line Agrega esta linea de texto al archivo.
     */
    default void addLine(String line) {appendText(line + "\n");}






    /**
     * Borra el contenido del archivo.
     */
    default void clear() {setText("");}






    /**
     * Agrega un List al archivo. Se recomienda sobreescribir el método, para
     * mejorar la performance y seguridad.
     *
     * @param lines Agrega esta List al archivo.
     */
    default void addLines(List<String> list) {list.forEach(this::addLine);}




    /**
     * Retorna un List con el contenido del archivo.
     *
     * @return retorna un List con el contenido del archivo.
     */
    List<String> getAll();







    /**
     * Retorna un list filtrado con el contenido del archivo.
     *
     * @param filter expresión de filtro.
     * @return list filtrado.
     */ 
    // me pone una clave ejemplo lunes y me traen las lineas que tengan esa letra o palabra
    default List<String>getLikeFilter(String filter){
        if  (filter == null) return new ArrayList();
        return getAll()
                    .stream()
                    .filter(x->x.toLowerCase().contains(filter.toLowerCase()))
                    .collect(Collectors.toList());
    }





    /**
     * Retorna un LinkedHashSet con el contenido del archivo.
     *
     * @return retorna un LinkedHashSet con el contenido del archivo.
     */

    // quita los duplicados.

    default LinkedHashSet<String> getLinkedHashSet() {
        LinkedHashSet<String> set = new LinkedHashSet();
        set.addAll(getAll());
        return set;
    }





    /**
     * Retorna un TreeSet con el contenido del archivo.
     *
     * @return retorna un TreeSet con el contenido del archivo.
     */
    // no tiene valores duplicados, esta ordeando por orden natural ( alfabetico )
    default TreeSet<String> getTreeSet() {
        TreeSet<String> set = new TreeSet();
        set.addAll(getAll());
        return set;
    }







    /**
     * Retorna un List ordenado con el contenido del archivo
     *
     * @return retorna un List ordenado con el contenido del archivo.
     */
    default List<String> getSortedLines() {
        return getAll()
                .stream()
                .sorted()
                .collect(Collectors.toList());
    }

    



    /**
     * Retorna un List ordenado descendente con el contenido del archivo.
     *
     * @return retorna un List ordenado descendente con el contenido del
     * archivo.
     */
    default List<String> getReversedSortedLines() {
        return getAll()
                .stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }






    /**
     * Borra una linea del archivo. Se recomienda sobreescribir el método, para
     * mejorar la perfomance y seguridad.
     *
     * @param line Linea a borrar.
     */
    default void remove(String line) {
        List<String> list = getAll();
        list.remove(line);
        clear();
        addLines(list);
}
}
