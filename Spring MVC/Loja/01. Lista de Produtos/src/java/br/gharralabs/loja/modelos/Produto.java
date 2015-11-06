package br.gharralabs.loja.modelos;


public class Produto {

    private long id;
    private String nome;
    private Number preçoUnitário;

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

    public Number getPreçoUnitário()
    {
        return preçoUnitário;
    }

    public void setPreçoUnitário(Number preçoUnitário)
    {
        this.preçoUnitário = preçoUnitário;
    }
    
}
