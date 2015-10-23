package br.gharralabs.prog4.modelos;

import java.util.List;

public interface AutomóvelRepositório 
{
    Automóvel salvar(Automóvel auto);
    public List<Modelo> obterModelos();
}
