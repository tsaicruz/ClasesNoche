package ar.org.centro8.curso.java.test;

public class Vuelo {
    private final String nombre;
    private int cantidadPasajes;

    public Vuelo(String nombre, int cantidadPasajes) {
        this.nombre = nombre;
        this.cantidadPasajes = cantidadPasajes;
    }

    // creo el metodo vender pasajes -> metodo es void , no es boolean porque quiero
    // explicar la situacion , si vpedis 10 y tengo 8 puedo escribir un mensaje ,
    // con el boolean no.
    public synchronized void venderPasajes(int cantidadPasajesPedidos) throws NoHayMasPasajesException {
        // cuando dice syncronized Java le pone una luz roja para que alguien mas no
        // pueda comprar. en caso de que
        // tenga ciertos pasajes para vender.
        if (cantidadPasajes < cantidadPasajesPedidos) // si no hay pasajes lanzo la excepcion, y se detiene el metodo.
                                                      // si hay pasaje hace la venta
            throw new NoHayMasPasajesException(nombre, cantidadPasajes, cantidadPasajesPedidos);
        this.cantidadPasajes -= cantidadPasajesPedidos; // no se hace un else porque esta implicito.
    }

    // no lo reformo, porque no es una mensaje que quiera llegar a un usuario.
    @Override
    public String toString() {
        return "Vuelo [cantidadPasajes=" + cantidadPasajes + ", nombre=" + nombre + "]";
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadPasajes() {
        return cantidadPasajes;
    }

}
