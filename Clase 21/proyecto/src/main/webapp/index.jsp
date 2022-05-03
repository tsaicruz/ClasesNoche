<%@page contentType="text/html" pageEncoding="UTF-8"%> <!-- PAra que los acentos funcionen si escribieramos todo con acento-->
<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Agenda</title>
    <link href="css/style.css" type="text/css" rel="stylesheet" />
</head>
<!-- Bloque de comentario -->

<body>
    <h1>Agendita Electronica de Contactos</h1>
    <form>

        <table>
            <tr>
                <th colspan="2">Alta de contactos</th>
            </tr>
            <!-- Este colspan ocupa 2 espacios dentro de la tabla - table heat -->
            <tr>
                <td><label>Nombre:</label></td>
                <td><input type="text" name="nombre" required minlength="3" maxlength="20" /></td>
                <!-- oninvalid="this.setCustomValidity('Ingrese nombre')" oninput="this.setCustomValidity(' ')"-->
                <!--html se encarga de que sea requerido , incluso controla la longitud que sea entre 3 a 20 caracteres.-->
            </tr>
            <tr>
                <td><label>Apellido:</label></td>
                <td><input type="text" name="apellido" required minlength="3" maxlength="20" /></td>
            </tr>
            <tr>
                <td><label>Telefono:</label></td>
                <td><input type="text" name="telefono" required minlength="3" maxlength="20" /></td>
            </tr>
            <tr>
                <td><label>Email:</label></td>
                <td><input type="email" name="email" required minlength="3" maxlength="40" /></td>
                <!-- el tipo email controla automaticamente que tenga forma de email @ y el .com-->
            </tr>
            <tr>
                <td><input type="reset" value="Borrar" /></td>
                <td><input type="submit" value="Guardar" /></td>
                <!-- submit -> boton que se encarga de guardar el formulario.-->
                
            </tr>
        </table>
    </form>
    <!-- abrimos un scriplet para hacer codigo Java -->
    <%@include file="jsp/insert.jsp" %>


</body>

</html>