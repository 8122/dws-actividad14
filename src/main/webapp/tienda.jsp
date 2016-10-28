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
        <script>
            function anyadir(){
                var texto = "";
                var articulo = document.getElementById("articulos");
                switch(articulo.value){
                    case "Camisa 25":
                        valordocument.getElementById("Camisa").value = 1;
                //}
            }
        </script>
    </head>
    <body>
        <h2>TIENDA ROPA</h2>
        <form name="tienda" method="POST" enctype="carritoServlet">
            <select id="articulos">
                <option name="Camisa">Camisa 25</option>
                <option name="Pantalon">Pantalon 20</option>
                <option name="Jersey">Jersey 30</option>
                <option name="Zapatos">Zapatos 45</option>
                <option name="Chaqueta">Chaqueta 60</option>
            </select>
            <input type="submit" name="comprar" value="Comprar" onclick="anyadir()"/>
            <input type="submit" name="finalizar" value="Finalizar compra" /><br>
            <h3>Carrito</h3>
            Camisas: <input id="Camisa" type="text" value="0"/><br>
            Camisas: <input id="Pantalon" type="text" value="0"/><br>
            Camisas: <input id="Jersey" type="text" value="0"/><br>
            Camisas: <input id="Zapatos" type="text" value="0"/><br>
            Camisas: <input id="Chaqueta" type="text" value="0"/><br>
            
        </form>
    </body>
</html>
