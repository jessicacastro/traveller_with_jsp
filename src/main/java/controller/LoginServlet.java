package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import model.Usuario;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {
		String txtLogin = request.getParameter("txtLogin");
		String txtSenha = request.getParameter("txtSenha");
		
		String paginaDestino;
		
		if (txtLogin.equals("user") && txtSenha.equals("1234")) {
			Usuario usuario = new Usuario();
			usuario.setLogin("Gulliver");
			usuario.setNome("Oliver Gulliver");
			usuario.setEmail("oliver@traveller.com");
			
			request.getSession().setAttribute("User", usuario);
			paginaDestino = "/filtroVidaNoturna.jsp";
		} else {
			request.setAttribute("TipoErro", "voltaLogin");
			request.setAttribute("Mensagem", "Login não encontrado");
			paginaDestino = "/erro.jsp";
		}
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(paginaDestino);
		dispatcher.forward(request, response);
	}
}
