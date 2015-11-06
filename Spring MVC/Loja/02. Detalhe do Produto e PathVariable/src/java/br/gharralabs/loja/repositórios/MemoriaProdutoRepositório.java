package br.gharralabs.loja.repositórios;

import br.gharralabs.loja.modelos.Produto;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class MemoriaProdutoRepositório implements ProdutoRepositório{

    
    private static List<Produto> produtos = new ArrayList<>();
    
    static
    {
        produtos.add( new Produto() );
        produtos.get(0).setId(1L);
        produtos.get(0).setNome("iphone");
        produtos.get(0).setPreçoUnitário(9999.99);
        
        produtos.add( new Produto() );
        produtos.get(1).setId(2L);
        produtos.get(1).setNome("Samsung Galaxy");
        produtos.get(1).setPreçoUnitário(1499.99);        
        
        produtos.add( new Produto() );
        produtos.get(2).setId(2L);
        produtos.get(2).setNome("Moto G");
        produtos.get(2).setPreçoUnitário(699.99);
    }
    
    @Override
    public List<Produto> obterTodos()
    {
        return produtos;
    }

    @Override
    public Produto obterPorId(long id)
    {
        Produto produto;
        produto = produtos.stream()
                          .filter(p -> p.getId() == id )
                          .findFirst()
                          .get();
        
        return produto;
    }

}
