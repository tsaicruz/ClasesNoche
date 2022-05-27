<%@page import="ar.org.centro8.curso.java.proyecto.connections.Connector"%>
<%@page import="ar.org.centro8.curso.java.proyecto.repositorios.jdbc.CursoRepository"%>
<%@page import="ar.org.centro8.curso.java.proyecto.utils.html.HtmlTable"%>
<%@page import="ar.org.centro8.curso.java.proyecto.entities.Curso"%>
<% 
    String buscarTitulo=request.getParameter("buscarTitulo");
    if(buscarTitulo==null) buscarTitulo="";
    out.println(
            new HtmlTable<Curso>().getTable(
                new CursoRepository(
                        Connector.getConnection()
                ).getLikeTitulo(buscarTitulo)
      )); 
%>
