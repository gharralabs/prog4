package app;


public class NegritoComando implements Comando {
    private final Documento documento;
    private Trecho trecho;
    
    public NegritoComando(Documento documento)
    {
        this.documento = documento;
    }
    
    
    @Override
    public void fazer()
    {
        trecho = documento.selecionarTrecho();
        documento.aplicarNegrito(trecho);
    }

    @Override
    public void desafazer()
    {
        documento.desfazerNegrito(trecho);
    }

}
