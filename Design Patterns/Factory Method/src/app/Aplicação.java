package app;

import java.util.*;

public abstract class Aplicação 
{
    List<Documento> documentos = new ArrayList<>();
    
    public abstract Documento criarDocumento(String tipo);
    
    
    public Documento NovoDocumento(String tipo)
    {
        Documento doc;
        doc = criarDocumento(tipo);
        documentos.add(doc);
        doc.abrir();
        return doc;
    }
}