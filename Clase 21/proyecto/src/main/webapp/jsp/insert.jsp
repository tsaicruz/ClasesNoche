<%@page import="ar.org.centro8.curso.java.proyecto.utils.file.I_File"%>
<%@page import="ar.org.centro8.curso.java.proyecto.utils.file.FileText"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>

<%  
I_File fileText = new FileText("datos.csv");  
// esto me permite guardar en un archivo
%>

<% 

    try {

        // el problema es que file text lo tengo que importar
        


          // capturo los datos del formulario
          String nombre = request.getParameter("nombre");
          String apellido = request.getParameter("apellido");
          String telefono = request.getParameter("telefono");
          String email =  request.getParameter("email");

          
          

          if(nombre!=null & apellido!=null && telefono!=null && email!=null){
              String contacto = nombre + ", " + apellido +",  " + telefono + ", " + email ;
              fileText.addLine(contacto);

              out.println("<div id='info'> Se ingreso un contacto! :) </div>");
          }
          else{
               out.println("<div id='error'> ¡¡¡Falta ingresar Parámetros!!!</div>");
          }          
    } catch (Exception e) {
         out.println("<div id='error'> ¡¡¡Falta ingresar Parámetros!!!</div>");
    }

%>

<% 
// armar tabla para que se puedan ver los datos ingresados
List<String>contactos=fileText.getAll();
String table = "<table id=tablaContactos>";
table+="<tr><th>Nombre</th><th>Apellido</th><th>Telefono</th><th>Email</th></tr>";
for(String st:contactos){
String[]registro=st.split(",");
table+="<tr>";
for(String campo:registro) table+="<td>" + campo +"</td>";
table+="</tr>";
    }

table+="</table>";
out.println(table);
%>
