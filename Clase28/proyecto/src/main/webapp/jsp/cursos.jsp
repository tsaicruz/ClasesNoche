<%@page import="ar.org.centro8.curso.java.proyecto.repositorios.jdbc.CursoRepository"%>
<%@page import="ar.org.centro8.curso.java.proyecto.connections.Connector"%>
<%@page import="ar.org.centro8.curso.java.proyecto.entities.Curso"%>
<%
for(Curso c: new CursoRepository(Connector.getConnection()).getAll()){
    out.println("<option value='"+c.getId() + "'>"+c.getId() + " " + c.getTitulo() + " " + c.getProfesor()+ " " 
     + c.getTurno()+"</option>");
}
%>