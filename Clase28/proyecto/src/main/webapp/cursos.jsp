
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="es">

<head>
    <%@include file="jsp/head.jsp" %>
</head>

<body>
    <%@include file="jsp/menu.jsp" %>
    <h1>Mantenimiento de cursos</h1>
    <div class= "form"> <!-- -->
        <form>
            <table>
                    <tr>
                        <td><label class="label"> Titulo: </label></td>
                        <td><input type="text" class="input" name="titulo" required minlength="3" maxlength="20"  /></td>
                    </tr>
                    <tr>
                        <td><label class="label"> Profesor:</label> </td>
                        <td><input type="text" class="input" name="profesor" required minlength="3" maxlength="20" /></td>
                    </tr>
                    <tr>
                        <td><label class="label"> Día: </label></td>
                        <td>                        
                            <select  name="dia" class="input2">
                            <%@include file="jsp/dias.jsp" %>
                         <!--    <option value="LUNES"> Lunes </option>
                            ACA USAURIAMOS MARTES,MIERCOLES,JEVES YT VIERNES PERO VAMOS A IMPORTARLO DE OTRO LADO
                        -->
                            </select>
                        </td><!--Aca arriba no iria cajita de texto, aca va a ir un combobox-->                        
                    </tr>
                    <tr>
                        <td><label class="label">Turno : </label></td>
                        <td>
                            <select name="turno" class="input2" >
                            <%@include file="jsp/turnos.jsp" %>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td><input class ="button" type ="reset" value="Borrar" /></td>
                        <td><input class ="button2" type ="submit" value = "Guardar" /></td>
                    </tr>                   
                </table>
        </form>
        <%@include file="jsp/cursosAltas.jsp" %>
    </div>
    <div class="form">
        <form>
            <label class = "label"> Buscar por Titulo: </label>
            <input type="text" name ="buscarTitulo" class="input" />
        </form>
        
        <div class="datos">
                <%@include file="jsp/cursosTabla.jsp" %>
        </div>
    </div>

</body>

</html>