<%-- 
    Document   : index
    Created on : May 17, 2023, 4:50:01 PM
    Author     : Steven´s Laptop
--%>

<%@page import="daw1.Personaje"%>
<%@ page import="java.util.Random" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title> Piedra, papel o tijera from MS</title>
    <link rel="stylesheet" type="text/css" href="estilos.css" />
    
    <style>
        
        body {
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
        min-height: 100vh;
        background-image: url('imagenes3/fondoAK.png')de;
        background-repeat: no-repeat;
        background-size: 96%;
        font-family: Arial, sans-serif;
        }
        
        .marco {
        display: flex;
        justify-content: space-between;
        align-items: center;
        margin-bottom: 25px;
        padding: 20px;
        background-color: #FFDAB9;
        border-radius: 35px;
        box-shadow: 0 2px 4px rgba(0.3, 0.5, 0.7, 0.9);
        }
        
        .contrincante img {
        max-width: 60px;
        max-height: 60px;
        }
        
        .center {
            text-align: center;
        }
        
        .static-image {
            width: 140px;
            height: 140px;
            background-image: url('imagenes3/alexvs.jpg');
            background-size: cover;
            margin-right: 210px;
         }
         
         .frase {
            font-size: 20px;
         }
         
         
      .form-container {
        margin-top: 110px;
        text-align: center;
       }
       
       .marco:first-child {
           margin-top: 189px;
       }
        
        
    </style>

  
</head>
<body>
    
<%
        Personaje jugador1 = new Personaje("Alex", "imagenes3/AlexVictoria.jpg");
        Personaje jugador2 = new Personaje("Gooseka", "imagenes3/AlexDerrota.jpg");

        int puntosJ1 = 0;
        int puntosJ2 = 0;
        Random random = new Random();

        String jugadaj1String = "";
        String jugadaj2String = "";
        String result = "";

        while (puntosJ1 < 3 && puntosJ2 < 3) {
            int jugadaJ1 = random.nextInt(3);
            int jugadaJ2 = random.nextInt(3);

            switch (jugadaJ1) {
                case 0:
                    jugadaj1String = "Piedra";
                    break;
                case 1:
                    jugadaj1String = "Papel";
                    break;
                case 2:
                    jugadaj1String = "Tijera";
                    break;
            }

            switch (jugadaJ2) {
                case 0:
                    jugadaj2String = "Piedra";
                    break;
                case 1:
                    jugadaj2String = "Papel";
                    break;
                case 2:
                    jugadaj2String = "Tijera";
                    break;
            }

            if (jugadaJ1 == jugadaJ2) {
                result = "Empate";
            } else if ((jugadaJ1 == 0 && jugadaJ2 == 2) ||
                    (jugadaJ1 == 1 && jugadaJ2 == 0) ||
                    (jugadaJ1 == 2 && jugadaJ2 == 1)) {
                puntosJ1++;
                result = "|| "+jugador1.getNombre() + " gana la ronda!";
            } else {
                puntosJ2++;
                result = "|| "+jugador2.getNombre() + " gana la ronda!";
            }

            %>
            <div class="marco">
                <div class="contrincante">
                    <img src="imagenes3/alexRostro2.png">
                </div>
                <div class="frase">
                    <%= jugador1.getNombre() %> >> <%= jugadaj1String %> -V S- <%= jugador2.getNombre() %>: <%= jugadaj2String %>
                </div>
                <div class="contrincante">
                    <img src="imagenes3/genkRostro2.png">
                </div>
                <div class="frase">
                    <%= result %>
                </div>
            </div>
            <%
        }

        if (puntosJ1 == 3) {
            %>
            <h2><%= jugador1.getNombre() %> ES EL VENCEDOR!</h2>
            <img src='<%= jugador1.getImagenVict() %>' width='950'>
            <%
        } else {
            %>
            <h2><%= jugador2.getNombre() %> ES EL VENCEDOR!</h2>
            <img src='<%= jugador2.getImagenVict() %>' width='950'>
            <%
        }
    %>
</body>
</html>

