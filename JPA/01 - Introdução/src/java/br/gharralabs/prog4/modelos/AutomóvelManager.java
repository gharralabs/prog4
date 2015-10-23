
package br.gharralabs.prog4.modelos;

import java.util.List;

public interface AutomóvelManager {
    
    void salvar(Automóvel auto);
    public List<Modelo> obterModelos();
    
}
