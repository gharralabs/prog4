package br.gharralabs.prog4.controladores;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AutomóvelListarServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("/WEB-INF/visões/automóvel-lista");
        rd.forward(request, response);
    }
}
