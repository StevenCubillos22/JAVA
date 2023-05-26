<%-- 
    Document   : helado
    Created on : May 21, 2023, 8:22:15 PM
    Author     : Steven´s Laptop
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    <style>
        .contenedor {
            display: flex;
            width: 100%;
            justify-content: center;
        }
        
        .tarrina {
            width: 320px;
            border-width: 6px;
            border-radius: 4px;
            border-color: brown;
            border-style: solid;
            border-top-color: white;
        }
    </style>
</head>
<body>
    <%
        int chocolate = Integer.parseInt(request.getParameter("chocolate"));
        int fresa = Integer.parseInt(request.getParameter("fresa"));
        int vainilla = Integer.parseInt(request.getParameter("vainilla"));
        int nada = 100 - (chocolate + fresa + vainilla);
        
        if (chocolate + vainilla + fresa > 100) {
            session.setAttribute("Lo sientp", "El porcentaje no tiene que ser mayor que  100% D:");
            response.sendRedirect("index.jsp");
        } else {
    %>
    <h1 style="text-align: center;">Aquí tiene su tarrina de helado</h1>
    <div class="contenedor">
        <div class="tarrina">
            <!-- Espacio vacío hasta completar el tamaño de la tarrina -->
            <div style="height: <%= nada %>px"></div>
            <% if (chocolate > 0) { %>
                <!-- Chocolate -->
                <div style="height: <%= chocolate %>px; background-color: #57331b;">Chocolate <%= chocolate %>%</div>
            <% } %>
            <% if (fresa > 0) { %>
                <!-- Fresa -->
                <div style="height: <%= fresa %>px; background-color: #ecacd6;">Fresa <%= fresa %>%</div>
            <% } %>
            <% if (vainilla > 0) { %>
                <!-- Vainilla -->
                <div style="height: <%= vainilla %>px; background-color: #f7d88e;">Vainilla <%= vainilla %>%</div>
            <% } %>
        </div>
    </div>
    <%
        }
    %>
</body>
</html>
