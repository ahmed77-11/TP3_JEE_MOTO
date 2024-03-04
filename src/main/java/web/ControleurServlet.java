package web;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import motos.ImotoCatalogue;
import motos.MotoImp;
import motos.Moto;

@WebServlet(name = "cs", urlPatterns = { "/controleur" })
public class ControleurServlet extends HttpServlet {
	private ImotoCatalogue motocat;

	@Override
	public void init() throws ServletException {
		motocat = new MotoImp();
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String mc = request.getParameter("motCle");
		MotoModele mod = new MotoModele();
		mod.setMotCle(mc);
		List<Moto> motos = motocat.getMotosParMotCle(mc);
		mod.setProduits(motos);
		request.setAttribute("modele", mod);
		request.getRequestDispatcher("MotosView.jsp").forward(request, response);
	}
}
