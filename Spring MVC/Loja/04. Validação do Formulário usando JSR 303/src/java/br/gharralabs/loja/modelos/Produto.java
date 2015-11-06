package br.gharralabs.loja.modelos;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;



public class Produto {

    private long id;
    @Min(value = 3, message = "Nome do produto deve conter um valor maior que 3")
    private String nome;
    
    @Min(value=0, message="Preço unitário deve ser maior ou igual a 0")
    @NotNull(message="Valor deve ser preenchido")
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
