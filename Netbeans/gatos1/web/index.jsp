<%-- 
    Document   : index
    Created on : May 11, 2023, 11:21:23 AM
    Author     : Steven´s Laptop
--%>
<%-- index.jsp (proyecto GatosConClaseYBocadillos) --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="daw1.Gato"%>

<!DOCTYPE html>
<html>
<head>   
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Gatos con clase</title>


<link rel="stylesheet" type="text/css" href="estilos.css" />

<style> 
    
  body {
  background-image: url('imagenes2/wallpaperp.jpg');
  background-repeat: no-repeat;
  background-size: cover;
  font-family: Arial, sans-serif;
}

  .bocadillo {
        position: relative;
        display: inline-block;
        padding: 15px;
        margin-bottom: 21px;
        margin-right: 10px;
        background-color: #333;
        color: white;
        border-radius: 5px;
    }
    
    .bocadillo:before {
    content: "";
    position: absolute;
    top: 0;
    left: -10px;
    width: 0;
    height: 0;
    border-style: solid;
    border-width: 10px 0 10px 10px;
    border-color: transparent transparent transparent #333;
    }
    
    .logo-container {
        position: absolute;
        top: 0;
        left: 0;
        padding: 10px;
    }

    .logo img {
        width: 170px; 
        height: auto;
    }

</style>

</head>
<body>
<div class="logo">
  <img src="imagenes2/newlogop3.png" alt="logo">
</div>
<h1>Gatos con clase(aunque sea con perro y oso)</h1>
<hr>
<%
    if (request.getParameter("submit") != null) {
        String nomb1 = request.getParameter("nombre1");
        String nomb2 = request.getParameter("nombre2");
        String nomb3 = request.getParameter("nombre3");
        
         Gato g1 = new Gato(nomb1, "imagenes2/koromaru3.png");
         Gato g2 = new Gato(nomb2, "imagenes2/kuma2.png");
         Gato g3 = new Gato(nomb3, "imagenes2/morgana2.png");

         out.println("<img src='" + g1.getImagen() + "' width='85'>Hola, soy " + g1.getNombre() + "<br>");
         out.println("<img src='" + g2.getImagen() + "' width='85'>Hola, soy " + g2.getNombre() + "<br>");
         out.println("<img src='" + g3.getImagen() + "' width='85'>Hola, soy " + g3.getNombre() + "<br>");
%> 
<br> <hr> 

    <div class="bocadillo">
        <span><%= g1.frases(g1, g2, g3) %></span><br>
    </div>

    <div class="bocadillo">
        <span><%= g2.frases(g1, g2, g3) %></span><br>
    </div>

    <div class="bocadillo">
        <span><%= g3.frases(g1, g2, g3) %></span><br>
    </div>


<% } else { %>
<form action="index.jsp" method="post">
    <label for="nombre1">Nombre del Personaje 1:</label>
    <select name="nombre1" id="nombre1" required>
        <option value="Koromaru">Koromaru</option>
        <option value="Kuma">Kuma</option>
        <option value="Morgana">Morgana</option>
    </select><br>

    <label for="nombre2">Nombre del Personaje 2:</label>
    <select name="nombre2" id="nombre2" required>
        <option value="Koromaru">Koromaru</option>
        <option value="Kuma">Kuma</option>
        <option value="Morgana">Morgana</option>
    </select><br>

    <label for="nombre3">Nombre del Personaje 3:</label>
    <select name="nombre3" id="nombre3" required>
        <option value="Koromaru">Koromaru</option>
        <option value="Kuma">Kuma</option>
        <option value="Morgana">Morgana</option>
    </select><br>

    <input type="submit" name="submit" value="Enviar">
</form>
<%
    }
%>
</body>
</html>
