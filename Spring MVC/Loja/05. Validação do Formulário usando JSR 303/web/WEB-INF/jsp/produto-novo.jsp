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
           
            <form:errors path="*"/>
            
            <label for="nome">Nome:</label>
            <form:input id="nome" 
                        path="nome" 
                        type="text" />     
            
            <form:errors path="nome"/>
            
            <label for="precoUnitario">Preço Unitário:</label>
            <form:input id="precoUnitario" 
                        path="precoUnitario" 
                        type="text" />
            
            <form:errors path="precoUnitario"/>
            
            <input type="submit" value="Salvar">
        </form:form>
    </body>
</html>
