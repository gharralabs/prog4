package br.gharralabs.loja.repositórios;

import br.gharralabs.loja.modelos.Produto;
import java.util.List;



public interface ProdutoRepositório {
    List<Produto> obterTodos();

    public Produto obterPorId(long id);

    public void adicionar(Produto produto);
}
