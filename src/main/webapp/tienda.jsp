<%-- 
    Document   : tienda
    Created on : 21-oct-2016, 8:58:38
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>TIENDA ROPA</h2>
        <form name="tienda" method="POST" enctype="carritoServlet">
            <select id="articulos">
                <option name="camisa">Camisa 25</option>
                <option name="pantalon">Pantalon 20</option>
                <option name="jersey">Jersey 30</option>
                <option name="zapatos">Zapatos 45</option>
                <option name="chaqueta">Chaqueta 60</option>
            </select>
            <input type="submit" name="comprar" value="Comprar" />
            <input type="button" name="finalizar" value="Finalizar compra" />
        </form>
    </body>
</html>
