package br.gharralabs.loja.repositórios;

import br.gharralabs.loja.modelos.Categoria;
import br.gharralabs.loja.modelos.Produto;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Repository;

@Repository
public class MemoriaProdutoRepositório implements ProdutoRepositório{

    
    private static final List<Produto> produtos = new ArrayList<>();
    
    static
    {
        Categoria categoria1 = new Categoria();
        categoria1.setId(1);
        categoria1.setNome("Celulares");
        
        Categoria categoria2 = new Categoria();
        categoria2.setId(2);
        categoria2.setNome("Televisores");        
        
        produtos.add( new Produto() );
        produtos.get(0).setId(1L);
        produtos.get(0).setNome("iphone");
        produtos.get(0).setPreçoUnitário(9999.99);
        produtos.get(0).setCategoria(categoria1);
        
        produtos.add( new Produto() );
        produtos.get(1).setId(2L);
        produtos.get(1).setNome("Samsung Galaxy");
        produtos.get(1).setPreçoUnitário(1499.99);        
        produtos.get(1).setCategoria(categoria1);
                
        
        
        produtos.add( new Produto() );
        produtos.get(2).setId(2L);
        produtos.get(2).setNome("TV 60' Panasonic");
        produtos.get(2).setPreçoUnitário(4000.99);
        produtos.get(2).setCategoria(categoria2);
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

    @Override
    public List<Produto> obterTodosPorCategoria(int categoriaId)
    {
        List<Produto> prods;
        prods = produtos.stream()
                        .filter(p -> p.getCategoria().getId() == categoriaId)
                        .collect(Collectors.toList());
        
        return prods;           
    }

   

}
