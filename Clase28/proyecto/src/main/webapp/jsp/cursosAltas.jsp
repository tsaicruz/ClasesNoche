<%@page import="ar.org.centro8.curso.java.proyecto.connections.Connector"%>
<%@page import="ar.org.centro8.curso.java.proyecto.repositorios.jdbc.CursoRepository"%>
<%@page import="ar.org.centro8.curso.java.proyecto.enums.Turno"%>
<%@page import="ar.org.centro8.curso.java.proyecto.enums.Dia"%>
<%@page import="ar.org.centro8.curso.java.proyecto.entities.Curso"%>
<%@page import="ar.org.centro8.curso.java.proyecto.utils.text.validator.TextValidator"%>
<% 
    try {
        String titulo=request.getParameter("titulo");
        String profesor=request.getParameter("profesor");
        String dia=request.getParameter("dia");
        String turno=request.getParameter("turno");
        if(
            new TextValidator(titulo).length(3, 20) &&
            new TextValidator(profesor).length(3, 20)
        ){
            Curso curso=new Curso(
                                    titulo, 
                                    profesor, 
                                    Dia.valueOf(dia), 
                                    Turno.valueOf(turno)
                                  );
          
          
          new CursoRepository(Connector.getConnection()).save(curso);
          out.println("<div class='info'>se guardo el curso id: "+ curso.getId() + "</div>");    
          /*  poniendo curso.getid obtengo el id de la persona que se registra en el curso*/
          
        }else{
            {
            out.println("<div class='error'>Falta completar parametros</div>");
    }
        }
    } catch (Exception e) {
        System.out.println("****************************************************");
        System.out.println(e);
        System.out.println("****************************************************");
        if(request.getParameter("titulo") != null){
        out.println("<div class='error'>No se pudo guardar el curso</div>");
    }
    
    }
%>