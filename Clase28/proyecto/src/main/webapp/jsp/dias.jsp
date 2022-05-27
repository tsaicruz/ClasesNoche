<%@page import="ar.org.centro8.curso.java.proyecto.enums.Dia"%>
<%
for(Dia d:Dia.values()){
    out.println("<option value='"+d+"'>"+d.toString().toLowerCase()+"</option>");
}
%>