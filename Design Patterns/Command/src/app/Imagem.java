package app;


public class Imagem {
    private final String caminho;
    private final int posição;

    public String getCaminho()
    {
        return caminho;
    }

    public int getPosição()
    {
        return posição;
    }

    public Imagem(String caminho, int posição)
    {
        this.caminho = caminho;
        this.posição = posição;
    }

}
