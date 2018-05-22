package pe.bf.mail.ws;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.bf.bean.Email;
import pe.bf.mail.ejb.EmailEJB;

/**
 * Servlet implementation class EmailServlet
 */
@WebServlet(name = "servlet/Email", urlPatterns = { "/servlet/Email" })
public class EmailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	private EmailEJB emailEJB;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		sendMessage();
	}

	public void sendMessage() {
		String[] addressTo = {"xxx@company.com.pe"};
		String[] addressCc = {"xxx@gmail.com"};
		
		Email email = new Email();
		email.setTo(addressTo);
		email.setCc(addressCc);
		email.setAsunto("Asunto");
		email.setMensaje("Probando desde java...");
		
		emailEJB.enviarMailCreditoEfectivo(email);
	}

}
