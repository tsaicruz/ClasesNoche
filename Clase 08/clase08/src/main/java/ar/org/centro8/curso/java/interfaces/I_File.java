package ar.org.centro8.curso.java.interfaces;

public interface I_File {
    // a la interface la declaramos con I en los archivos.
    /*
     * int cantidad = 0; (es un atributo es un static)
     * interfaces:
     * - Una interface no contiene atributos ni metodos constructores.
     * - Puede contener constanstes o atributos de clase (Static).
     * - Todos los miembros de una interface son publicos.(son publicos aunque no lo
     * diga)
     * - Los metodos de una interface son abstractos.(son metodos que no tienen
     * cuerpo,se esta obligado a implementarlos)
     * - Una clase puede implementar muchas interfaces.
     * 
     * // la motivacion de la interface es que usando el I_file lo usamos como
     * contrato para que en varios equipos
     * // usen el mismo "lenguaje o vocabulario", ejemplo, que en diferentes grupos
     * no sean escritura, read, escribir.
     * 
     */
    // public abstract void setText(String text); // metodos que tienen que
    // implementar las clases hijas.

    /**
     * La java doc es hereda, los comentarios java doc son heredados y puedo poner
     * explicaciones:
     * 
     * Este método escribe dentro del archivo.
     * 
     * @param text texto a escribir
     */
    void setText(String text); // un poco mas simplificado. Para escribir

    /**
     * Este metodo devuelve el contenido del archivo
     * 
     * @return retorna el texto con el contenido de un archivo.
     */
    String getText(); // para conseguir el texto.

    /*
     * Interfaces en java 8 o Superior
     * 
     * Metodos default: En Java8 o superrior existen los metodos default.
     * Estos metodos tienen cuerpo(codigo) y es heredado a las implementaciones
     */
    

    default void info(){
        System.out.println("Interface I_File");
    }

    // en utils usamos una implementacion Dummy y ponemos lo que hacen estas dos cosillas

}
