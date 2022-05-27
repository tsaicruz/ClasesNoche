package ar.org.centro8.curso.java.proyecto.utils.html;

import java.lang.reflect.Field;
import java.util.List;

public class HtmlTable<E> { // devuelve una string con una tabla html, y E es lo que el usuario desea.
    public String getTable(List<E> list) {
        if (list == null || list.isEmpty()) // aca recorro la lista registro por registro
            return "";
        String table = "<table id='tabla' >";
        E e = list.get(0); // del primer objeto de la lista pido los datos y recorro los campos
        Field[] campos = e.getClass().getDeclaredFields();
        table += "<tr>";
        for (Field c : campos) {
            // System.out.println(c);
            table += "<td>" + c.getName() + "</td>";
        }
        table += "</tr>";
        for (E x : list) {
            table += "<tr>";
            for (Field c : campos) {
                table += "<td>";
                try {
                    String method = "get" + c.getName().substring(0, 1).toUpperCase() + c.getName().substring(1);
                    table += x.getClass().getMethod(method, null).invoke(x, null);
                } catch (Exception ex) {
                }
                table += "</td>";
            }
            table += "</tr>";
        }
        table += "</table>";
        return table;
    }
}
