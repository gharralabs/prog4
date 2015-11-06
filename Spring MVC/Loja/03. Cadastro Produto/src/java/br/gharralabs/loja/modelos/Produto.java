package br.gharralabs.loja.modelos;


public class Produto {

    private long id;
    private String nome;
    private Number precoUnitario;

    public Number getPrecoUnitario()
    {
        return precoUnitario;
    }

    public void setPrecoUnitario(Number precoUnitario)
    {
        this.precoUnitario = precoUnitario;
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
}
