<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cadastro Automóvel</h1>
        
        <form action="salvar" method="POST">
            <label for="placa">Placa</label>
            <input type="text" name="placa" id="placa"/>
            
            <label for="anoFabricacao">Ano Fabricação</label>
            <input type="text" name="anoFabricacao" id="anoFabricacao"/>      
            
            <label for="modeloId">Modelo: </label>
            
            <select name="modeloId">
                <c:forEach var="modelo" items="${modelos}">
                    <option value="${modelo.id}">${modelo.descrição}</option>
                </c:forEach>
            </select>
            
            
            <input type="submit" name="salvar" value="salvar"/>
        </form>
    </body>
</html>
