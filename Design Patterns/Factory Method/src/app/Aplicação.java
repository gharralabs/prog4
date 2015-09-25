package app;

import java.util.*;

public class Aplicação 
{
    List<Documento> documentos = new ArrayList<>();
    
    public Documento NovoDocumento(String tipo)
    {
        Documento doc;
        
        switch(tipo)
        {
            case "pdf":
                doc = new DocumentoPdf();
                break;
            case "word":
                doc = new DocumentoWord();
                break;
            default:
                throw new RuntimeException("Tipo de documento não existe");
        }
        
        documentos.add(doc);
        doc.abrir();
        return doc;
    }
}