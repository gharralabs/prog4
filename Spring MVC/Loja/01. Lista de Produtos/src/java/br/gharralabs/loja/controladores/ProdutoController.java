package br.gharralabs.loja.controladores;

import br.gharralabs.loja.modelos.Produto;
import br.gharralabs.loja.repositórios.ProdutoRepositório;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ProdutoController {

    @Autowired
    private ProdutoRepositório repositório;
    
    @RequestMapping("/produto/listar")
    public ModelAndView listarProdutos()
    {
        ModelAndView mv;
        mv = new ModelAndView("produto-listar");
        List<Produto> produtos;
        produtos = repositório.obterTodos();
        mv.addObject("produtos", produtos);
        
        return mv;
    }
    
}
