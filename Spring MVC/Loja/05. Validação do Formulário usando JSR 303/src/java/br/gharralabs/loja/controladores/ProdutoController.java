package br.gharralabs.loja.controladores;

import br.gharralabs.loja.modelos.Produto;
import br.gharralabs.loja.repositórios.ProdutoRepositório;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ProdutoController {

    @Autowired
    private ProdutoRepositório repositório;
    
    @RequestMapping("/produto/listar")
    public ModelAndView listarProdutos()
    {
        
        List<Produto> produtos;
        produtos = repositório.obterTodos();
        
        ModelAndView mv;
        mv = new ModelAndView("produto-listar");
        mv.addObject("produtos", produtos);
        
        return mv;
    }
    
    @RequestMapping("/produto/{id}")
    public ModelAndView detalheProduto(@PathVariable("id") long id)
    {
        Produto produto;
        produto = repositório.obterPorId(id);
        
        ModelAndView mv;
        mv = new ModelAndView("produto-detalhe");
        mv.addObject("produto", produto);
        
        return mv;
    }
    
    @RequestMapping(value = "/produto/novo", 
                    method = RequestMethod.GET)
    public String novoProduto(Model model)
    {
        model.addAttribute("novoProduto", new Produto());
        return "produto-novo";
    }
    
    @RequestMapping(value = "/produto/novo",
                    method = RequestMethod.POST)
    public String adicionarProduto(@ModelAttribute("novoProduto") 
                                   @Valid
                                   Produto produto,
                                   BindingResult result){
        
        if(result.hasErrors())
            return "produto-novo";
        else
        {
            repositório.adicionar(produto);
            return "redirect:/produto/listar";
        }

    }
    
    
    
}
