package app;

import java.io.InputStream;
import java.util.Properties;


public class AplicaçãoImpl extends Aplicação {

    @Override
    public Documento criarDocumento()
    {
        Documento  doc;

        Properties prop = new Properties();
        InputStream in;
        in = getClass().getResourceAsStream("/app/app.properties");
        try 
        {
            prop.load(in);
            in.close();
            
            String documentClass = "app." + (String) prop.get("document_class");
            doc = (Documento) Class.forName(documentClass).newInstance();
        } 
        catch (Exception ex)  {
            throw new RuntimeException("Tipo de documento inválido");
        }
        
        return doc;
    }

}
