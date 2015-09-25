package app;

import java.util.*;

public abstract class Aplicação 
{
    List<Documento> documentos = new ArrayList<>();
    
    public abstract Documento criarDocumento();
    
    
    public Documento NovoDocumento()
    {
        Documento doc;
        doc = criarDocumento();
        documentos.add(doc);
        doc.abrir();
        return doc;
    }
}