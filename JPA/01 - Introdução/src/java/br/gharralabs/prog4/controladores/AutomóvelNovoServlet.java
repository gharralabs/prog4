package br.gharralabs.prog4.controladores;

import br.gharralabs.prog4.modelos.Automóvel;
import br.gharralabs.prog4.modelos.AutomóvelManager;
import br.gharralabs.prog4.modelos.AutomóvelManagerImpl;
import br.gharralabs.prog4.modelos.Modelo;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AutomóvelNovoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        AutomóvelManager manager;
        manager = new AutomóvelManagerImpl();
                
        List<Modelo> modelos;
        modelos = manager.obterModelos();
        request.setAttribute("modelos", modelos );
        
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("/WEB-INF/visões/automóvel-novo-form.jsp");
        rd.forward(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
        String placa;
        placa = request.getParameter("placa");
        
        String anoFabricaçãoParametro;
        anoFabricaçãoParametro = request.getParameter("anoFabricacao");
        int anoFabricação = Integer.parseInt(anoFabricaçãoParametro);
        

        
        Automóvel auto;
        auto = new Automóvel();
        auto.setPlaca(placa);
        auto.setAnoFabricação(anoFabricação);
        
        request.setAttribute("auto", auto);
        
        AutomóvelManager manager;
        manager = new AutomóvelManagerImpl();
        manager.salvar(auto);
        
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("/WEB-INF/visões/automóvel-lista.jsp");
        rd.forward(request, response);
    }
}
