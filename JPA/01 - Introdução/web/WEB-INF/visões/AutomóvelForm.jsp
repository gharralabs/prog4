<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cadastro Automóvel</h1>
        
        <form action="automovel/salvar">
            <label for="placa">Placa</label>
            <input type="text" name="placa" id="placa"/>
            
            <label for="anoFabricação">Ano Fabricação</label>
            <input type="text" name="anoFabricação" id="anoFabricação"/>      
            
            <input type="submit" name="salvar" value="salvar"/>
        </form>
    </body>
</html>
