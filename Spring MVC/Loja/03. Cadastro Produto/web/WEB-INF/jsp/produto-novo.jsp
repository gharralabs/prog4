<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Novo Produto</h1>
        
        <form:form modelAttribute="novoProduto">
           
            <label for="nome">Nome:</label>
            <form:input id="nome" 
                        path="nome" 
                        type="text" />            
            
            <label for="precoUnitario">Preço Unitário:</label>
            <form:input id="precoUnitario" 
                        path="precoUnitario" 
                        type="text" />
            
            
            <input type="submit" value="Salvar">
        </form:form>
    </body>
</html>
