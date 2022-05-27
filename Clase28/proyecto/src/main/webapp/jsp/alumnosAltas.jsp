<%@page import="ar.org.centro8.curso.java.proyecto.repositorios.jdbc.AlumnoRepository"%>
<%@page import="ar.org.centro8.curso.java.proyecto.entities.Alumno"%>
<%@page import="ar.org.centro8.curso.java.proyecto.connections.Connector"%>
<%@page import="ar.org.centro8.curso.java.proyecto.utils.text.validator.TextValidator"%>
<% 
    try {
        String nombre=request.getParameter("nombre");
        String apellido=request.getParameter("apellido");
        int edad = Integer.parseInt(request.getParameter("edad"));
        int idCurso = Integer.parseInt(request.getParameter("idCurso")) ;
        if(
            new TextValidator(nombre).length(3, 20) &&
            new TextValidator(apellido).length(3, 20)
        ){
            Alumno alumnos =new Alumno(
                                    nombre, 
                                    apellido, 
                                    edad, 
                                    idCurso
                                  );
          
          
          new AlumnoRepository(Connector.getConnection()).save(alumnos);
          out.println("<div class='info'>se guardo el curso id: "+ alumnos.getId() + "</div>");    
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
        if(request.getParameter("nombre") != null){
        out.println("<div class='error'>No se pudo guardar el curso</div>");
    }
    
    }
%>