public class clase03 {

    // temas pendientes de la clase 02 y descargar el archivo del profesor.
    // falta confiurar varibles de entorno Java_Home y JRE_Home
    public static void main(String[] args) {
        // Tema pendiente

        String st = "Esto es una cadena de texto!";
        System.out.println(st);
        for (int a = 0; a < st.length(); a++) {
            System.out.print(st.charAt(a));
        }
        System.out.println();

        // Imprimir todo en minuscula

        for (int a = 0; a < st.length(); a++) {
            char car = st.charAt(a);
            if (car >= 65 && car <= 90)
                car += 32;
            System.out.print(car);
        }
        System.out.println();

        // Operador Ternario = (?) es el unico que es un operador en tres terminos,es
        // igual a la prueba condicional de excel
        // tenario porque tiene 3 terminos una logica una verdad y un valor falso.
        for (int a = 0; a < st.length(); a++) {
            char car = st.charAt(a);
            System.out.print((car >= 65 && car <= 90) ? car += 32 : car);
        }
        System.out.println();



        // Imprimir todo en mayuscula
        for (int a = 0; a < st.length(); a++) {
            char car = st.charAt(a);
            System.out.print((car>= 97 && car <= 122) ? car -= 32 : car);
        }
        System.out.println();


        //------------------------------- TODO LO DE ARRIBA ES PROGRAMACION ESTRUCTURADA. -----------------------------------

        //
        System.out.println(st.toLowerCase());  // todo en minuscula
        System.out.println(st.toUpperCase());  // todo en mayuscula



    }
}
