package ar.org.centro8.curso.java.entities;

public class Auto {
    private String marca;
    private String modelo;
    private String color;
    private static int velocidad; 

    public Auto(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        // no pide la velocidad
    }

    
    public static void acelerar(int kilometros){

        velocidad += kilometros;

    };


    public static void frenar(int kilometros){
        velocidad-=kilometros;
    };




    @Override
    public String toString() {
        return "Auto [color=" + color + ", marca=" + marca + ", modelo=" + modelo + "]";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // hay un get y set de velocidad y son staticos

    public static int getVelocidad() {
        return velocidad;
    }

    public static void setVelocidad(int velocidad) {
        Auto.velocidad = velocidad;
    }

    
    
}
