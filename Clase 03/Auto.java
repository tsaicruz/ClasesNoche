// Declaracion de clases
public class Auto 
{

    //Atributos
    String marca;
    String modelo;
    String color;
    int velocidad;


    //Metodos
    void acelerar() {                               // acelerar
        velocidad +=10;
        if(velocidad > 100) velocidad = 100;        //Reglas de negocios.
    }

        // Metodo sobrecargado(ya existe por eso tira error, y hay que agregar un parametro en este caso int km)
    void acelerar(int kilometros){      //acelerar int
        // int kilometros es un parametro de entrada.
        velocidad += kilometros;
        if(velocidad > 100) velocidad = 100;
    }

        // void acelerar(int r){ } Da error, porque el int tiene que ser solo uno, intenta renombrarse 
        // como acelerarInt y no pueden coexistir   


    void acelerar(int r, boolean x){} // en este caso no, porque intenta llamarse AcelerarIntboolean
    void acelerar(int r, int x){}    // en este caso, este parametro se llamaria IntInt


    void frenar() { 
        velocidad-=10;
        if(velocidad< 0  ) velocidad = 0;
    }
    
    }//End clases o finalza clases