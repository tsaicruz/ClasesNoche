<%@page import="ar.org.centro8.curso.java.proyecto.repositorios.jdbc.AlumnoRepository"%>
<%@page import="ar.org.centro8.curso.java.proyecto.connections.Connector"%>
<%@page import="ar.org.centro8.curso.java.proyecto.utils.html.HtmlTable"%>
<%@page import="ar.org.centro8.curso.java.proyecto.entities.Alumno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">

<head>
    <%@include file="jsp/head.jsp" %>
</head>

<body>
    <%@include file="jsp/menu.jsp" %>
     <h1>Mantenimiento de Alumnos</h1>
    <div class= "form"> <!-- -->
        <form>
            <table>
                    <tr>
                        <td><label class="label"> Nombre: </label></td>
                        <td><input type="text" class="input" name="nombre" required minlength="3" maxlength="20"  /></td>
                    </tr>
                    <tr>
                        <td><label class="label"> Apellido: </label> </td>
                        <td><input type="text" class="input" name="apellido" required minlength="3" maxlength="20" /></td>
                    </tr>
                    <tr>
                        <td><label class="label"> Edad: </label> </td>
                        <td><input type="number" class="input" name="edad" value ="18" required min="18" max="105" /></td>
                    </tr>
                    <tr>
                        <td><label class="label"> Curso: </label></td>
                        <td>                        
                            <select  name="idCurso" class="input2">
                            <%@include file="jsp/cursos.jsp" %>
                            </select>
                        </td><!--Aca arriba no iria cajita de texto, aca va a ir un combobox-->                        
                    </tr>                  
                    <tr>
                        <td><input class ="button" type ="reset" value="Borrar" /></td>
                        <td><input class ="button2" type ="submit" value = "Guardar" /></td>
                    </tr>                   
                </table>
        </form> 

        <%@include file="jsp/alumnosAltas.jsp" %>
    </div>
    
    <div class="form">
        <form>
            <label class = "label"> Buscar por Apellido: </label>
            <input type="text" name ="buscarApellido" class="input" />
        </form>
        
        <div class="datos">
            <%@include file="jsp/alumnosTabla.jsp" %>
        </div>
    </div>

    
    

</body>

</html>