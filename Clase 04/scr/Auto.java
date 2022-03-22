// Declaracion de clases
public class Auto {

    // Atributos
    String marca;
    String modelo;
    String color;
    int velocidad;

    // Constructores pendientes

    /**
     * Este metodo fue deprecado por Mariano Tsai el 21.03.2022
     * Por resultar inseguro -
     * Usar en su reemplazo
     * Auto(String marca, String modelo, String color)
     */

    @Deprecated // Annotation viene de JDk5 o sup
                // Deprecado, si esta tachado el metodo es porque no debe usarse y no debe
                // usarlo.
                // El deprecado se pone arriba del metodo que le sigue.

    Auto() {
    } // constructor vacio

    Auto(String marca, String modelo, String color) {// Aqui es donde usamos el Auto3
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;

        // de esta forma empieza a estar bien diferenciado el parametro del atributo, lo
        // de adelante this.marca
        // es el parametro y lo que sigue del igual es el atributo.
    }

    /*
     * //Metodos
     * void acelerar() { // acelerar
     * velocidad +=10;
     * if(velocidad > 100) velocidad = 100; //Reglas de negocios.
     * }
     */

    // Metodos
    void acelerar() { // acelerar
        acelerar(10); // llamado de metodo dentro de la misma clase
    }

    // Metodo sobrecargado(ya existe por eso tira error, y hay que agregar un
    // parametro en este caso int km)
    void acelerar(int kilometros) { // acelerar int
        // int kilometros es un parametro de entrada.
        velocidad += kilometros;
        if (velocidad > 100)
            velocidad = 100;
    }

    // void acelerar(int r){ } Da error, porque el int tiene que ser solo uno,
    // intenta renombrarse
    // como acelerarInt y no pueden coexistir

    void acelerar(int r, boolean x) {
    } // en este caso no, porque intenta llamarse AcelerarIntboolean

    void acelerar(int r, int x) {
    } // en este caso, este parametro se llamaria IntInt

    void frenar() {
        velocidad -= 10;
        if (velocidad < 0)
            velocidad = 0;
    }

    // Metodo sin devolucion de parametros, no devuelve nada.
    void imprimirVelocidad() {
        System.out.println(velocidad);
    }

    // metodo con devolucion de parametros
    // Las clases de negocio debe devolver un valor y el usuario es el que decide
    // donde imprimirlo/Que hacer
    int obtenerVelocidad() {
        return velocidad; // devuelve la velocidad del auto.
    }

    String getEstado() {
        return marca + ", " + modelo + ", " + color + " , " + velocidad;
    }

    @Override // aviso que esta heredado de la clase object y lo estoy sobreescribiendo. esto
              // es una buena practica.
    public String toString() { // Como es heradado le pongo public antes.
        return marca + ", " + modelo + ", " + color + " , " + velocidad;

    }

}// End clases o finalza clases