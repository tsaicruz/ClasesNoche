<%@page import="ar.org.centro8.curso.java.proyecto.repositorios.jdbc.AlumnoRepository"%>
<%@page import="ar.org.centro8.curso.java.proyecto.connections.Connector"%>
<%@page import="ar.org.centro8.curso.java.proyecto.utils.html.HtmlTable"%>
<%@page import="ar.org.centro8.curso.java.proyecto.entities.Alumno"%>

<% 
    String buscarApellido=request.getParameter("buscarApellido");
    if(buscarApellido==null)buscarApellido="";
     out.println(new HtmlTable<Alumno>().getTable(
                    new AlumnoRepository(Connector.getConnection())
                         .getLikeApellido(buscarApellido)
                )
     ); 
%>


