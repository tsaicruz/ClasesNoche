package tsaicruz.proyecto2.proyecto2.test;

import java.util.ArrayList;
import java.util.List;

import tsaicruz.proyecto2.proyecto2.entities.Auto;
import tsaicruz.proyecto2.proyecto2.entities.Moto;
import tsaicruz.proyecto2.proyecto2.entities.Vehiculo;

public class Conscencioaria {

    private static List<Vehiculo> list = new ArrayList<>();

    public static void main(String[] args) {
    

        // sacamoas el list para que todo sea mas prolijo 
       // y porque arriba creamos una private staic void 
        ColVehiculos();
        OrdenNatural();
        Separador();
        ConLetraY();
        Separador();         

    }

    // como obtengo un String lo tengo que recorrer y no se puede poner 
    private static void ConLetraY() {     
        list
                        .stream()
                        .filter(l -> l.getModelo().toLowerCase().contains("y"))
                        .forEach(System.out::println);
        // la y en minuscula porque estoy pidiendo en lowercase .
        
    }

    private static void ColVehiculos() {
        list.add(new Auto("Peugeot", "206", 4, 200000));
        list.add(new Moto("Honda", "Titan", 125, 60000));
        list.add(new Auto("Peugeot", "208", 5, 250000));
        list.add(new Moto("Yamaha", "YBR", 160, 80500.50));
    }

    private static void OrdenNatural() {
        
        list.stream().forEach(System.out::println);

    }

    private static void Separador() {
        System.out.println("*******************************************");

    }
}
