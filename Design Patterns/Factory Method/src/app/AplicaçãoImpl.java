package app;


public class AplicaçãoImpl extends Aplicação {

    @Override
    public Documento criarDocumento(String tipo)
    {
        Documento  doc;
        
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
        
        
        return doc;
    }

}
