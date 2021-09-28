package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import model.VidaNoturna;

@WebServlet("/escolherVidaNoturna")
public class VidaNoturnaServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {
		
		int intClassification = Integer.parseInt(request.getParameter("selectClassif"));
		System.out.println(intClassification);
		
		ArrayList<VidaNoturna> bd = new ArrayList<VidaNoturna>();
		
		bd.add(new VidaNoturna(1, "Rua Francisca Jos�, 23", 5, 250.99));
		bd.add(new VidaNoturna(2, "Rua Francisca Jos�, 24", 5, 200.99));
		bd.add(new VidaNoturna(3, "Rua Francisca Jos�, 25", 4, 150.99));
		bd.add(new VidaNoturna(4, "Rua Francisca Jos�, 26", 4, 160.99));
		bd.add(new VidaNoturna(5, "Rua Francisca Jos�, 27", 3, 120.99));
		bd.add(new VidaNoturna(6, "Rua Francisca Jos�, 28", 3, 110.99));
		bd.add(new VidaNoturna(7, "Rua Francisca Jos�, 29", 2, 90.99));
		bd.add(new VidaNoturna(8, "Rua Francisca Jos�, 30", 2, 80.99));
		bd.add(new VidaNoturna(9, "Rua Francisca Jos�, 31", 1, 50.99));
		bd.add(new VidaNoturna(10, "Rua Francisca Jos�, 32", 1, 40.99));
		
		ArrayList<Object> resultadoLista = new ArrayList<Object>();
		
		for(VidaNoturna local : bd) {
			if (local.getClassificacao() == intClassification) {
				resultadoLista.add(local);
			} else {
				continue;
			}
		}
		
		String paginaDestino = null;
		
		if (resultadoLista.isEmpty()) {
			request.setAttribute("Mensagem", "N�o encontramos locais com esta classifica��o!");
			paginaDestino = "/erro.jsp";
		} else {
			request.setAttribute("Locais", resultadoLista);
			paginaDestino = "/listarVidaNoturna.jsp";
		}
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(paginaDestino);
		dispatcher.forward(request, response);
	}
}
