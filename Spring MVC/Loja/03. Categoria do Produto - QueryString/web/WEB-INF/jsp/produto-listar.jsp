<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista de Produtos</h1>
        
        <ul>
        <c:forEach items="${produtos}" var="produto">
            <li>
                <div class="nome-produto">
                    <a href="${produto.id}">${produto.nome} </a>
                </div>
                <div class="preço">${produto.preçoUnitário}</div>
            </li>
        </c:forEach>
        </ul>
    </body>
</html>
