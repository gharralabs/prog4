package app;


public class InserirImagemComando implements Comando
{
    private final Documento documento;
    private Imagem imagem;

    public InserirImagemComando(Documento documento)
    {
        this.documento = documento;
    }
    
    @Override
    public void fazer()
    {
        imagem = documento.localizarImagem();
        documento.inserirImagem(imagem);
    }

    @Override
    public void desafazer()
    {
        documento.removerImagem(imagem);
    }

}
