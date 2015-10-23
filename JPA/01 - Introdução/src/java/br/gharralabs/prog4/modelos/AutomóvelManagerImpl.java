package br.gharralabs.prog4.modelos;

import java.util.List;


public class AutomóvelManagerImpl implements AutomóvelManager{
    private final AutomóvelRepositório repositório;

    public AutomóvelManagerImpl()
    {
        this.repositório = new AutomóvelRepositórioImpl();
    }
    
    @Override
    public void salvar(Automóvel auto)
    {
        repositório.salvar(auto);
    }

    @Override
    public List<Modelo> obterModelos()
    {
        return repositório.obterModelos();
    }

}
