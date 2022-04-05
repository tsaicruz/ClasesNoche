
<!DOCTYPE html>
<html lang="es">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Configuración</title>
</head>


<body>
  <!-- hay que agregar el git  -->
  <!-- Para ejecutar el gitbash primero hay que descargar de git el bash embed para verlo de la terminal, y luego
  hay que poner $ sh mvnw spring-boot:run 
   tr :Table row es fila 
   td :Table es columna

  http://localhost:8080/index.html

-->
        <%
        //codigo Java 
        out.println("<h4>Hola mundo JSP!</4>");
          %>



  <h1>Configuracion del sistema</h1>


  <table>
    <tr>                                   
      <td> Sistema operativo: </td>      
      <td><input type = "text" value="
        <% out.println(
              System.getProperty("os.name") +" "+
              System.getProperty("os.version") +" "+ 
              System.getProperty("os.arch"));  %>" readonly size="80"/></td>
    </tr>
    <tr>
      <td>Version de Java: </td>
      <td><input type="text" value="<% out.println(System.getProperty("java.version")); %>" readonly size="80"/></td>
    </tr>
    <tr>
      <td>Nombre de usuario: </td>
      <td><input type="text" value="<% out.println(System.getProperty("user.name")); %>" readonly size="80"/></td>
    </tr>
    <tr>
      <td>Lenguaje de usuario: </td>
      <td><input type="text" value="<% out.println(System.getProperty("user.language")); %>" readonly size="80"/></td>
    </tr>   
  </table>


</body>

</html>