package ar.org.centro8.curso.java.test;

// Si ponemos extendes Exception estamos creando una checked exception -> Obligamos a que se controle una excpetion
// no que el usuario pueda no controlarlo
public class NoHayMasPasajesException extends Exception {

    // aprendemos a crear una propia excepcion.

    private final String nombreVuelo; // cuando dice final no se puede cambiar su estado, o redifinir
    private final int cantidadPasajesDiponibles;
    private final int cantidadPasajesPedidos;

    public NoHayMasPasajesException(String nombreVuelo, int cantidadPasajesDiponibles, int cantidadPasajesPedidos) {
        this.nombreVuelo = nombreVuelo;
        this.cantidadPasajesDiponibles = cantidadPasajesDiponibles;
        this.cantidadPasajesPedidos = cantidadPasajesPedidos;
    }

    // reformamos el metodo ToString para que el usuario vea el mensaje que nosotros
    // queremos. -> "el que trata de comprar voletos y no puede.""
    @Override
    public String toString() {
        return "El vuelo " + nombreVuelo + " no tiene " + cantidadPasajesPedidos + " pasajes , solo tiene "
                + cantidadPasajesDiponibles + " pasajes. ";
    }

    // borramos los setters para que el usuario no pueda cambiarlos
    @Override
    public String getMessage() {
        return this.toString();
    }

    public String getNombreVuelo() {
        return nombreVuelo;
    }

    public int getCantidadPasajesDiponibles() {
        return cantidadPasajesDiponibles;
    }

    public int getCantidadPasajesPedidos() {
        return cantidadPasajesPedidos;
    }

}
