<% 
  
    try {
          // capturo los datos del formulario
          String nombre = request.getParameter("nombre");
          String apellido = request.getParameter("apellido");
          String telefono = request.getParameter("telefono");
          String email =  request.getParameter("email");
          
          //TODO falta guardar en el archivo 

          out.println("<div id='info'> Se ingreso un contacto!</div>");
    } catch (Exception e) {
        out.println("<div id='error'> Falta ingresar Parámetros</div>");
    }

%>