package br.com.keemy.exercicio01servlet;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/cadastrar-cliente")
public class CadastarClienteServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = req.getParameter("nome");
        String cpf = req.getParameter("cpf");

        String  resposta = "O cliente %s, CPF: %s foi cadastrado com sucesso!";

        PrintWriter writer = resp.getWriter();
        writer.printf("<html><body>" +
                            "<p>" + resposta + "</p>" +
                            "<a href=\"cadastrarCliente.jsp\">Voltar</a>" +
                      "</body></html>", nome, cpf);
    }

    public void destroy() {
    }
}