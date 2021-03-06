import javax.swing.JOptionPane;

public class Paradigma {
    public static void main(String[] args) {
    /*
        Paradigma de objetos

        Clase:  Sustantivos son clases, Plantillas para construir objetos, representan ideas genericas.
                Reprensentan ideas genericas del mundo real.
                Se detectan como sustantivos y se escriben en singular iniciando con mayuscula.
                ej: Clase alumno(porque hay varios y diferentes) generaliza en alumnos, y cada uno tendra su estado
                como nombre, apellido, fisico etc.
                ej: Auto, Alumno, Computadora (Todo en singular y empieza con mayuscula.)


        Clases en Java : Todas las clases en java son objetos de la clase -> java.lang.class


        Atributos: Los atributos describen a la clase son adjetivos y tiene un tipo de datos asignado
                Los atributos son variables contenidas dentro de la clase
                La clase define los atributos y los objetos completan el estado (le agrego un valor)

        Atributos en java: Son objetos de la clase java.lang.reflect.Field.



        Objetos: Son instancias de la clase, representan una situacion en particular
                 El estado es el valor de sus atributos, cada objeto tiene un estado propio(es decir un valor
                 de atributos propio)

        Objetos en java: En java cualquier objeto puede ser contenido en un objeto de la clase java.lang.Object


        Metodos : Son acciones que realiza la clase, se encuentran como verbos.
                Los analistas funcionales las llaman Operaciones.
                Pueden tener parametros de entrada y un paramentro de salida.


        Metodos en java: Son objetos de la clase java.lang.reflect.Method


        El paradigma imperactivo -> una orden a la maquina sin importar que consecuencias puede tener.
                                ej: Aire acondicionado, lo pongo en 16 y va a tirar en 16 todo el tiempo, 
                                sin importar si la maquina se rompe. Cumple la orden o muere cumpliendola.
                                No era ni logico, ni avanzado.

        La paradigma logico -> Agrega el if , se podia establecer clausalas.
                                Se puede resolver todos los problemas de programacion pero a un costo muy alto                                
                                ej: Si el aire esta prendido y la habitacion esta climatizada , pausar el aire.


        Programacion estructurada -> Hay estructuras de repeticion, tiene inicio final y es controlada por una
                                cantidad de veces


        Programacion orietanda a funciones y procedimientos .

        POO -> Le da un orden a un diccionario infinito, no es un paradigma nuevo, es un paradigma fines de los 90 

        P??rametros de entrada : Son valores que ingresan a un metodo, para ser usados dentro del metodo.
                                Un parametro es una variable que solo vive dentro del m??todo. TIene un tipo
                                de datos asociado. El usuario es quien envia el valor.

        Sobrecarga de m??todos: Es la presencia de m??todos con el mismo nombre dentro 
                                de una clases ( 2 metodos que se llaman igual)
                                Pero debe variar la firma de parametros de entrada(deben entrar dif parametros.)



        Metodos con devolucion de valor : Los metodos pueden devolver un valor una vez terminada la operacion
                                        Ese valor tiene un tipo de datos asociado es decir pertecene a un tipo de dato
                                        primitivo(conocidos) Si no devuelve valor, se coloca void.


        Constructores : Son emetodos que inicializan el objeto
                        Los constructores inicializa un objeto, tienen el mismo nombre que la clase
                        y pueden recibir parametros de entrada, se pueden sobrecargar y no tienen devolucion
                        de parametros/valor.
                        Se invoca automaticamente con la palabra new al crear un objeto.
                        Cuando una clase no tiene constructor Java agrega un constructor vacio al compilar.


        Constructores en Java : En java los constructores son objetos de la clase java.lang.reflect.constructor


         */



 

        // -----Auto1------
        System.out.println("--auto!--");
        Auto auto1 = new Auto(); //aca llamo a un constuctor vacio
                                // Va a ver un error porque java no agrega mas el consctructor vacio
                                // pero lo debemos hacer nosotros en la otra vi??eta.
                                

        //Colocamos estado al objeto auto1
        auto1.marca="Fiat";
        auto1.modelo="Mobi";
        auto1.color="Rojo";
        auto1.acelerar();           //10
        auto1.acelerar();           //20
        auto1.acelerar();           //30
        auto1.frenar();             //20
        auto1.acelerar(23);         //43  // en este caso el usuario elije cuanto acelerar.



        System.out.println(auto1.marca+" "+auto1.modelo+" "+auto1.color+" "+auto1.velocidad);
        // Atriubutos String se inicializan en null
        // Los atributos numeros se incializan automaticamente en 0
        // Atributos no variables,


        // int x;
        // System.out.println(x);

        // Lo de arriba sale con error porque la variable no esta inicializada, no es como el atributo.
        // Los primitivos no son nuleables ejemplo abajo

        // x = null;


        // ------ Auto2 -------
        System.out.println("---Auto2---");
        Auto auto2= new Auto();         // se inicializa un objeto sin estado, con el contrusctor vacio.
        auto2.marca ="Ford";
        auto2.modelo = "Fiesta";
        auto2.color = "Negro";
        
        for(int a=0; a<=60; a++) auto2.acelerar(); // Recorre el auto con el int 60 veces -> 60 * 10 = 610


        System.out.println(auto2.marca+" "+ auto2.modelo+ " "+ auto2.color+ " "+ auto2.velocidad);



        System.out.println("---Auto3----");
        Auto auto3 = new Auto("Renault", "Kango", "Bordo");

        auto3.acelerar(45);

        auto3.imprimirVelocidad();
        System.out.println(auto3.obtenerVelocidad());


        //Para mostrar un mensaje fuera de la consola y le aparezca al usuario
        
        JOptionPane.showMessageDialog(null,"velocidad: " +  auto3.obtenerVelocidad());


        //metodo toString() //Auto@657c8ad9 escribe nombre de la clase que es auto, un arroba y lo que sigue}
        // es el codigo hash, todos los objetos tienen un codigo es un ID que ayuda a java a identificar lo que es
        // Lo que nos interesa es que la propiedad de nombrar a un objeto y que invoque a ese objeto.
        System.out.println(auto3.getEstado());
        System.out.println(auto3.toString());
        System.out.println(auto3); //3

        //En auto pusimos el metodo toString y trae el estado del objeto.
        // cuando estoy diciendo auto3 (3) es mas comodo y automaticamente obtengo el estado 
        //


        /*
                Modificadores de visibilidad (Para miembros de clases atributos o metodos.)

                Modificador                     Alcance
                default                         El miembro es visible desde la mismca clase y clases
                                                del mismo paquete

                publico                         El miembro es visible desde cualquier clase.
                
                
                private                         El miembro es visible desde la misma clase.


                protected                       el mimebro es visible desde la misma clase, desde clases hijas 
                                                y desde clases del mismo paquete.

        */

        Auto autox = new Auto("Citroen", "C4", "Bordo");
        autox.acelerar(350);
    
        System.out.println(autox); // no supera los 100 km porque le puse que no se puede
        autox.velocidad = 50000; // como el atributo acelerar esta abierto lo puedo cambiar directamente y tiene
                                 // una vulnerabilidad de la clase

        Empleado  empleado1 = new Empleado(1, "Juan", "Zamora", 250000);
        // empleado1.getSueldoBasico= 30000; // como esta privado no puede modificar.
        empleado1.setsueldoBasico(30000);
        System.out.println(empleado1);
    
    }   
    
}
