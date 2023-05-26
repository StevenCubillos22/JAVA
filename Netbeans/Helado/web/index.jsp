<%-- 
    Document   : index
    Created on : May 21, 2023, 7:55:56 PM
    Author     : Steven´s Laptop
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Heladeria</title>
        <style>
        
        body {
            background-image: url('imgs/fondohalldef.png');
            background-repeat: no-repeat;
            background-size: 99%;
        }
            
        .contenedor {
            display: flex;
            width: 100%;
            justify-content: center;
            margin-top: 105px;
        }
        
        .sabor {
            text-align: center;
            color: white;
            padding: 1em;
        }
        
        .error {
            text-align: center;
            color: red;
        }
</style>
    </head>
    <body>
         
        
        <form action="helado.jsp">
            <div class="contenedor">
                <div class="sabor">
                    <img src="imgs/chocolate.png" width="200px"><br>
                    C h o c o l a t e:
                    <input type="number" value="0" min="0" max="100" name="chocolate"> %
                </div>
                <div class="sabor">
                    <img src="imgs/ff.png" width="200px"><br>
                    F r e s a :
                    <input type="number" value="0" min="0" max="100" name="fresa"> %
                </div>     
                <div class="sabor">
                    <img src="imgs/vainilla.png" width="200px"><br>
                    V a i n i l l a :
                    <input type="number" value="0" min="0" max="100" name="vainilla"> %
                </div>
            </div>
            
            <div class="contenedor">
                <div>
                    <input type="submit" value="¡A marchar el helado!">
                </div>
            </div>
        </form>

        <div class="error">
            <p>
                <%= session.getAttribute("error") == null ? "" : session.getAttribute("error") %>
                <% session.removeAttribute("error"); %>
            </p>
        </div>
    </body>
</html>
