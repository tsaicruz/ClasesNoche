 <%@page import="ar.org.centro8.curso.java.proyecto.enums.Turno"%>
<%
 for(Turno t:Turno.values()){
 out.println("<option value='"+t+"'>"+t.toString().toLowerCase()+"</option>");   
 }
%>